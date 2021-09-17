package com.fund.platform.controller;

import com.fund.platform.base.RespResultData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * create class LoginController.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespResultData login(){
        RespResultData resultData = new RespResultData();
        resultData.setRespCode("0000");
        resultData.setRespMessage("成功");

        Map<String,String> map = new HashMap<>();
        map.put("1","zhangsan");
        map.put("2","lishi");
/**
 *
 spring:
 datasource:
 hikari:
 driver-class-name: com.mysql.cj.jdbc.Driver
 jdbc-url: jdbc:mysql://47.101.143.248:3306/fund?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
 username: fund
 password: 2wsx@WSX
 minimum-idle: 5
 idle-timeout: 180000
 maximum-pool-size: 10
 auto-commit: true
 pool-name: MyHikariCP
 max-lifetime: 1800000
 connection-timeout: 30000
 connection-test-query: SELECT 1

 */
        resultData.setData(map);
        return resultData;
    }
}
