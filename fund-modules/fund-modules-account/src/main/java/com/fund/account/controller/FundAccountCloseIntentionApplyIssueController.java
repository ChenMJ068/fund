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
import com.fund.account.domain.FundAccountCloseIntentionApplyIssue;
import com.fund.account.service.IFundAccountCloseIntentionApplyIssueService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/issue")
public class FundAccountCloseIntentionApplyIssueController extends BaseController
{
    @Autowired
    private IFundAccountCloseIntentionApplyIssueService fundAccountCloseIntentionApplyIssueService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:issue:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        startPage();
        List<FundAccountCloseIntentionApplyIssue> list = fundAccountCloseIntentionApplyIssueService.selectFundAccountCloseIntentionApplyIssueList(fundAccountCloseIntentionApplyIssue);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:issue:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        List<FundAccountCloseIntentionApplyIssue> list = fundAccountCloseIntentionApplyIssueService.selectFundAccountCloseIntentionApplyIssueList(fundAccountCloseIntentionApplyIssue);
        ExcelUtil<FundAccountCloseIntentionApplyIssue> util = new ExcelUtil<FundAccountCloseIntentionApplyIssue>(FundAccountCloseIntentionApplyIssue.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:issue:query')")
    @GetMapping(value = "/{billId}")
    public AjaxResult getInfo(@PathVariable("billId") Integer billId)
    {
        return AjaxResult.success(fundAccountCloseIntentionApplyIssueService.selectFundAccountCloseIntentionApplyIssueByBillId(billId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:issue:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        return toAjax(fundAccountCloseIntentionApplyIssueService.insertFundAccountCloseIntentionApplyIssue(fundAccountCloseIntentionApplyIssue));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:issue:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        return toAjax(fundAccountCloseIntentionApplyIssueService.updateFundAccountCloseIntentionApplyIssue(fundAccountCloseIntentionApplyIssue));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:issue:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{billIds}")
    public AjaxResult remove(@PathVariable Integer[] billIds)
    {
        return toAjax(fundAccountCloseIntentionApplyIssueService.deleteFundAccountCloseIntentionApplyIssueByBillIds(billIds));
    }
}
