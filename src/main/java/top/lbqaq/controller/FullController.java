package top.lbqaq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.pojo.Full;
import top.lbqaq.response.Result;
import top.lbqaq.service.FullService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/2
 */
@RestController
@RequestMapping("/full")
@Api(tags = "所有信息查询")
public class FullController {

    @Resource
    FullService fullService;

    @GetMapping("/selectAll")
    @ApiOperation("获取全部信息")
    Result selectAll(Integer page, Integer size) {
        List<Full> fullList;
        boolean isHasNextPage = false;
        if (page == null || size == null) {
            fullList = fullService.selectAll();
        } else {
            PageHelper.startPage(page, size);
            fullList = fullService.selectAll();
            PageInfo<Full> pages = new PageInfo<>(fullList);
            isHasNextPage = pages.isHasNextPage();
        }
        return new Result().setCode(200).setMessage("成功").setData(fullList).setHasNextPage(isHasNextPage);
    }

    @GetMapping("/selectBySid")
    @ApiOperation("根据sid查询")
    Result selectBySid(@RequestParam("sId") Long sId) {
        List<Full> fulls = fullService.selectBySId(sId);
        if (fulls.isEmpty()) {
            return new Result().setCode(404).setMessage("结果为空");
        }
        return new Result().setCode(200).setMessage("成功").setData(fulls.get(0));
    }

}
