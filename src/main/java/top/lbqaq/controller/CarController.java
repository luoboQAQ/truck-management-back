package top.lbqaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.lbqaq.pojo.Car;
import top.lbqaq.response.Result;
import top.lbqaq.service.CarService;

import javax.annotation.Resource;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 */
@RestController
@RequestMapping("/car")
@Api(tags = "车主相关接口")
public class CarController {

    @Resource
    private CarService carService;

    @PostMapping("/addFeedBack")
    @ApiOperation("添加好/差评")
    public Result addFeedBack(@RequestParam("cId") Long cId, @RequestParam("isGood") boolean isGood) {
        if (carService.addFeedBack(cId, isGood) == 0) {
            return new Result().setCode(1200).setMessage("操作失败");
        } else {
            return new Result().setCode(200).setMessage("成功");
        }
    }

    @GetMapping("/selectAll")
    @ApiOperation("查询全部车辆信息")
    public Result selectAll() {
        return new Result().setCode(200).setMessage("成功").setData(carService.selectAll());
    }

    @PostMapping("/insertCar")
    @ApiOperation("插入车辆信息")
    public Result insertCar(@RequestBody Car car) {
        car.setCGoodnum(0);
        car.setCBadnum(0);
        if (carService.insertSelective(car) == 0) {
            return new Result().setCode(1200).setMessage("插入失败");
        } else {
            Long cid = carService.selectCidByCName(car.getCName());
            return new Result().setCode(200).setMessage("成功").setData(cid);
        }
    }
}
