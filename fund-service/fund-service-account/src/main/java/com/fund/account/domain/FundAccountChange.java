package com.fund.account.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_change
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountChange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 变更账户ID */
    @Excel(name = "变更账户ID")
    private Integer accId;

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

    /** 附件数量 */
    @Excel(name = "附件数量")
    private Integer attachmentCount;

    /** 反馈信息 */
    @Excel(name = "反馈信息")
    private String feedback;

    /** 变更补录状态,   1: 已保存 2：已提交、3：审批中、4：审批通过、5：审批拒绝、11:已完结、12：待补录 */
    @Excel(name = "变更补录状态,   1: 已保存 2：已提交、3：审批中、4：审批通过、5：审批拒绝、11:已完结、12：待补录")
    private Integer status;

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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("accId", getAccId())
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
            .append("status", getStatus())
            .toString();
    }
}
