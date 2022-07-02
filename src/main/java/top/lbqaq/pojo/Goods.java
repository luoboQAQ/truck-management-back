package top.lbqaq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("gId")
    @ApiModelProperty(value = "货物id")
    private Long gId;

    /**
     * 货物名称
     */
    @JsonProperty("gName")
    @ApiModelProperty(value = "货物名称")
    private String gName;

    /**
     * 货物数量
     */
    @JsonProperty("gNum")
    @ApiModelProperty(value = "货物数量")
    private Integer gNum;

    /**
     * 单位
     */
    @JsonProperty("gUnit")
    @ApiModelProperty(value = "单位")
    private String gUnit;

    /**
     * 货主id
     */
    @JsonProperty("oId")
    @ApiModelProperty(value = "货主id")
    private Long oId;
}