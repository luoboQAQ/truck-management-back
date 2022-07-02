package top.lbqaq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("sId")
    @ApiModelProperty(value = "运输单id")
    private Long sId;

    /**
     * 合同id
     */
    @JsonProperty("aId")
    @ApiModelProperty(value = "合同id")
    private Long aId;

    /**
     * 车辆id
     */
    @JsonProperty("cId")
    @ApiModelProperty(value = "车辆id")
    private Long cId;

    /**
     * 状态
     */
    @JsonProperty("sState")
    @ApiModelProperty(value = "状态")
    private String sState;

    /**
     * 运费
     */
    @JsonProperty("sCost")
    @ApiModelProperty(value = "运费")
    private Long sCost;

    /**
     * 运输数量
     */
    @JsonProperty("sNum")
    @ApiModelProperty(value = "运输数量")
    private Long sNum;
}