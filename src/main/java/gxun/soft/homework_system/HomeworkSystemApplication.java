package gxun.soft.homework_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"gxun.soft.homework_system.controller","gxun.soft.homework_system.service"})
public class HomeworkSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkSystemApplication.class, args);
    }

}
