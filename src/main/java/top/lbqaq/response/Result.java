package top.lbqaq.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 统一响应对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel("统一响应对象")
public class Result {
    @ApiModelProperty("状态码")
    private int code;

    @ApiModelProperty("信息")
    private String message;

    @ApiModelProperty("数据")
    private Object data;

    @ApiModelProperty("总数据量")
    private long count;
}
