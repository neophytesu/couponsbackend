package com.su.coupons;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.su.coupons.domain.dao")
public class CouponsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponsApplication.class, args);
    }

}
