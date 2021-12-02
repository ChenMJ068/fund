package com.fund.account.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fund.common.annotation.Log;
import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.enums.BusinessType;
import com.fund.account.domain.FundAccountInfo;
import com.fund.account.service.IFundAccountInfoService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/info")
public class FundAccountInfoController extends BaseController
{
    @Autowired
    private IFundAccountInfoService fundAccountInfoService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountInfo fundAccountInfo)
    {
        startPage();
        List<FundAccountInfo> list = fundAccountInfoService.selectFundAccountInfoList(fundAccountInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:info:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountInfo fundAccountInfo)
    {
        List<FundAccountInfo> list = fundAccountInfoService.selectFundAccountInfoList(fundAccountInfo);
        ExcelUtil<FundAccountInfo> util = new ExcelUtil<FundAccountInfo>(FundAccountInfo.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:info:query')")
    @GetMapping(value = "/{accId}")
    public AjaxResult getInfo(@PathVariable("accId") Integer accId)
    {
        return AjaxResult.success(fundAccountInfoService.selectFundAccountInfoByAccId(accId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountInfo fundAccountInfo)
    {
        return toAjax(fundAccountInfoService.insertFundAccountInfo(fundAccountInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountInfo fundAccountInfo)
    {
        return toAjax(fundAccountInfoService.updateFundAccountInfo(fundAccountInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{accIds}")
    public AjaxResult remove(@PathVariable Integer[] accIds)
    {
        return toAjax(fundAccountInfoService.deleteFundAccountInfoByAccIds(accIds));
    }
}
