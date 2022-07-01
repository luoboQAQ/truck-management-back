package top.lbqaq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 货物
 */
@ApiModel(value = "货物")
@Data
public class Goods {
    /**
     * 货物id
     */
    @ApiModelProperty(value = "货物id")
    private Long gId;

    /**
     * 货物名称
     */
    @ApiModelProperty(value = "货物名称")
    private String gName;

    /**
     * 货物数量
     */
    @ApiModelProperty(value = "货物数量")
    private Integer gNum;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位")
    private String gUnit;

    /**
     * 货主id
     */
    @ApiModelProperty(value = "货主id")
    private Long gOid;
}