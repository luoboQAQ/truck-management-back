package top.lbqaq.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 合同
 */
@ApiModel(value = "合同")
@Data
public class Aggrement {
    /**
     * 合同id
     */
    @JsonProperty("aId")
    @ApiModelProperty(value = "合同id")
    private Long aId;

    /**
     * 总花费(单位：分)
     */
    @JsonProperty("aCost")
    @ApiModelProperty(value = "总花费(单位：分)")
    private Long aCost;

    /**
     * 货物id
     */
    @JsonProperty("gId")
    @ApiModelProperty(value = "货物id")
    private Long gId;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date aTransdate;

    /**
     * 剩余货物数量
     */
    @JsonProperty("aRemnum")
    @ApiModelProperty(value = "剩余货物数量")
    private Long aRemnum;
}