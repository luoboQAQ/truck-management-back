package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.CarMapper;
import top.lbqaq.pojo.Car;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 */
@Service
public class CarService {

    @Resource
    private CarMapper carMapper;


    public int deleteByPrimaryKey(Long cId) {
        return carMapper.deleteByPrimaryKey(cId);
    }


    public int insert(Car record) {
        return carMapper.insert(record);
    }


    public int insertSelective(Car record) {
        return carMapper.insertSelective(record);
    }


    public Car selectByPrimaryKey(Long cId) {
        return carMapper.selectByPrimaryKey(cId);
    }


    public int updateByPrimaryKeySelective(Car record) {
        return carMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Car record) {
        return carMapper.updateByPrimaryKey(record);
    }

    /**
     * 增加好/差评
     *
     * @param cId    司机id
     * @param isGood 是否为好评
     * @return 操作影响的行数
     */
    public int addFeedBack(Long cId, boolean isGood) {
        if (isGood) {
            return carMapper.addGoodNumByCid(cId);
        } else {
            return carMapper.addBadNumByCid(cId);
        }
    }
}
