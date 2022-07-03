package top.lbqaq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import top.lbqaq.pojo.Aggrement;
import top.lbqaq.response.Result;
import top.lbqaq.service.AggrementService;
import top.lbqaq.service.GoodsService;
import top.lbqaq.service.OwnerService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Gor
 */
@RestController
@RequestMapping("/aggrement")
@Api(tags = "合同相关接口")
public class AggrementController {
    @Resource
    private OwnerService ownerService;
    @Resource
    private AggrementService aggrementService;
    @Resource
    private GoodsService goodsService;

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //是否严格解析时间 false则严格解析 true宽松解析
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @ApiOperation("合同部分录入")
    @PostMapping("/insertaggrement")
    public Result insertAggrement(String oname, String astart, String aend, Date transdate, String areccom, String aremnum) {
        Aggrement aggrement = new Aggrement();
        long oid = ownerService.selectByName(oname.replace("\"", ""));
        long gid = goodsService.selectByOid(oid);
        aggrement.setAEnd(aend.replaceAll(String.valueOf('/'), " "));
        aggrement.setAStart(astart.replaceAll(String.valueOf('/'), " "));
        aggrement.setATransdate(transdate);
        aggrement.setGId(gid);
        aggrement.setACost(0L);
        aggrement.setAState("匹配中");
        aggrement.setAReccom(areccom);
        aggrement.setADistance(666);
        Date date = new Date(System.currentTimeMillis());
        aggrement.setACreatdate(date);
        aggrement.setARemnum(Long.valueOf(aremnum.replace("\"", "")));

        if (aggrementService.insert(aggrement) == 0) {
            return new Result().setCode(1200).setMessage("失败");
        }
        return new Result().setCode(200).setMessage("成功");
    }

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

    @GetMapping("/selectByaState0")
    @ApiOperation("根据状态查询全部合同")
    public Result selectByaState0(Integer page, Integer size) {
        List<Aggrement> aggrements;
        boolean isHasNextPage = false;
        String aState = "匹配中";
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

    @ApiOperation("合同部分查询")
    @GetMapping("/selectaggrement")
    public Result selectAggrement(String oname) {
        long oid = ownerService.selectByName(oname);
        //long gid=goodsService.selectByOid(oid);
        List<Aggrement> aggrements = aggrementService.selectByOid(oid);
        if (oid == 0 || aggrements == null) {
            return new Result().setCode(1200).setMessage("失败");
        }
        return new Result().setCode(200).setMessage("成功").setData(aggrements);
    }
}
