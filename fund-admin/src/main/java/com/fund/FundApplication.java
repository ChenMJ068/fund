package com.fund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * create this class  @version 1.0.0 by @author ChenMJ
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FundApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(FundApplication.class, args);
        System.out.println("########### (♥◠‿◠)ﾉﾞ fund 程序启动成功  ლ(´ڡ`ლ)ﾞ ########### ");
    }
}
