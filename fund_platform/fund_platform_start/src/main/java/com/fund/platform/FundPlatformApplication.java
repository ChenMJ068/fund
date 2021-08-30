package com.fund.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.fund.platform")
@EntityScan(basePackages = {"com.fund.platform"})
public class FundPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundPlatformApplication.class, args);
    }

}
