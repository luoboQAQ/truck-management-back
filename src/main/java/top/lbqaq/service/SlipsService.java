package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.SlipsMapper;
import top.lbqaq.pojo.Slips;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Service
public class SlipsService {

    @Resource
    private SlipsMapper slipsMapper;


    public int deleteByPrimaryKey(Long sId) {
        return slipsMapper.deleteByPrimaryKey(sId);
    }


    public int insert(Slips record) {
        return slipsMapper.insert(record);
    }


    public int insertSelective(Slips record) {
        return slipsMapper.insertSelective(record);
    }


    public Slips selectByPrimaryKey(Long sId) {
        return slipsMapper.selectByPrimaryKey(sId);
    }


    public int updateByPrimaryKeySelective(Slips record) {
        return slipsMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Slips record) {
        return slipsMapper.updateByPrimaryKey(record);
    }

}
