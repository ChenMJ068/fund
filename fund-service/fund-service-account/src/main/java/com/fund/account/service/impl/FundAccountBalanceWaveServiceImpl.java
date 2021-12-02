package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountBalanceWaveMapper;
import com.fund.account.domain.FundAccountBalanceWave;
import com.fund.account.service.IFundAccountBalanceWaveService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountBalanceWaveServiceImpl implements IFundAccountBalanceWaveService 
{
    @Autowired
    private FundAccountBalanceWaveMapper fundAccountBalanceWaveMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountBalanceWave selectFundAccountBalanceWaveById(Integer id)
    {
        return fundAccountBalanceWaveMapper.selectFundAccountBalanceWaveById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountBalanceWave 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountBalanceWave> selectFundAccountBalanceWaveList(FundAccountBalanceWave fundAccountBalanceWave)
    {
        return fundAccountBalanceWaveMapper.selectFundAccountBalanceWaveList(fundAccountBalanceWave);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountBalanceWave 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountBalanceWave(FundAccountBalanceWave fundAccountBalanceWave)
    {
        fundAccountBalanceWave.setCreateTime(DateUtils.getNowDate());
        return fundAccountBalanceWaveMapper.insertFundAccountBalanceWave(fundAccountBalanceWave);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountBalanceWave 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountBalanceWave(FundAccountBalanceWave fundAccountBalanceWave)
    {
        fundAccountBalanceWave.setUpdateTime(DateUtils.getNowDate());
        return fundAccountBalanceWaveMapper.updateFundAccountBalanceWave(fundAccountBalanceWave);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountBalanceWaveByIds(Integer[] ids)
    {
        return fundAccountBalanceWaveMapper.deleteFundAccountBalanceWaveByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountBalanceWaveById(Integer id)
    {
        return fundAccountBalanceWaveMapper.deleteFundAccountBalanceWaveById(id);
    }
}
