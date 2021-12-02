package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountCloseIntentionApplyIssue;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountCloseIntentionApplyIssueMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param billId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountCloseIntentionApplyIssue selectFundAccountCloseIntentionApplyIssueByBillId(Integer billId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountCloseIntentionApplyIssue> selectFundAccountCloseIntentionApplyIssueList(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountCloseIntentionApplyIssue(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountCloseIntentionApplyIssue 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountCloseIntentionApplyIssue(FundAccountCloseIntentionApplyIssue fundAccountCloseIntentionApplyIssue);

    /**
     * 删除【请填写功能名称】
     * 
     * @param billId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountCloseIntentionApplyIssueByBillId(Integer billId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param billIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountCloseIntentionApplyIssueByBillIds(Integer[] billIds);
}
