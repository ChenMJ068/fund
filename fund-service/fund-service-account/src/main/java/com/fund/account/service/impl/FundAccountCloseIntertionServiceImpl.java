package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountCloseIntertionMapper;
import com.fund.account.domain.FundAccountCloseIntertion;
import com.fund.account.service.IFundAccountCloseIntertionService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountCloseIntertionServiceImpl implements IFundAccountCloseIntertionService 
{
    @Autowired
    private FundAccountCloseIntertionMapper fundAccountCloseIntertionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountCloseIntertion selectFundAccountCloseIntertionById(Integer id)
    {
        return fundAccountCloseIntertionMapper.selectFundAccountCloseIntertionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountCloseIntertion> selectFundAccountCloseIntertionList(FundAccountCloseIntertion fundAccountCloseIntertion)
    {
        return fundAccountCloseIntertionMapper.selectFundAccountCloseIntertionList(fundAccountCloseIntertion);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountCloseIntertion(FundAccountCloseIntertion fundAccountCloseIntertion)
    {
        fundAccountCloseIntertion.setCreateTime(DateUtils.getNowDate());
        return fundAccountCloseIntertionMapper.insertFundAccountCloseIntertion(fundAccountCloseIntertion);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountCloseIntertion(FundAccountCloseIntertion fundAccountCloseIntertion)
    {
        fundAccountCloseIntertion.setUpdateTime(DateUtils.getNowDate());
        return fundAccountCloseIntertionMapper.updateFundAccountCloseIntertion(fundAccountCloseIntertion);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountCloseIntertionByIds(Integer[] ids)
    {
        return fundAccountCloseIntertionMapper.deleteFundAccountCloseIntertionByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountCloseIntertionById(Integer id)
    {
        return fundAccountCloseIntertionMapper.deleteFundAccountCloseIntertionById(id);
    }
}
