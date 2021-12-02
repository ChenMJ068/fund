package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountTransaction;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountTransactionMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountTransaction selectFundAccountTransactionById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountTransaction> selectFundAccountTransactionList(FundAccountTransaction fundAccountTransaction);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountTransaction(FundAccountTransaction fundAccountTransaction);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountTransaction(FundAccountTransaction fundAccountTransaction);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountTransactionById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountTransactionByIds(Integer[] ids);
}
