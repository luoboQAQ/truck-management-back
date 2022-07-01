package top.lbqaq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author luoboQAQ
 * @Date 2022/7/1
 * Swagger3的配置类，访问/swagger-ui/查看文档
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean
    public Docket docket(Environment environment) {
        Profiles of = Profiles.of("dev", "test");
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(getApiInfo())
                //通过环境变量配置是否启用Swagger
                .enable(b)
                .select()
                //扫描指定包下的接口
                .apis(RequestHandlerSelectors.basePackage("top.lbqaq.controller"))
                .build();
    }

    /**
     * 配置swagger信息
     */
    private ApiInfo getApiInfo() {
        Contact contact = new Contact(" kila-polaris", "https://gitee.com/kila-polaris", "luoboqvq@gmail.com");
        return new ApiInfo(
                "TRUCK MANAGER API",
                "货推推 - 货物运输管理系统",
                "1.0",
                "https://www.lbqaq.top",
                contact,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
