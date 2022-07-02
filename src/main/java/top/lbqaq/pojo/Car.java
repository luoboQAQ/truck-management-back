package top.lbqaq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("cId")
    @ApiModelProperty(value = "车辆id")
    private Long cId;

    /**
     * 车主姓名
     */
    @JsonProperty("cName")
    @ApiModelProperty(value = "车主姓名")
    private String cName;

    /**
     * 运输公司
     */
    @JsonProperty("cCom")
    @ApiModelProperty(value = "运输公司")
    private String cCom;

    /**
     * 最大运输量
     */
    @JsonProperty("cMax")
    @ApiModelProperty(value = "最大运输量")
    private Integer cMax;

    /**
     * 车牌号
     */
    @JsonProperty("cLicense")
    @ApiModelProperty(value = "车牌号")
    private String cLicense;

    /**
     * 参数
     */
    @JsonProperty("cParameter")
    @ApiModelProperty(value = "参数")
    private String cParameter;

    /**
     * 好评次数
     */
    @JsonProperty("cGoodnum")
    @ApiModelProperty(value = "好评次数")
    private Integer cGoodnum;

    /**
     * 差评次数
     */
    @JsonProperty("cBadnum")
    @ApiModelProperty(value = "差评次数")
    private Integer cBadnum;
}