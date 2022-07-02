package top.lbqaq.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yzj
 * @Date 2022/7/2
 */
@ApiModel(value = "签收回单")
@Data
public class SigningDTO {
    /**
     * 运输日期
     */
    @ApiModelProperty(value = "运输日期")
    private Date aTransdate;

    /**
     * 车牌号
     */
    @ApiModelProperty(value = "运输单号")
    private String cId;

    /**
     * 车牌号
     */
    @ApiModelProperty(value = "车牌号")
    private String cLicense;

    /**
     * 货物数量
     */
    @ApiModelProperty(value = "运输数量")
    private Long sNum;

    /**
     * 运输单状态
     */
    @ApiModelProperty(value = "运输单状态")
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
     * 拍照
     */
    @ApiModelProperty(value = "拍照")
    private String sPhoto;

}

