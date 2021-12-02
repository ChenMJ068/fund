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
import com.fund.account.domain.FundAccountHisKeyword;
import com.fund.account.service.IFundAccountHisKeywordService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/keyword")
public class FundAccountHisKeywordController extends BaseController
{
    @Autowired
    private IFundAccountHisKeywordService fundAccountHisKeywordService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountHisKeyword fundAccountHisKeyword)
    {
        startPage();
        List<FundAccountHisKeyword> list = fundAccountHisKeywordService.selectFundAccountHisKeywordList(fundAccountHisKeyword);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountHisKeyword fundAccountHisKeyword)
    {
        List<FundAccountHisKeyword> list = fundAccountHisKeywordService.selectFundAccountHisKeywordList(fundAccountHisKeyword);
        ExcelUtil<FundAccountHisKeyword> util = new ExcelUtil<FundAccountHisKeyword>(FundAccountHisKeyword.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fundAccountHisKeywordService.selectFundAccountHisKeywordById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountHisKeyword fundAccountHisKeyword)
    {
        return toAjax(fundAccountHisKeywordService.insertFundAccountHisKeyword(fundAccountHisKeyword));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountHisKeyword fundAccountHisKeyword)
    {
        return toAjax(fundAccountHisKeywordService.updateFundAccountHisKeyword(fundAccountHisKeyword));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:keyword:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(fundAccountHisKeywordService.deleteFundAccountHisKeywordByIds(ids));
    }
}
