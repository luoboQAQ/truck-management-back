package top.lbqaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.pojo.Slips;
import top.lbqaq.response.Result;
import top.lbqaq.service.SlipsService;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/3
 */
@RestController
@RequestMapping("/slips")
@Api(tags = "运输单相关接口")
public class SlipsController {
    @Resource
    private SlipsService slipsService;

    @PostMapping("/insertSlips")
    @ApiOperation("插入运输单信息")
    public Result insertSlips(@RequestBody Slips slips) {
        slips.setSState("待出发");
        if (slipsService.insertSelective(slips) == 0) {
            return new Result().setCode(1200).setMessage("插入失败");
        } else {
            return new Result().setCode(200).setMessage("插入成功");
        }
    }

    @PostMapping("/updateSlips")
    @ApiOperation("更新运输单信息")
    public Result updateSlips(@RequestBody Slips slips) {
        if (slipsService.updateByPrimaryKeySelective(slips) == 0) {
            return new Result().setCode(1200).setMessage("更新失败");
        } else {
            return new Result().setCode(200).setMessage("更新成功");
        }
    }
}
