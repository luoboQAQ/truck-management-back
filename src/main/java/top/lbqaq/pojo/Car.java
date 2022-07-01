package top.lbqaq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 货车
 */
@ApiModel(value = "货车")
@Data
public class Car {
    /**
     * 车辆id
     */
    @ApiModelProperty(value = "车辆id")
    private Long cId;

    /**
     * 车主姓名
     */
    @ApiModelProperty(value = "车主姓名")
    private String cName;

    /**
     * 运输公司
     */
    @ApiModelProperty(value = "运输公司")
    private String cCom;

    /**
     * 最大运输量
     */
    @ApiModelProperty(value = "最大运输量")
    private Integer cMax;

    /**
     * 车牌号
     */
    @ApiModelProperty(value = "车牌号")
    private String cLicense;

    /**
     * 参数
     */
    @ApiModelProperty(value = "参数")
    private String cParameter;

    /**
     * 好评次数
     */
    @ApiModelProperty(value = "好评次数")
    private Integer cGoodnum;

    /**
     * 差评次数
     */
    @ApiModelProperty(value = "差评次数")
    private Integer cBadnum;
}