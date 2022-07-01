package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.GoodsMapper;
import top.lbqaq.pojo.Goods;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Service
public class GoodsService {

    @Resource
    private GoodsMapper goodsMapper;


    public int deleteByPrimaryKey(Long gId) {
        return goodsMapper.deleteByPrimaryKey(gId);
    }


    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }


    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }


    public Goods selectByPrimaryKey(Long gId) {
        return goodsMapper.selectByPrimaryKey(gId);
    }


    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

}
