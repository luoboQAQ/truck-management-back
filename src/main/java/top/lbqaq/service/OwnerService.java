package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.OwnerMapper;
import top.lbqaq.pojo.Owner;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Service
public class OwnerService {

    @Resource
    private OwnerMapper ownerMapper;


    public int deleteByPrimaryKey(Long oId) {
        return ownerMapper.deleteByPrimaryKey(oId);
    }


    public int insert(Owner record) {
        return ownerMapper.insert(record);
    }


    public int insertSelective(Owner record) {
        return ownerMapper.insertSelective(record);
    }


    public Owner selectByPrimaryKey(Long oId) {
        return ownerMapper.selectByPrimaryKey(oId);
    }

    public long selectByName(String oname) {
        return ownerMapper.selectByName(oname);
    }

    public int updateByPrimaryKeySelective(Owner record) {
        return ownerMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Owner record) {
        return ownerMapper.updateByPrimaryKey(record);
    }

    public int countByName(String name) {
        return ownerMapper.countByName(name);
    }
}
