package top.lbqaq.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.lbqaq.pojo.Goods;

import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Mapper
public interface GoodsMapper {
    /**
     * delete by primary key
     *
     * @param gId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long gId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Goods record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Goods record);

    /**
     * select by primary key
     *
     * @param gId primary key
     * @return object by primary key
     */
    Goods selectByPrimaryKey(Long gId);

    /**
     * select by primary key
     *
     * @param oId primary key
     * @return object by primary key
     */
    long selectByOid(Long oId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Goods record);

    List<Goods> selectAllByOid(long oid);
}