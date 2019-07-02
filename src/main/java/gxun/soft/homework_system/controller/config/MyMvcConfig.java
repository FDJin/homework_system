package gxun.soft.homework_system.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addRedirectViewController("/","login");
        registry.addRedirectViewController("/login","login");
        registry.addRedirectViewController("/index","login");
    }
}
