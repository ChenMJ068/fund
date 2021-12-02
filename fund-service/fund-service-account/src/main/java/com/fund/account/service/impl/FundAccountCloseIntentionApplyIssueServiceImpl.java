package com.fund.account.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountCloseIntentionApplyIssueMapper;
import com.fund.account.domain.FundAccountCloseIntentionApplyIssue;
import com.fund.account.service.IFundAccountCloseIntentionApplyIssueService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountCloseIntentionApplyIssueServiceImpl implements IFundAccountCloseIntentionApplyIssueService 
{
    @Autowired
    private FundAccountCloseIntentionApplyIssueMapper fundAccountCloseIntentionApplyIssueMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param billId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountCloseIntentionApplyIssue selectFundAccountCloseIntentionApplyIssueByBillId(Integer billId)
    {
        return fundAccountCloseIntentionApplyIssueMapper.selectFundAccountCloseIntentionApplyIssueByBillId(billId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountCloseIntentionApplyIssue> selectFundAccountCloseIntentionApplyIssueList(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        return fundAccountCloseIntentionApplyIssueMapper.selectFundAccountCloseIntentionApplyIssueList(fundAccountCloseIntentionApplyIssue);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountCloseIntentionApplyIssue(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        return fundAccountCloseIntentionApplyIssueMapper.insertFundAccountCloseIntentionApplyIssue(fundAccountCloseIntentionApplyIssue);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountCloseIntentionApplyIssue(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue)
    {
        return fundAccountCloseIntentionApplyIssueMapper.updateFundAccountCloseIntentionApplyIssue(fundAccountCloseIntentionApplyIssue);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param billIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountCloseIntentionApplyIssueByBillIds(Integer[] billIds)
    {
        return fundAccountCloseIntentionApplyIssueMapper.deleteFundAccountCloseIntentionApplyIssueByBillIds(billIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param billId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountCloseIntentionApplyIssueByBillId(Integer billId)
    {
        return fundAccountCloseIntentionApplyIssueMapper.deleteFundAccountCloseIntentionApplyIssueByBillId(billId);
    }
}
