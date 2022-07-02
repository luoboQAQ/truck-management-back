package top.lbqaq.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 * 订单DTO，基于运输单生成
 */
@Data
public class OrderDTO {
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
     * 起点
     */
    @JsonProperty("aStart")
    @ApiModelProperty(value = "起点")
    private String aStart;

    /**
     * 终点
     */
    @JsonProperty("aEnd")
    @ApiModelProperty(value = "终点")
    private String aEnd;

    /**
     * 运输距离
     */
    @JsonProperty("aDistance")
    @ApiModelProperty(value = "运输距离")
    private Integer aDistance;

    /**
     * 合同创建日期
     */
    @JsonProperty("aCreatdate")
    @ApiModelProperty(value = "合同创建日期")
    private Date aCreatdate;

    /**
     * 运输日期
     */
    @JsonProperty("aTransdate")
    @ApiModelProperty(value = "运输日期")
    private Date aTransdate;

    /**
     * 车主姓名
     */
    @JsonProperty("cName")
    @ApiModelProperty(value = "车主姓名")
    private String cName;

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

    /**
     * 最大运输量
     */
    @JsonProperty("cMax")
    @ApiModelProperty(value = "最大运输量")
    private Integer cMax;
}
