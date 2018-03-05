package com.edu.erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.edu.erp.mapper")
public class ErpWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErpWebApplication.class, args);
    }
}
