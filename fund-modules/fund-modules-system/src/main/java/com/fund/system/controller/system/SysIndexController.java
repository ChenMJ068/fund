package com.fund.system.controller.system;

import com.fund.common.config.SystemConfig;
import com.fund.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * create this class  @version 1.0.0 by @author ChenMJ
 */
@RestController
public class SysIndexController
{
    /** 系统基础配置 */
    @Autowired
    private SystemConfig config;

    /**
     * 访问首页，提示语
     */
    @RequestMapping("/")
    public String index()
    {
        return StringUtils.format("欢迎使用{}后台管理框架，当前版本：v{}，请通过前端地址访问。", config.getName(), config.getVersion());
    }
}
