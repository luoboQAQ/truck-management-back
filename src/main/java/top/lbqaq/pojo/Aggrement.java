package top.lbqaq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
    @ApiModelProperty(value = "合同id")
    private Long aId;

    /**
     * 总花费(单位：分)
     */
    @ApiModelProperty(value = "总花费(单位：分)")
    private Long aCost;

    /**
     * 货物id
     */
    @ApiModelProperty(value = "货物id")
    private Long gId;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String aState;

    /**
     * 起点
     */
    @ApiModelProperty(value = "起点")
    private String aStart;

    /**
     * 终点
     */
    @ApiModelProperty(value = "终点")
    private String aEnd;

    /**
     * 收货公司
     */
    @ApiModelProperty(value = "收货公司")
    private String aReccom;

    /**
     * 运输距离
     */
    @ApiModelProperty(value = "运输距离")
    private Integer aDistance;

    /**
     * 合同创建日期
     */
    @ApiModelProperty(value = "合同创建日期")
    private Date aCreatdate;

    /**
     * 运输日期
     */
    @ApiModelProperty(value = "运输日期")
    private Date aTransdate;
}