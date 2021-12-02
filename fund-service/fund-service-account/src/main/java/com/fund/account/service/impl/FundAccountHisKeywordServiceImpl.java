package com.fund.account.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountHisKeywordMapper;
import com.fund.account.domain.FundAccountHisKeyword;
import com.fund.account.service.IFundAccountHisKeywordService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountHisKeywordServiceImpl implements IFundAccountHisKeywordService 
{
    @Autowired
    private FundAccountHisKeywordMapper fundAccountHisKeywordMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountHisKeyword selectFundAccountHisKeywordById(Integer id)
    {
        return fundAccountHisKeywordMapper.selectFundAccountHisKeywordById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountHisKeyword 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountHisKeyword> selectFundAccountHisKeywordList(FundAccountHisKeyword fundAccountHisKeyword)
    {
        return fundAccountHisKeywordMapper.selectFundAccountHisKeywordList(fundAccountHisKeyword);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountHisKeyword 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountHisKeyword(FundAccountHisKeyword fundAccountHisKeyword)
    {
        return fundAccountHisKeywordMapper.insertFundAccountHisKeyword(fundAccountHisKeyword);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountHisKeyword 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountHisKeyword(FundAccountHisKeyword fundAccountHisKeyword)
    {
        return fundAccountHisKeywordMapper.updateFundAccountHisKeyword(fundAccountHisKeyword);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountHisKeywordByIds(Integer[] ids)
    {
        return fundAccountHisKeywordMapper.deleteFundAccountHisKeywordByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountHisKeywordById(Integer id)
    {
        return fundAccountHisKeywordMapper.deleteFundAccountHisKeywordById(id);
    }
}
