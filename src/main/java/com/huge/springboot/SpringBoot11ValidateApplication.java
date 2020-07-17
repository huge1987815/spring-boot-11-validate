package com.huge.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages ="com.huge.springboot")
@MapperScan(value={"com.huge.springboot.dao"})
@EnableTransactionManagement
public class SpringBoot11ValidateApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot11ValidateApplication.class, args);
    }
}
