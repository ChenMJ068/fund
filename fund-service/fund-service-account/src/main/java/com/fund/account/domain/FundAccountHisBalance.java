package com.fund.account.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_his_balance
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountHisBalance extends BaseEntity
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

    /** 账户余额 */
    @Excel(name = "账户余额")
    private BigDecimal bal;

    /** 账户可用余额 */
    @Excel(name = "账户可用余额")
    private BigDecimal availableBal;

    /** 冻结金额 */
    @Excel(name = "冻结金额")
    private BigDecimal frzAmt;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private Integer dataSource;

    /** 余额日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "余额日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date balDate;

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
    public void setBal(BigDecimal bal) 
    {
        this.bal = bal;
    }

    public BigDecimal getBal() 
    {
        return bal;
    }
    public void setAvailableBal(BigDecimal availableBal) 
    {
        this.availableBal = availableBal;
    }

    public BigDecimal getAvailableBal() 
    {
        return availableBal;
    }
    public void setFrzAmt(BigDecimal frzAmt) 
    {
        this.frzAmt = frzAmt;
    }

    public BigDecimal getFrzAmt() 
    {
        return frzAmt;
    }
    public void setDataSource(Integer dataSource) 
    {
        this.dataSource = dataSource;
    }

    public Integer getDataSource() 
    {
        return dataSource;
    }
    public void setBalDate(Date balDate) 
    {
        this.balDate = balDate;
    }

    public Date getBalDate() 
    {
        return balDate;
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
            .append("bal", getBal())
            .append("availableBal", getAvailableBal())
            .append("frzAmt", getFrzAmt())
            .append("dataSource", getDataSource())
            .append("balDate", getBalDate())
            .append("importTime", getImportTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
