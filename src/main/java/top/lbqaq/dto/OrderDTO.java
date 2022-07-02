package top.lbqaq.dto;

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

    /**
     * 车主姓名
     */
    @ApiModelProperty(value = "车主姓名")
    private String cName;

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
