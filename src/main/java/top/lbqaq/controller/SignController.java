package top.lbqaq.controller;

import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.dto.SigningDTO;
import top.lbqaq.dto.SigningDTO2;
import top.lbqaq.response.Result;
import top.lbqaq.service.SignService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yzj
 * @Date 2022/7/2
 */
@RestController
@RequestMapping("/sign")
@Api(tags = "运输单签收")
public class SignController {
    @Resource
    private SignService signService;

    @ApiOperation("获取全部订单")
    @GetMapping("/getAllSign")
    public Result getAllSign(Integer page, Integer size) {
        List<SigningDTO> allSign;
        if (page == null || size == null) {
            allSign = signService.getAllSign();
        } else {
            PageHelper.startPage(page, size);
            allSign = signService.getAllSign();
        }
        return new Result().setCode(200).setMessage("成功").setData(allSign);
    }

    @ApiOperation("通过交货单号获取订单")
    @GetMapping("/getSign")
    public Result getSign(Integer page, Integer size, long num, Date date) {
        List<SigningDTO> Signs;
            if (page == null || size == null) {
                Signs = signService.getSign(num,date);
            } else {
                PageHelper.startPage(page, size);
                Signs = signService.getSign(num,date);
            }
        for (SigningDTO sign : Signs) {
            if ("已签收".equals(sign.getSState())) {
                sign.setSPhoto("已拍");
            } else {
                sign.setSPhoto("补拍");
            }
        }
        return new Result().setCode(200).setMessage("成功").setData(Signs);
    }

    @ApiOperation("通过车牌获取订单")
    @GetMapping("/getSign1")
    public Result getSign(Integer page, Integer size,String license,Date date) {
        List<SigningDTO> Signs;
            if (page == null || size == null) {
                Signs = signService.getSign(license,date);
            } else {
                PageHelper.startPage(page, size);
                Signs = signService.getSign(license,date);
            }
        for (SigningDTO sign : Signs) {
            if ("已签收".equals(sign.getSState())) {
                sign.setSPhoto("已拍");
            } else {
                sign.setSPhoto("补拍");
            }
        }
        return new Result().setCode(200).setMessage("成功").setData(Signs);
    }

    @ApiOperation("通过客户获取订单")
    @GetMapping("/getUnSign")
    public Result getUnSign(Integer page, Integer size,String name,Date date) {
        List<SigningDTO2> Signs;
            if (page == null || size == null) {
                Signs = signService.getUnSign(name);
            } else {
                PageHelper.startPage(page, size);
                Signs = signService.getUnSign(name);
            }
        return new Result().setCode(200).setMessage("成功").setData(Signs);
    }
}

