package top.lbqaq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 运输单
 */
@ApiModel(value = "运输单")
@Data
public class Slips {
    /**
     * 运输单id
     */
    @ApiModelProperty(value = "运输单id")
    private Long sId;

    /**
     * 合同id
     */
    @ApiModelProperty(value = "合同id")
    private Long aId;

    /**
     * 车辆id
     */
    @ApiModelProperty(value = "车辆id")
    private Long cId;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String sState;

    /**
     * 运费
     */
    @ApiModelProperty(value = "运费")
    private Long sCost;

    /**
     * 运输数量
     */
    @ApiModelProperty(value = "运输数量")
    private Long sNum;
}