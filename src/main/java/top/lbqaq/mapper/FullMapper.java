package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.lbqaq.pojo.Full;

import java.util.List;

@Mapper
public interface FullMapper {
    List<Full> selectBySId(@Param("sId") Long sId);

    List<Full> selectAll();
}