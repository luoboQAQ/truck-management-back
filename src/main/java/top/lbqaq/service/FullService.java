package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.mapper.FullMapper;
import top.lbqaq.pojo.Full;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FullService {

    @Resource
    private FullMapper fullMapper;


    public List<Full> selectBySId(Long sId) {
        return fullMapper.selectBySId(sId);
    }

    public List<Full> selectAll() {
        return fullMapper.selectAll();
    }

}
