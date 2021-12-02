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
import com.fund.account.domain.FundAccountDataReport;
import com.fund.account.service.IFundAccountDataReportService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/report")
public class FundAccountDataReportController extends BaseController
{
    @Autowired
    private IFundAccountDataReportService fundAccountDataReportService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountDataReport fundAccountDataReport)
    {
        startPage();
        List<FundAccountDataReport> list = fundAccountDataReportService.selectFundAccountDataReportList(fundAccountDataReport);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:report:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountDataReport fundAccountDataReport)
    {
        List<FundAccountDataReport> list = fundAccountDataReportService.selectFundAccountDataReportList(fundAccountDataReport);
        ExcelUtil<FundAccountDataReport> util = new ExcelUtil<FundAccountDataReport>(FundAccountDataReport.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fundAccountDataReportService.selectFundAccountDataReportById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:report:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountDataReport fundAccountDataReport)
    {
        return toAjax(fundAccountDataReportService.insertFundAccountDataReport(fundAccountDataReport));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:report:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountDataReport fundAccountDataReport)
    {
        return toAjax(fundAccountDataReportService.updateFundAccountDataReport(fundAccountDataReport));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:report:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(fundAccountDataReportService.deleteFundAccountDataReportByIds(ids));
    }
}
