package com.fund.account.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_close_intertion
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountCloseIntertion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 事项摘要 */
    @Excel(name = "事项摘要")
    private String memo;

    /** 事项说明 */
    @Excel(name = "事项说明")
    private String detail;

    /** 所属公司 */
    @Excel(name = "所属公司")
    private Integer orgId;

    /** 所属部门 */
    @Excel(name = "所属部门")
    private Integer deptId;

    /** 销户账户ID */
    @Excel(name = "销户账户ID")
    private Integer accId;

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

    /** 删除标示 */
    @Excel(name = "删除标示")
    private Integer deleteFlag;

    /** 乐观锁 */
    @Excel(name = "乐观锁")
    private Integer persistVersion;

    /** 0 */
    @Excel(name = "0")
    private Integer attachmentCount;

    /** 办结摘要 */
    @Excel(name = "办结摘要")
    private String finallyMemo;

    /** 反馈信息 */
    @Excel(name = "反馈信息")
    private String feedback;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }
    public void setOrgId(Integer orgId) 
    {
        this.orgId = orgId;
    }

    public Integer getOrgId() 
    {
        return orgId;
    }
    public void setDeptId(Integer deptId) 
    {
        this.deptId = deptId;
    }

    public Integer getDeptId() 
    {
        return deptId;
    }
    public void setAccId(Integer accId) 
    {
        this.accId = accId;
    }

    public Integer getAccId() 
    {
        return accId;
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
    public void setFinallyMemo(String finallyMemo) 
    {
        this.finallyMemo = finallyMemo;
    }

    public String getFinallyMemo() 
    {
        return finallyMemo;
    }
    public void setFeedback(String feedback) 
    {
        this.feedback = feedback;
    }

    public String getFeedback() 
    {
        return feedback;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memo", getMemo())
            .append("detail", getDetail())
            .append("orgId", getOrgId())
            .append("deptId", getDeptId())
            .append("accId", getAccId())
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
            .append("finallyMemo", getFinallyMemo())
            .append("feedback", getFeedback())
            .toString();
    }
}
