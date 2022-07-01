package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lbqaq.pojo.Slips;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Mapper
public interface SlipsMapper {
    /**
     * delete by primary key
     *
     * @param sId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long sId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Slips record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Slips record);

    /**
     * select by primary key
     *
     * @param sId primary key
     * @return object by primary key
     */
    Slips selectByPrimaryKey(Long sId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Slips record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Slips record);
}