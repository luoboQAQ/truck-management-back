# 货物运输管理系统 - 后端

## 概述

该项目实现了对货物运输的数据信息综合展示交互功能。

包括寻找车辆、货主货物及部分合同信息录入、寻找货源、成交订单、货主资金申请、订单查询等功能。

扩展功能：在完成基本功能基础上增加用户评价功能，对于车主的服务货主可以进行评价。

## 开发指南

项目遵循了软件开发的三层架构的设计，表现层用于展示数据，业务层用于处理业务需求，持久层用于完成与数据库的交互。

具体来说，pojo层是数据库对应的JavaBean文件，mapper层提供与数据库的交互，service层调用mapper层进行具体业务的处理，controller层提供http接口，对访问控制进行转发，各类基本参数校验，或者不复用的业务简单处理等。

为保护隐私，包含数据库链接的配置文件没有上传，请自己创建`src/main/resources/application-dev.yml`并填入以下内容：

```yml
#开发环境

spring:
  #数据库配置
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://xxxxx:3306/track?serverTimezone=Asia/Shanghai
    username: xxx
    password: "xxx"
```

注意修改成自己数据库的配置

## 数据库

一共是5张表，下面是具体的建表语句

```sql
CREATE TABLE `aggrement`
(
    `a_id`        bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '合同id',
    `a_cost`      bigint                                                        NOT NULL COMMENT '总花费(单位：分)',
    `g_id`        bigint                                                        NOT NULL COMMENT '货物id',
    `a_state`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '状态',
    `a_start`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '起点',
    `a_end`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '终点',
    `a_reccom`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '收货公司',
    `a_distance`  int                                                           NOT NULL COMMENT '运输距离',
    `a_creatdate` datetime                                                      NOT NULL COMMENT '合同创建日期',
    `a_transdate` datetime DEFAULT NULL COMMENT '运输日期',
    `a_remnum`    bigint   DEFAULT NULL COMMENT '剩余货物数量',
    PRIMARY KEY (`a_id`) USING BTREE,
    KEY `g_id` (`g_id`),
    CONSTRAINT `aggrement_ibfk_1` FOREIGN KEY (`g_id`) REFERENCES `goods` (`g_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC COMMENT ='合同';
```

```sql
CREATE TABLE `car`
(
    `c_id`        bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '车辆id',
    `c_name`      varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车主姓名',
    `c_com`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '运输公司',
    `c_max`       int                                                           NOT NULL COMMENT '最大运输量',
    `c_license`   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车牌号',
    `c_parameter` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '参数',
    `c_goodNum`   int unsigned                                                  NOT NULL DEFAULT '0' COMMENT '好评次数',
    `c_badNum`    int unsigned                                                  NOT NULL DEFAULT '0' COMMENT '差评次数',
    PRIMARY KEY (`c_id`) USING BTREE,
    UNIQUE KEY `c_name` (`c_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC COMMENT ='货车';
```

```sql
CREATE TABLE `goods`
(
    `g_id`   bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '货物id',
    `g_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '货物名称',
    `g_num`  int                                                           NOT NULL COMMENT '货物数量',
    `g_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '单位',
    `o_id`   bigint                                                        NOT NULL COMMENT '货主id',
    PRIMARY KEY (`g_id`) USING BTREE,
    KEY `g_oid` (`o_id`),
    CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`o_id`) REFERENCES `owner` (`o_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC COMMENT ='货物';
```

```sql
CREATE TABLE `owner`
(
    `o_id`      bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '货主id',
    `o_name`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '货主名称',
    `o_balance` int                                                           NOT NULL COMMENT '余额',
    PRIMARY KEY (`o_id`) USING BTREE,
    UNIQUE KEY `o_name` (`o_name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC COMMENT ='货主';
```

```sql
CREATE TABLE `slips`
(
    `s_id`    bigint                                                        NOT NULL AUTO_INCREMENT COMMENT '运输单id',
    `a_id`    bigint                                                        NOT NULL COMMENT '合同id',
    `c_id`    bigint                                                        NOT NULL COMMENT '车辆id',
    `s_state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '状态',
    `s_cost`  bigint                                                        NOT NULL COMMENT '运费',
    `s_num`   bigint                                                        NOT NULL COMMENT '运输数量',
    PRIMARY KEY (`s_id`) USING BTREE,
    KEY `a_id` (`a_id`),
    KEY `c_id` (`c_id`),
    CONSTRAINT `slips_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `aggrement` (`a_id`),
    CONSTRAINT `slips_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `car` (`c_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='运输单';
```

## 开源许可

基于GPL3.0协议开源