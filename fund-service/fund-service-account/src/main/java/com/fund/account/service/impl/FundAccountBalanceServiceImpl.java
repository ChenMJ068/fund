package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountBalanceMapper;
import com.fund.account.domain.FundAccountBalance;
import com.fund.account.service.IFundAccountBalanceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountBalanceServiceImpl implements IFundAccountBalanceService 
{
    @Autowired
    private FundAccountBalanceMapper fundAccountBalanceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountBalance selectFundAccountBalanceById(Integer id)
    {
        return fundAccountBalanceMapper.selectFundAccountBalanceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountBalance> selectFundAccountBalanceList(FundAccountBalance fundAccountBalance)
    {
        return fundAccountBalanceMapper.selectFundAccountBalanceList(fundAccountBalance);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountBalance(FundAccountBalance fundAccountBalance)
    {
        fundAccountBalance.setCreateTime(DateUtils.getNowDate());
        return fundAccountBalanceMapper.insertFundAccountBalance(fundAccountBalance);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountBalance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountBalance(FundAccountBalance fundAccountBalance)
    {
        fundAccountBalance.setUpdateTime(DateUtils.getNowDate());
        return fundAccountBalanceMapper.updateFundAccountBalance(fundAccountBalance);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountBalanceByIds(Integer[] ids)
    {
        return fundAccountBalanceMapper.deleteFundAccountBalanceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountBalanceById(Integer id)
    {
        return fundAccountBalanceMapper.deleteFundAccountBalanceById(id);
    }
}
