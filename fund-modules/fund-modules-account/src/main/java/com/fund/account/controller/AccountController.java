package com.fund.account.controller;

import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.core.page.TableDataInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * 账户信息
 * create class AccountController.java @version 1.0.0 by @author ChenMJ @date 2021-11-12 09:24:00
 */
@RestController
@RequestMapping("/account")
public class AccountController extends BaseController {


    /**`
     * 账户信息列表，根据条件筛选
     */
    public TableDataInfo list(){

        return getDataTable(new ArrayList<>());
    }

    /**
     * 新增账户
     */
    public AjaxResult add(){
        return AjaxResult.success();
    }

    /**
     * 账户信息详情
     */
    public AjaxResult detail(){
        return AjaxResult.success();
    }

    /**
     * 账户信息修改
     */
    public AjaxResult modify(){
        return AjaxResult.success();
    }

    /**
     * 删除账户
     */
    public AjaxResult delete(){
        return AjaxResult.success();
    }



}
