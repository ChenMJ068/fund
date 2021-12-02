package com.fund.account.domain;

import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_his_keyword
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountHisKeyword extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 保收保支户非保单流水类型（1：利息收入2：手续费3：资金划拨） */
    @Excel(name = "保收保支户非保单流水类型", readConverterExp = "1=：利息收入2：手续费3：资金划拨")
    private Integer flowType;

    /** 对方账号关键字 */
    @Excel(name = "对方账号关键字")
    private String keyword;

    /** 标记类型（1对方账户号关键字，2摘要、附言关键字，3对方帐号、摘要、附言关键字） */
    @Excel(name = "标记类型", readConverterExp = "1=对方账户号关键字，2摘要、附言关键字，3对方帐号、摘要、附言关键字")
    private Integer flageType;

    /** 删除标志 */
    @Excel(name = "删除标志")
    private Integer deleteFlage;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setFlowType(Integer flowType) 
    {
        this.flowType = flowType;
    }

    public Integer getFlowType() 
    {
        return flowType;
    }
    public void setKeyword(String keyword) 
    {
        this.keyword = keyword;
    }

    public String getKeyword() 
    {
        return keyword;
    }
    public void setFlageType(Integer flageType) 
    {
        this.flageType = flageType;
    }

    public Integer getFlageType() 
    {
        return flageType;
    }
    public void setDeleteFlage(Integer deleteFlage) 
    {
        this.deleteFlage = deleteFlage;
    }

    public Integer getDeleteFlage() 
    {
        return deleteFlage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("flowType", getFlowType())
            .append("keyword", getKeyword())
            .append("flageType", getFlageType())
            .append("deleteFlage", getDeleteFlage())
            .toString();
    }
}
