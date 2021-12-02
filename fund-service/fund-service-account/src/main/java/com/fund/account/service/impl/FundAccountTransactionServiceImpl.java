package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountTransactionMapper;
import com.fund.account.domain.FundAccountTransaction;
import com.fund.account.service.IFundAccountTransactionService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountTransactionServiceImpl implements IFundAccountTransactionService 
{
    @Autowired
    private FundAccountTransactionMapper fundAccountTransactionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountTransaction selectFundAccountTransactionById(Integer id)
    {
        return fundAccountTransactionMapper.selectFundAccountTransactionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountTransaction> selectFundAccountTransactionList(FundAccountTransaction fundAccountTransaction)
    {
        return fundAccountTransactionMapper.selectFundAccountTransactionList(fundAccountTransaction);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountTransaction(FundAccountTransaction fundAccountTransaction)
    {
        fundAccountTransaction.setCreateTime(DateUtils.getNowDate());
        return fundAccountTransactionMapper.insertFundAccountTransaction(fundAccountTransaction);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountTransaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountTransaction(FundAccountTransaction fundAccountTransaction)
    {
        fundAccountTransaction.setUpdateTime(DateUtils.getNowDate());
        return fundAccountTransactionMapper.updateFundAccountTransaction(fundAccountTransaction);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountTransactionByIds(Integer[] ids)
    {
        return fundAccountTransactionMapper.deleteFundAccountTransactionByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountTransactionById(Integer id)
    {
        return fundAccountTransactionMapper.deleteFundAccountTransactionById(id);
    }
}
