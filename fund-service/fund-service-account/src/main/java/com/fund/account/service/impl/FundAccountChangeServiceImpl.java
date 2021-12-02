package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountChangeMapper;
import com.fund.account.domain.FundAccountChange;
import com.fund.account.service.IFundAccountChangeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountChangeServiceImpl implements IFundAccountChangeService 
{
    @Autowired
    private FundAccountChangeMapper fundAccountChangeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountChange selectFundAccountChangeById(Integer id)
    {
        return fundAccountChangeMapper.selectFundAccountChangeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountChange> selectFundAccountChangeList(FundAccountChange fundAccountChange)
    {
        return fundAccountChangeMapper.selectFundAccountChangeList(fundAccountChange);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountChange(FundAccountChange fundAccountChange)
    {
        fundAccountChange.setCreateTime(DateUtils.getNowDate());
        return fundAccountChangeMapper.insertFundAccountChange(fundAccountChange);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountChange(FundAccountChange fundAccountChange)
    {
        fundAccountChange.setUpdateTime(DateUtils.getNowDate());
        return fundAccountChangeMapper.updateFundAccountChange(fundAccountChange);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountChangeByIds(Integer[] ids)
    {
        return fundAccountChangeMapper.deleteFundAccountChangeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountChangeById(Integer id)
    {
        return fundAccountChangeMapper.deleteFundAccountChangeById(id);
    }
}
