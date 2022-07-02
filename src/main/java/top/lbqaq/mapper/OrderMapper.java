package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lbqaq.dto.OrderDTO;

import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 */
@Mapper
public interface OrderMapper {
    /**
     * 查询所有运输单
     *
     * @return 所有运输单
     */
    List<OrderDTO> getAllOrder();
}
