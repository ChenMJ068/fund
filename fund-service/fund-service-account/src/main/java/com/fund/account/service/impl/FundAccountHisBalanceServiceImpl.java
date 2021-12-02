package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountHisBalanceMapper;
import com.fund.account.domain.FundAccountHisBalance;
import com.fund.account.service.IFundAccountHisBalanceService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountHisBalanceServiceImpl implements IFundAccountHisBalanceService 
{
    @Autowired
    private FundAccountHisBalanceMapper fundAccountHisBalanceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountHisBalance selectFundAccountHisBalanceById(Integer id)
    {
        return fundAccountHisBalanceMapper.selectFundAccountHisBalanceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountHisBalance> selectFundAccountHisBalanceList(FundAccountHisBalance fundAccountHisBalance)
    {
        return fundAccountHisBalanceMapper.selectFundAccountHisBalanceList(fundAccountHisBalance);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountHisBalance(FundAccountHisBalance fundAccountHisBalance)
    {
        fundAccountHisBalance.setCreateTime(DateUtils.getNowDate());
        return fundAccountHisBalanceMapper.insertFundAccountHisBalance(fundAccountHisBalance);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountHisBalance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountHisBalance(FundAccountHisBalance fundAccountHisBalance)
    {
        fundAccountHisBalance.setUpdateTime(DateUtils.getNowDate());
        return fundAccountHisBalanceMapper.updateFundAccountHisBalance(fundAccountHisBalance);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountHisBalanceByIds(Integer[] ids)
    {
        return fundAccountHisBalanceMapper.deleteFundAccountHisBalanceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountHisBalanceById(Integer id)
    {
        return fundAccountHisBalanceMapper.deleteFundAccountHisBalanceById(id);
    }
}
