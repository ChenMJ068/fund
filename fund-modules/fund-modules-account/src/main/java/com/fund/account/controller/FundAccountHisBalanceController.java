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
import com.fund.account.domain.FundAccountHisBalance;
import com.fund.account.service.IFundAccountHisBalanceService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/balance")
public class FundAccountHisBalanceController extends BaseController
{
    @Autowired
    private IFundAccountHisBalanceService fundAccountHisBalanceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:balance:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountHisBalance fundAccountHisBalance)
    {
        startPage();
        List<FundAccountHisBalance> list = fundAccountHisBalanceService.selectFundAccountHisBalanceList(fundAccountHisBalance);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:balance:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountHisBalance fundAccountHisBalance)
    {
        List<FundAccountHisBalance> list = fundAccountHisBalanceService.selectFundAccountHisBalanceList(fundAccountHisBalance);
        ExcelUtil<FundAccountHisBalance> util = new ExcelUtil<FundAccountHisBalance>(FundAccountHisBalance.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:balance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fundAccountHisBalanceService.selectFundAccountHisBalanceById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:balance:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountHisBalance fundAccountHisBalance)
    {
        return toAjax(fundAccountHisBalanceService.insertFundAccountHisBalance(fundAccountHisBalance));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:balance:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountHisBalance fundAccountHisBalance)
    {
        return toAjax(fundAccountHisBalanceService.updateFundAccountHisBalance(fundAccountHisBalance));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:balance:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(fundAccountHisBalanceService.deleteFundAccountHisBalanceByIds(ids));
    }
}
