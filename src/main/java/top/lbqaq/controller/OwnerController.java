package top.lbqaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.pojo.Owner;
import top.lbqaq.response.Result;
import top.lbqaq.service.OwnerService;

import javax.annotation.Resource;

/**
 * @author Gor
 */
@RestController
@RequestMapping("/owner")
@Api(tags = "货主管理")
public class OwnerController {
    @Resource
    private OwnerService ownerService;

    @ApiOperation("添加货主")
    @GetMapping("/insertOwner")
    public Result insertOwner(String name) {
        Owner owner = new Owner();
        owner.setOName(name);
        owner.setOBalance(0);
        int count = ownerService.countByName(name);
        if (count == 1) {
            return new Result().setCode(200).setMessage("成功");

        }
        if (ownerService.insert(owner) == 0) {
            return new Result().setCode(1200).setMessage("失败");
        } else {
            return new Result().setCode(200).setMessage("成功");
        }

    }
}
