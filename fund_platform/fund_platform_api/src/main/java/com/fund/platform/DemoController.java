package com.fund.platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create class DemoController.java @version 1.0.0 by @author ChenMJ @date 2021-08-30 18:54:00
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "Hi, fund platform";
    }
}
