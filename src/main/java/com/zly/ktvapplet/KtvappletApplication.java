package com.zly.ktvapplet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.zly.ktvapplet.dao")
@EnableSwagger2
@ServletComponentScan("com.zly.ktvapplet.druid")
public class KtvappletApplication {

    public static void main(String[] args) {
        SpringApplication.run(KtvappletApplication.class, args);
    }

}

