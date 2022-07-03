package top.lbqaq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.pojo.Goods;
import top.lbqaq.response.Result;
import top.lbqaq.service.GoodsService;
import top.lbqaq.service.OwnerService;

import javax.annotation.Resource;

/**
 * @author Gor
 */
@RestController
@RequestMapping("/goods")
@Api(tags = "货物管理")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private OwnerService ownerService;

    @ApiOperation("添加货物")
    @PostMapping("/insertgoods")
    public Result insertOwner(String gname, Integer gnum, String gunit, String oname) {
        Goods goods = new Goods();
        goods.setOId(ownerService.selectByName(oname));
        goods.setGName(gname);
        goods.setGNum(gnum);
        goods.setGUnit(gunit);
//        owner.setOName(name);
//        owner.setOBalance(0);
        if (goodsService.insert(goods) == 0) {
            return new Result().setCode(1200).setMessage("失败");
        } else {
            return new Result().setCode(200).setMessage("成功");
        }

    }
}
