package top.lbqaq.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.lbqaq.dto.SigningDTO;
import top.lbqaq.dto.SigningDTO2;
import top.lbqaq.mapper.SignMapper;


import javax.annotation.Resource;
import java.util.Date;
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
    public List<SigningDTO> getSign(long num, Date date) {
        return signMapper.getSignByNumOrDate(num,date);
    }

    /**
     * 通过车牌号查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO> getSign(String license,Date date) {
        return signMapper.getSignByLicenseOrDate(license,date);
    }

    /**
     * 通过客户查询所有订货单
     *
     * @return 订货单
     */
    public List<SigningDTO2> getUnSign(String num) {
        return signMapper.getUnSign(num);
    }


}
