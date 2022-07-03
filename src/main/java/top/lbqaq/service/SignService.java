package top.lbqaq.service;

import org.springframework.stereotype.Service;
import top.lbqaq.dto.SigningDTO;
import top.lbqaq.mapper.SignMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yzj
 * @Date 2022/7/2
 */
@Service
public class SignService {
    @Resource
    private SignMapper signMapper;

    /**
     * 查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO> getAllSign() {
        return signMapper.getAllSign();
    }


    /**
     * 通过运输单号查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO> getSign(Long num, String date) {
        return signMapper.getSignByNumOrDate(num, date);
    }

    /**
     * 通过车牌号查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO> getSign(String license, String date) {
        return signMapper.getSignByLicenseOrDate(license, date);
    }

    /**
     * 通过客户查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO> getUnSign(String name, String date) {
        return signMapper.getUnSign(name, date);
    }


    public int updateState(Long serial) {
        return signMapper.updateState(serial);
    }

    public int funApp(int numm,Long id) {
        return signMapper.fundApp(numm,id);
    }

    public int fundSelect(Long id) {
        return signMapper.fundSelect(id);
    }
}

