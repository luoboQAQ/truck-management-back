package top.lbqaq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 货主
 */
@ApiModel(value = "货主")
@Data
public class Owner {
    /**
     * 货主id
     */
    @ApiModelProperty(value = "货主id")
    private Long oId;

    /**
     * 货主名称
     */
    @ApiModelProperty(value = "货主名称")
    private String oName;

    /**
     * 余额
     */
    @ApiModelProperty(value = "余额")
    private Integer oBalance;
}