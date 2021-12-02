package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountHisBalance;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountHisBalanceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountHisBalance selectFundAccountHisBalanceById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountHisBalance> selectFundAccountHisBalanceList(FundAccountHisBalance fundAccountHisBalance);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountHisBalance(FundAccountHisBalance fundAccountHisBalance);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountHisBalance(FundAccountHisBalance fundAccountHisBalance);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountHisBalanceById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountHisBalanceByIds(Integer[] ids);
}
