package top.lbqaq.service;

import com.github.pagehelper.PageHelper;
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

    /**
     * 分页查询所有订货单
     *
     * @param page 页数
     * @param size 每页大小
     * @return 订货单
     */
    public List<OrderDTO> getAllOrder(int page, int size) {
        PageHelper.startPage(page, size);
        return orderMapper.getAllOrder();
    }
}
