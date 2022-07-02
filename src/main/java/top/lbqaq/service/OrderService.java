package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.dto.OrderDTO;
import top.lbqaq.mapper.OrderMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 */
@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;

    /**
     * 查询所有订货单
     *
     * @return 订货单
     */
    public List<OrderDTO> getAllOrder() {
        return orderMapper.getAllOrder();
    }
}
