package top.lbqaq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.lbqaq.pojo.Aggrement;
import top.lbqaq.response.Result;
import top.lbqaq.service.AggrementService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author luoboQAQ
 * @Date 2022/7/3
 */
@RestController
@RequestMapping("/aggrement")
@Api(tags = "合同相关接口")
public class AggrementController {
    @Resource
    private AggrementService aggrementService;

    @GetMapping("/selectByaState")
    @ApiOperation("根据状态查询全部合同")
    public Result selectByaState(Integer page, Integer size, @RequestParam("aState") String aState) {
        List<Aggrement> aggrements;
        boolean isHasNextPage = false;
        if (page == null || size == null) {
            aggrements = aggrementService.selectByaState(aState);
        } else {
            PageHelper.startPage(page, size);
            aggrements = aggrementService.selectByaState(aState);
            PageInfo<Aggrement> pageInfo = new PageInfo<>(aggrements);
            isHasNextPage = pageInfo.isHasNextPage();
        }
        return new Result().setCode(200).setMessage("成功").setData(aggrements).setHasNextPage(isHasNextPage);
    }
}
