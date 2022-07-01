package top.lbqaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * 测试用Controller
 */
@Controller
@ApiIgnore
public class TestController {
    @RequestMapping("/")
    public String toSwagger() {
        return "redirect:/swagger-ui/index.html";
    }
}
