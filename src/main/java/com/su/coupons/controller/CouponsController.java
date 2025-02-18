package com.su.coupons.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//优惠券控制器
@RestController
@RequestMapping("/coupons")
public class CouponsController {
    @PostMapping("/create")
    public ResponseEntity<String> create() {
        // 处理创建优惠券的逻辑
        return ResponseEntity.ok("创建优惠券成功");
    }
}
