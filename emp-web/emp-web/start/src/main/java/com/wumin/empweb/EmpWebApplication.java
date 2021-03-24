package com.wumin.empweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wumin.empweb.service","com.wumin.empweb.web"})
public class EmpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpWebApplication.class, args);
    }

}
