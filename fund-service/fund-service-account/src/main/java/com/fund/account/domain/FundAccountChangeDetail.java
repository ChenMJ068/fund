package com.fund.account.domain;

import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_change_detail
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountChangeDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 申请单ID，关联acc_change_apply.id */
    @Excel(name = "申请单ID，关联acc_change_apply.id")
    private Integer applyId;

    /** 修改类型 1：账户名称 、2：所属机构、3：开户行、4：账户法人、5：币种、6：账户属性、7：直连模式、8：账户用途 */
    @Excel(name = "修改类型 1：账户名称 、2：所属机构、3：开户行、4：账户法人、5：币种、6：账户属性、7：直连模式、8：账户用途")
    private Integer type;

    /** 旧值（id) */
    @Excel(name = "旧值", readConverterExp = "旧值（id)")
    private String oldId;

    /** 旧值 */
    @Excel(name = "旧值")
    private String oldValue;

    /** 新值（id) */
    @Excel(name = "新值", readConverterExp = "新值（id)")
    private String newId;

    /** 新值 */
    @Excel(name = "新值")
    private String newValue;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setApplyId(Integer applyId) 
    {
        this.applyId = applyId;
    }

    public Integer getApplyId() 
    {
        return applyId;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setOldId(String oldId) 
    {
        this.oldId = oldId;
    }

    public String getOldId() 
    {
        return oldId;
    }
    public void setOldValue(String oldValue) 
    {
        this.oldValue = oldValue;
    }

    public String getOldValue() 
    {
        return oldValue;
    }
    public void setNewId(String newId) 
    {
        this.newId = newId;
    }

    public String getNewId() 
    {
        return newId;
    }
    public void setNewValue(String newValue) 
    {
        this.newValue = newValue;
    }

    public String getNewValue() 
    {
        return newValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("applyId", getApplyId())
            .append("type", getType())
            .append("oldId", getOldId())
            .append("oldValue", getOldValue())
            .append("newId", getNewId())
            .append("newValue", getNewValue())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
