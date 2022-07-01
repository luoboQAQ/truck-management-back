package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lbqaq.pojo.Owner;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Mapper
public interface OwnerMapper {
    /**
     * delete by primary key
     *
     * @param oId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long oId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Owner record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Owner record);

    /**
     * select by primary key
     *
     * @param oId primary key
     * @return object by primary key
     */
    Owner selectByPrimaryKey(Long oId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Owner record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Owner record);
}