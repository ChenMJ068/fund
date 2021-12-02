package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountDataReport;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountDataReportMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountDataReport selectFundAccountDataReportById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountDataReport> selectFundAccountDataReportList(FundAccountDataReport fundAccountDataReport);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountDataReport(FundAccountDataReport fundAccountDataReport);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountDataReport 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountDataReport(FundAccountDataReport fundAccountDataReport);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountDataReportById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountDataReportByIds(Integer[] ids);
}
