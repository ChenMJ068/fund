package com.fund.account.domain;

import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_extra_info
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountExtraInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 账户id */
    @Excel(name = "账户id")
    private Integer accId;

    /** 类别编号 */
    @Excel(name = "类别编号")
    private String typeCode;

    /** 属性值 */
    @Excel(name = "属性值")
    private String value;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setAccId(Integer accId) 
    {
        this.accId = accId;
    }

    public Integer getAccId() 
    {
        return accId;
    }
    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }
    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getValue() 
    {
        return value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("accId", getAccId())
            .append("typeCode", getTypeCode())
            .append("value", getValue())
            .toString();
    }
}
