package com.fund.account.service;

import java.util.List;
import com.fund.account.domain.FundAccountBalance;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface IFundAccountBalanceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountBalance selectFundAccountBalanceById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountBalance> selectFundAccountBalanceList(FundAccountBalance fundAccountBalance);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountBalance(FundAccountBalance fundAccountBalance);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountBalance(FundAccountBalance fundAccountBalance);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFundAccountBalanceByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountBalanceById(Integer id);
}
