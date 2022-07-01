package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lbqaq.pojo.Aggrement;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Mapper
public interface AggrementMapper {
    /**
     * delete by primary key
     *
     * @param aId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long aId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Aggrement record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Aggrement record);

    /**
     * select by primary key
     *
     * @param aId primary key
     * @return object by primary key
     */
    Aggrement selectByPrimaryKey(Long aId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Aggrement record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Aggrement record);
}