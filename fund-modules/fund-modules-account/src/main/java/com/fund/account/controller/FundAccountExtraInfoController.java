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
import com.fund.account.domain.FundAccountExtraInfo;
import com.fund.account.service.IFundAccountExtraInfoService;
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
public class FundAccountExtraInfoController extends BaseController
{
    @Autowired
    private IFundAccountExtraInfoService fundAccountExtraInfoService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountExtraInfo fundAccountExtraInfo)
    {
        startPage();
        List<FundAccountExtraInfo> list = fundAccountExtraInfoService.selectFundAccountExtraInfoList(fundAccountExtraInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:info:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountExtraInfo fundAccountExtraInfo)
    {
        List<FundAccountExtraInfo> list = fundAccountExtraInfoService.selectFundAccountExtraInfoList(fundAccountExtraInfo);
        ExcelUtil<FundAccountExtraInfo> util = new ExcelUtil<FundAccountExtraInfo>(FundAccountExtraInfo.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fundAccountExtraInfoService.selectFundAccountExtraInfoById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountExtraInfo fundAccountExtraInfo)
    {
        return toAjax(fundAccountExtraInfoService.insertFundAccountExtraInfo(fundAccountExtraInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountExtraInfo fundAccountExtraInfo)
    {
        return toAjax(fundAccountExtraInfoService.updateFundAccountExtraInfo(fundAccountExtraInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:info:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(fundAccountExtraInfoService.deleteFundAccountExtraInfoByIds(ids));
    }
}
