package com.fund.account.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_transaction
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountTransaction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 账户id */
    @Excel(name = "账户id")
    private Integer accId;

    /** 账户号 */
    @Excel(name = "账户号")
    private String accNo;

    /** 账户名称 */
    @Excel(name = "账户名称")
    private String accName;

    /** 银行大类 */
    @Excel(name = "银行大类")
    private String bankType;

    /** 收付方向1：付、2：收  */
    @Excel(name = "收付方向1：付、2：收 ")
    private Integer direction;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private BigDecimal amount;

    /** 对方账户号 */
    @Excel(name = "对方账户号")
    private String oppAccNo;

    /** 对方账户名称 */
    @Excel(name = "对方账户名称")
    private String oppAccName;

    /** 对方账户开户行名称 */
    @Excel(name = "对方账户开户行名称")
    private String oppAccBank;

    /** 摘要 */
    @Excel(name = "摘要")
    private String summary;

    /** 附言 */
    @Excel(name = "附言")
    private String postScript;

    /** 交易日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交易日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transDate;

    /** 交易时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transTime;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private Integer dataSource;

    /** 交易唯一标识 */
    @Excel(name = "交易唯一标识")
    private String identifier;

    /** 导入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "导入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date importTime;

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
    public void setAccNo(String accNo) 
    {
        this.accNo = accNo;
    }

    public String getAccNo() 
    {
        return accNo;
    }
    public void setAccName(String accName) 
    {
        this.accName = accName;
    }

    public String getAccName() 
    {
        return accName;
    }
    public void setBankType(String bankType) 
    {
        this.bankType = bankType;
    }

    public String getBankType() 
    {
        return bankType;
    }
    public void setDirection(Integer direction) 
    {
        this.direction = direction;
    }

    public Integer getDirection() 
    {
        return direction;
    }
    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }
    public void setOppAccNo(String oppAccNo) 
    {
        this.oppAccNo = oppAccNo;
    }

    public String getOppAccNo() 
    {
        return oppAccNo;
    }
    public void setOppAccName(String oppAccName) 
    {
        this.oppAccName = oppAccName;
    }

    public String getOppAccName() 
    {
        return oppAccName;
    }
    public void setOppAccBank(String oppAccBank) 
    {
        this.oppAccBank = oppAccBank;
    }

    public String getOppAccBank() 
    {
        return oppAccBank;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }

    public String getSummary() 
    {
        return summary;
    }
    public void setPostScript(String postScript) 
    {
        this.postScript = postScript;
    }

    public String getPostScript() 
    {
        return postScript;
    }
    public void setTransDate(Date transDate) 
    {
        this.transDate = transDate;
    }

    public Date getTransDate() 
    {
        return transDate;
    }
    public void setTransTime(Date transTime) 
    {
        this.transTime = transTime;
    }

    public Date getTransTime() 
    {
        return transTime;
    }
    public void setDataSource(Integer dataSource) 
    {
        this.dataSource = dataSource;
    }

    public Integer getDataSource() 
    {
        return dataSource;
    }
    public void setIdentifier(String identifier) 
    {
        this.identifier = identifier;
    }

    public String getIdentifier() 
    {
        return identifier;
    }
    public void setImportTime(Date importTime) 
    {
        this.importTime = importTime;
    }

    public Date getImportTime() 
    {
        return importTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("accId", getAccId())
            .append("accNo", getAccNo())
            .append("accName", getAccName())
            .append("bankType", getBankType())
            .append("direction", getDirection())
            .append("amount", getAmount())
            .append("oppAccNo", getOppAccNo())
            .append("oppAccName", getOppAccName())
            .append("oppAccBank", getOppAccBank())
            .append("summary", getSummary())
            .append("postScript", getPostScript())
            .append("transDate", getTransDate())
            .append("transTime", getTransTime())
            .append("dataSource", getDataSource())
            .append("identifier", getIdentifier())
            .append("importTime", getImportTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
