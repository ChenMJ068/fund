package com.fund.platform;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create class DemoController.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:17:00
 */
@RestController
public class DemoController {

    @RequestMapping("/login")
    public String login(){
        return "hello demo";
    }
}
