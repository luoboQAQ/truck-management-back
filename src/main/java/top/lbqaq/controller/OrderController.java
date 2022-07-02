package top.lbqaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.dto.OrderDTO;
import top.lbqaq.response.Result;
import top.lbqaq.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 */
@RestController
@RequestMapping("/order")
@Api(tags = "运输单(订单)管理")
public class OrderController {
    @Resource
    private OrderService orderService;

    @ApiOperation("获取全部订单")
    @GetMapping("/getAllOrder")
    public Result getAllOrder(Integer page, Integer size) {
        List<OrderDTO> allOrder;
        if (page == null || size == null) {
            allOrder = orderService.getAllOrder();
        } else {
            allOrder = orderService.getAllOrder(page, size);
        }
        return new Result().setCode(200).setMessage("成功").setData(allOrder);
    }
}
