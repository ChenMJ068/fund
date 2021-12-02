package com.fund.account.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_data_report
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountDataReport extends BaseEntity
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

    /** 支出金额 */
    @Excel(name = "支出金额")
    private BigDecimal payAmount;

    /** 收入金额 */
    @Excel(name = "收入金额")
    private BigDecimal recvAmount;

    /** 统计日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "统计日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statisticsDate;

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
    public void setPayAmount(BigDecimal payAmount) 
    {
        this.payAmount = payAmount;
    }

    public BigDecimal getPayAmount() 
    {
        return payAmount;
    }
    public void setRecvAmount(BigDecimal recvAmount) 
    {
        this.recvAmount = recvAmount;
    }

    public BigDecimal getRecvAmount() 
    {
        return recvAmount;
    }
    public void setStatisticsDate(Date statisticsDate) 
    {
        this.statisticsDate = statisticsDate;
    }

    public Date getStatisticsDate() 
    {
        return statisticsDate;
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
            .append("payAmount", getPayAmount())
            .append("recvAmount", getRecvAmount())
            .append("statisticsDate", getStatisticsDate())
            .append("importTime", getImportTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
