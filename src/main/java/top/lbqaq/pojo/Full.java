package top.lbqaq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel(value = "`full`")
@Data
public class Full {
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

    /**
     * 总花费(单位：分)
     */
    @JsonProperty("aCost")
    @ApiModelProperty(value = "总花费(单位：分)")
    private Long aCost;

    /**
     * 状态
     */
    @JsonProperty("aState")
    @ApiModelProperty(value = "状态")
    private String aState;

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
     * 收货公司
     */
    @JsonProperty("aReccom")
    @ApiModelProperty(value = "收货公司")
    private String aReccom;

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
     * 剩余货物数量
     */
    @JsonProperty("aRemnum")
    @ApiModelProperty(value = "剩余货物数量")
    private Long aRemnum;

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

    /**
     * 货主名称
     */
    @JsonProperty("oName")
    @ApiModelProperty(value = "货主名称")
    private String oName;

    /**
     * 余额
     */
    @JsonProperty("oBalance")
    @ApiModelProperty(value = "余额")
    private Integer oBalance;
}