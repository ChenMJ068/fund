package com.fund.account.controller;

import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.core.page.TableDataInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * 账户冻结操作
 * create class AccountFreezeController.java @version 1.0.0 by @author ChenMJ @date 2021-11-12 09:56:00
 */
@RestController
@RequestMapping("/freeze")
public class AccountFreezeController extends BaseController {
    /**
     * 冻结账户信息列表，根据条件筛选
     */
    public TableDataInfo list(){

        return getDataTable(new ArrayList<>());
    }

    /**
     * 冻结账户信息详情
     */
    public AjaxResult detail(){
        return AjaxResult.success();
    }

    /**
     * 新增冻结账户
     */
    public AjaxResult add(){
        return AjaxResult.success();
    }

    /**
     * 冻结账户信息修改
     */
    public AjaxResult modify(){
        return AjaxResult.success();
    }

    /**
     * 删除冻结账户
     */
    public AjaxResult delete(){
        return AjaxResult.success();
    }
}
