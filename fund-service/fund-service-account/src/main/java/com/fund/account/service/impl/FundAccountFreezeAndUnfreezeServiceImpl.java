package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountFreezeAndUnfreezeMapper;
import com.fund.account.domain.FundAccountFreezeAndUnfreeze;
import com.fund.account.service.IFundAccountFreezeAndUnfreezeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountFreezeAndUnfreezeServiceImpl implements IFundAccountFreezeAndUnfreezeService 
{
    @Autowired
    private FundAccountFreezeAndUnfreezeMapper fundAccountFreezeAndUnfreezeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountFreezeAndUnfreeze selectFundAccountFreezeAndUnfreezeById(Integer id)
    {
        return fundAccountFreezeAndUnfreezeMapper.selectFundAccountFreezeAndUnfreezeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountFreezeAndUnfreeze> selectFundAccountFreezeAndUnfreezeList(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze)
    {
        return fundAccountFreezeAndUnfreezeMapper.selectFundAccountFreezeAndUnfreezeList(fundAccountFreezeAndUnfreeze);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountFreezeAndUnfreeze(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze)
    {
        fundAccountFreezeAndUnfreeze.setCreateTime(DateUtils.getNowDate());
        return fundAccountFreezeAndUnfreezeMapper.insertFundAccountFreezeAndUnfreeze(fundAccountFreezeAndUnfreeze);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountFreezeAndUnfreeze(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze)
    {
        fundAccountFreezeAndUnfreeze.setUpdateTime(DateUtils.getNowDate());
        return fundAccountFreezeAndUnfreezeMapper.updateFundAccountFreezeAndUnfreeze(fundAccountFreezeAndUnfreeze);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountFreezeAndUnfreezeByIds(Integer[] ids)
    {
        return fundAccountFreezeAndUnfreezeMapper.deleteFundAccountFreezeAndUnfreezeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountFreezeAndUnfreezeById(Integer id)
    {
        return fundAccountFreezeAndUnfreezeMapper.deleteFundAccountFreezeAndUnfreezeById(id);
    }
}
