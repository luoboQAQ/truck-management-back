package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.AggrementMapper;
import top.lbqaq.pojo.Aggrement;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Service
public class AggrementService {

    @Resource
    private AggrementMapper aggrementMapper;


    public int deleteByPrimaryKey(Long aId) {
        return aggrementMapper.deleteByPrimaryKey(aId);
    }


    public int insert(Aggrement record) {
        return aggrementMapper.insert(record);
    }


    public int insertSelective(Aggrement record) {
        return aggrementMapper.insertSelective(record);
    }


    public Aggrement selectByPrimaryKey(Long aId) {
        return aggrementMapper.selectByPrimaryKey(aId);
    }

    public List<Aggrement> selectByOid(Long oId) {
        return aggrementMapper.selectByOid(oId);
    }

    public int updateByPrimaryKeySelective(Aggrement record) {
        return aggrementMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Aggrement record) {
        return aggrementMapper.updateByPrimaryKey(record);
    }

    public List<Aggrement> selectByaState(String aState) {
        return aggrementMapper.selectByaState(aState);
    }
}

