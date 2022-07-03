package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.lbqaq.dto.SigningDTO;

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
    List<SigningDTO> getSignByLicenseOrDate(@Param("license") String license, @Param("date") String date);

    /**
     * 通过单号或者加上时间查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO> getSignByNumOrDate(@Param("Num") Long num, @Param("date") String date);

    /**
     * 通过客户查询所有运输单
     *
     * @return 所有运输单
     */
    List<SigningDTO> getUnSign(@Param("name") String name, @Param("date") String date);

    int updateState(Long serial);


    int fundApp(@Param("numm")int numm,@Param("id") Long id);

    int fundSelect(Long id);
}
