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
import com.fund.account.domain.FundAccountBalanceWave;
import com.fund.account.service.IFundAccountBalanceWaveService;
import com.fund.common.utils.poi.ExcelUtil;
import com.fund.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@RestController
@RequestMapping("/account/wave")
public class FundAccountBalanceWaveController extends BaseController
{
    @Autowired
    private IFundAccountBalanceWaveService fundAccountBalanceWaveService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:wave:list')")
    @GetMapping("/list")
    public TableDataInfo list(FundAccountBalanceWave fundAccountBalanceWave)
    {
        startPage();
        List<FundAccountBalanceWave> list = fundAccountBalanceWaveService.selectFundAccountBalanceWaveList(fundAccountBalanceWave);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('account:wave:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(FundAccountBalanceWave fundAccountBalanceWave)
    {
        List<FundAccountBalanceWave> list = fundAccountBalanceWaveService.selectFundAccountBalanceWaveList(fundAccountBalanceWave);
        ExcelUtil<FundAccountBalanceWave> util = new ExcelUtil<FundAccountBalanceWave>(FundAccountBalanceWave.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('account:wave:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Integer id)
    {
        return AjaxResult.success(fundAccountBalanceWaveService.selectFundAccountBalanceWaveById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:wave:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FundAccountBalanceWave fundAccountBalanceWave)
    {
        return toAjax(fundAccountBalanceWaveService.insertFundAccountBalanceWave(fundAccountBalanceWave));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:wave:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FundAccountBalanceWave fundAccountBalanceWave)
    {
        return toAjax(fundAccountBalanceWaveService.updateFundAccountBalanceWave(fundAccountBalanceWave));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('account:wave:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Integer[] ids)
    {
        return toAjax(fundAccountBalanceWaveService.deleteFundAccountBalanceWaveByIds(ids));
    }
}
