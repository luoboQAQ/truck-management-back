package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.lbqaq.dto.SigningDTO;
import top.lbqaq.dto.SigningDTO2;

import java.util.Date;
import java.util.List;

/**
 * @author yzj
 * @Date 2022/7/2
 */
@Mapper
public interface SignMapper {
    /**
     * 查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO> getAllSign();

    /**
     * 通过车牌或者加上时间查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO>  getSignByLicenseOrDate(@Param("license")String license,@Param("date") Date date);
    /**
     * 通过单号或者加上时间查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO>  getSignByNumOrDate(@Param("Num")long num, @Param("date")Date date);
    /**
     * 通过客户查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO2> getUnSign(String num);
}
