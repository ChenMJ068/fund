package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountDataReportMapper;
import com.fund.account.domain.FundAccountDataReport;
import com.fund.account.service.IFundAccountDataReportService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountDataReportServiceImpl implements IFundAccountDataReportService 
{
    @Autowired
    private FundAccountDataReportMapper fundAccountDataReportMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountDataReport selectFundAccountDataReportById(Integer id)
    {
        return fundAccountDataReportMapper.selectFundAccountDataReportById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountDataReport> selectFundAccountDataReportList(FundAccountDataReport fundAccountDataReport)
    {
        return fundAccountDataReportMapper.selectFundAccountDataReportList(fundAccountDataReport);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountDataReport(FundAccountDataReport fundAccountDataReport)
    {
        fundAccountDataReport.setCreateTime(DateUtils.getNowDate());
        return fundAccountDataReportMapper.insertFundAccountDataReport(fundAccountDataReport);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountDataReport(FundAccountDataReport fundAccountDataReport)
    {
        fundAccountDataReport.setUpdateTime(DateUtils.getNowDate());
        return fundAccountDataReportMapper.updateFundAccountDataReport(fundAccountDataReport);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountDataReportByIds(Integer[] ids)
    {
        return fundAccountDataReportMapper.deleteFundAccountDataReportByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountDataReportById(Integer id)
    {
        return fundAccountDataReportMapper.deleteFundAccountDataReportById(id);
    }
}
