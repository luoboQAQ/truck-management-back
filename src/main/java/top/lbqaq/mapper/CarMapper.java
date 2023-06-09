package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.lbqaq.pojo.Car;

import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Mapper
public interface CarMapper {
    /**
     * delete by primary key
     *
     * @param cId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long cId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Car record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Car record);

    /**
     * select by primary key
     *
     * @param cId primary key
     * @return object by primary key
     */
    Car selectByPrimaryKey(Long cId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Car record);

    int addGoodNumByCid(Long cId);

    int addBadNumByCid(Long cId);

    List<Car> selectAll();

    Long selectCidByCName(@Param("cName") String cName);

}