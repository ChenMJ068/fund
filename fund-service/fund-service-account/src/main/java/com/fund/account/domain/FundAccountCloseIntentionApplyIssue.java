package com.fund.account.domain;

import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_close_intention_apply_issue
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountCloseIntentionApplyIssue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 申请单ID，acc_close_intertion_apply.id */
    private Integer billId;

    /** 用户Id */
    private Integer userId;

    /** 分发次数 */
    @Excel(name = "分发次数")
    private Integer counts;

    public void setBillId(Integer billId) 
    {
        this.billId = billId;
    }

    public Integer getBillId() 
    {
        return billId;
    }
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setCounts(Integer counts) 
    {
        this.counts = counts;
    }

    public Integer getCounts() 
    {
        return counts;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("billId", getBillId())
            .append("userId", getUserId())
            .append("counts", getCounts())
            .toString();
    }
}
