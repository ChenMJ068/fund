package com.fund.account.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_logout
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountLogout extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 销户事项申请单ID，acc_close_intertion_apply.id */
    @Excel(name = "销户事项申请单ID，acc_close_intertion_apply.id")
    private Integer relationId;

    /** 销户账户ID */
    @Excel(name = "销户账户ID")
    private Integer accId;

    /** 销户日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销户日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date closeDate;

    /** 备注 */
    @Excel(name = "备注")
    private String memo;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyOn;

    /** 单据编号 */
    @Excel(name = "单据编号")
    private String serviceSerialNumber;

    /** 单据状态，1:已保存、2：已提交、3：审批中，4：审批通过、5：审批拒绝，11:已完结 */
    @Excel(name = "单据状态，1:已保存、2：已提交、3：审批中，4：审批通过、5：审批拒绝，11:已完结")
    private Integer serviceStatus;

    /** 0 */
    @Excel(name = "0")
    private Integer deleteFlag;

    /** 乐观锁 */
    @Excel(name = "乐观锁")
    private Integer persistVersion;

    /** 0 */
    @Excel(name = "0")
    private Integer attachmentCount;

    /** 反馈信息 */
    @Excel(name = "反馈信息")
    private String feedback;

    /** 当日账户信息 */
    @Excel(name = "当日账户信息")
    private String currdateaccMessage;

    /** 当日销户手续费 */
    @Excel(name = "当日销户手续费")
    private BigDecimal currdatecloseaccAmount;

    /** 账户余额转出至指定账户 */
    @Excel(name = "账户余额转出至指定账户")
    private String balrollAcc;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setRelationId(Integer relationId) 
    {
        this.relationId = relationId;
    }

    public Integer getRelationId() 
    {
        return relationId;
    }
    public void setAccId(Integer accId) 
    {
        this.accId = accId;
    }

    public Integer getAccId() 
    {
        return accId;
    }
    public void setCloseDate(Date closeDate) 
    {
        this.closeDate = closeDate;
    }

    public Date getCloseDate() 
    {
        return closeDate;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setApplyOn(Date applyOn) 
    {
        this.applyOn = applyOn;
    }

    public Date getApplyOn() 
    {
        return applyOn;
    }
    public void setServiceSerialNumber(String serviceSerialNumber) 
    {
        this.serviceSerialNumber = serviceSerialNumber;
    }

    public String getServiceSerialNumber() 
    {
        return serviceSerialNumber;
    }
    public void setServiceStatus(Integer serviceStatus) 
    {
        this.serviceStatus = serviceStatus;
    }

    public Integer getServiceStatus() 
    {
        return serviceStatus;
    }
    public void setDeleteFlag(Integer deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public Integer getDeleteFlag() 
    {
        return deleteFlag;
    }
    public void setPersistVersion(Integer persistVersion) 
    {
        this.persistVersion = persistVersion;
    }

    public Integer getPersistVersion() 
    {
        return persistVersion;
    }
    public void setAttachmentCount(Integer attachmentCount) 
    {
        this.attachmentCount = attachmentCount;
    }

    public Integer getAttachmentCount() 
    {
        return attachmentCount;
    }
    public void setFeedback(String feedback) 
    {
        this.feedback = feedback;
    }

    public String getFeedback() 
    {
        return feedback;
    }
    public void setCurrdateaccMessage(String currdateaccMessage) 
    {
        this.currdateaccMessage = currdateaccMessage;
    }

    public String getCurrdateaccMessage() 
    {
        return currdateaccMessage;
    }
    public void setCurrdatecloseaccAmount(BigDecimal currdatecloseaccAmount) 
    {
        this.currdatecloseaccAmount = currdatecloseaccAmount;
    }

    public BigDecimal getCurrdatecloseaccAmount() 
    {
        return currdatecloseaccAmount;
    }
    public void setBalrollAcc(String balrollAcc) 
    {
        this.balrollAcc = balrollAcc;
    }

    public String getBalrollAcc() 
    {
        return balrollAcc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("relationId", getRelationId())
            .append("accId", getAccId())
            .append("closeDate", getCloseDate())
            .append("memo", getMemo())
            .append("applyOn", getApplyOn())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("serviceSerialNumber", getServiceSerialNumber())
            .append("serviceStatus", getServiceStatus())
            .append("deleteFlag", getDeleteFlag())
            .append("persistVersion", getPersistVersion())
            .append("attachmentCount", getAttachmentCount())
            .append("feedback", getFeedback())
            .append("currdateaccMessage", getCurrdateaccMessage())
            .append("currdatecloseaccAmount", getCurrdatecloseaccAmount())
            .append("balrollAcc", getBalrollAcc())
            .toString();
    }
}
