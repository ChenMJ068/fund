package com.fund.account.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fund.common.annotation.Excel;
import com.fund.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 fund_account_info
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public class FundAccountInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer accId;

    /** 账户号 */
    @Excel(name = "账户号")
    private String accNo;

    /** 账户名称 */
    @Excel(name = "账户名称")
    private String accName;

    /** 账户属性 */
    @Excel(name = "账户属性")
    private String accAttr;

    /** 账户用途 */
    @Excel(name = "账户用途")
    private String accPurpose;

    /** 开户日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开户日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date openDate;

    /** 法人信息 */
    @Excel(name = "法人信息")
    private String lawfullMan;

    /** 销户日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销户日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cancelDate;

    /** 币种id */
    @Excel(name = "币种id")
    private Integer currId;

    /** 账户银行cnaps编码 */
    @Excel(name = "账户银行cnaps编码")
    private String bankCnapsCode;

    /** 机构id */
    @Excel(name = "机构id")
    private Integer orgId;

    /** 交互方式（直连模式）1：直连 2：人工 */
    @Excel(name = "交互方式", readConverterExp = "直=连模式")
    private Integer interactiveMode;

    /** 备注 */
    @Excel(name = "备注")
    private String memo;

    /** 是否启用 */
    @Excel(name = "是否启用")
    private Integer isActivity;

    /** 是否销户确认 */
    @Excel(name = "是否销户确认")
    private Integer isCloseConfirm;

    /** 是否虚拟户 */
    @Excel(name = "是否虚拟户")
    private Integer isVirtual;

    /** 1、正常  2、销户 3、冻结 4、待录入 5、审批拒绝 */
    @Excel(name = "1、正常  2、销户 3、冻结 4、待录入 5、审批拒绝")
    private Integer status;

    /** 1: 定期  2: 活期 */
    @Excel(name = "1: 定期  2: 活期")
    private Integer depositsMode;

    /** 会计科目编码 */
    @Excel(name = "会计科目编码")
    private String subjectCode;

    /** 会计科目名称 */
    @Excel(name = "会计科目名称")
    private String subjectName;

    /** $column.columnComment */
    @Excel(name = "会计科目名称")
    private String bankcode;

    /** 银行编码 */
    @Excel(name = "银行编码")
    private String sapBankcode;

    /** 预留印鉴 */
    @Excel(name = "预留印鉴")
    private String reservedSeal;

    /** 预留印章 */
    @Excel(name = "预留印章")
    private String reservedSignet;

    /** 是否资金池 */
    @Excel(name = "是否资金池")
    private Integer capitalpool;

    /** 托管户投资指令预留章 */
    @Excel(name = "托管户投资指令预留章")
    private String orderReservedSignet;

    /** 托管户投资指令预留印鉴 */
    @Excel(name = "托管户投资指令预留印鉴")
    private String orderReservedSeal;

    /** 账务管理团队 */
    @Excel(name = "账务管理团队")
    private String financeManageTeam;

    /** 客户号 */
    @Excel(name = "客户号")
    private String customerNumber;

    /** 大额支付号 */
    @Excel(name = "大额支付号")
    private String bigPayNumber;

    /** 是否签订协定存款账户协议 */
    @Excel(name = "是否签订协定存款账户协议")
    private Integer ifsign;

    /** BU */
    @Excel(name = "BU")
    private String bu;

    /** 是否相关方 */
    @Excel(name = "是否相关方")
    private Integer connect;

    /** 分支机构代码-EAST */
    @Excel(name = "分支机构代码-EAST")
    private String branchOrgCode;

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
    public void setAccAttr(String accAttr) 
    {
        this.accAttr = accAttr;
    }

    public String getAccAttr() 
    {
        return accAttr;
    }
    public void setAccPurpose(String accPurpose) 
    {
        this.accPurpose = accPurpose;
    }

    public String getAccPurpose() 
    {
        return accPurpose;
    }
    public void setOpenDate(Date openDate) 
    {
        this.openDate = openDate;
    }

    public Date getOpenDate() 
    {
        return openDate;
    }
    public void setLawfullMan(String lawfullMan) 
    {
        this.lawfullMan = lawfullMan;
    }

    public String getLawfullMan() 
    {
        return lawfullMan;
    }
    public void setCancelDate(Date cancelDate) 
    {
        this.cancelDate = cancelDate;
    }

    public Date getCancelDate() 
    {
        return cancelDate;
    }
    public void setCurrId(Integer currId) 
    {
        this.currId = currId;
    }

    public Integer getCurrId() 
    {
        return currId;
    }
    public void setBankCnapsCode(String bankCnapsCode) 
    {
        this.bankCnapsCode = bankCnapsCode;
    }

    public String getBankCnapsCode() 
    {
        return bankCnapsCode;
    }
    public void setOrgId(Integer orgId) 
    {
        this.orgId = orgId;
    }

    public Integer getOrgId() 
    {
        return orgId;
    }
    public void setInteractiveMode(Integer interactiveMode) 
    {
        this.interactiveMode = interactiveMode;
    }

    public Integer getInteractiveMode() 
    {
        return interactiveMode;
    }
    public void setMemo(String memo) 
    {
        this.memo = memo;
    }

    public String getMemo() 
    {
        return memo;
    }
    public void setIsActivity(Integer isActivity) 
    {
        this.isActivity = isActivity;
    }

    public Integer getIsActivity() 
    {
        return isActivity;
    }
    public void setIsCloseConfirm(Integer isCloseConfirm) 
    {
        this.isCloseConfirm = isCloseConfirm;
    }

    public Integer getIsCloseConfirm() 
    {
        return isCloseConfirm;
    }
    public void setIsVirtual(Integer isVirtual) 
    {
        this.isVirtual = isVirtual;
    }

    public Integer getIsVirtual() 
    {
        return isVirtual;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDepositsMode(Integer depositsMode) 
    {
        this.depositsMode = depositsMode;
    }

    public Integer getDepositsMode() 
    {
        return depositsMode;
    }
    public void setSubjectCode(String subjectCode) 
    {
        this.subjectCode = subjectCode;
    }

    public String getSubjectCode() 
    {
        return subjectCode;
    }
    public void setSubjectName(String subjectName) 
    {
        this.subjectName = subjectName;
    }

    public String getSubjectName() 
    {
        return subjectName;
    }
    public void setBankcode(String bankcode) 
    {
        this.bankcode = bankcode;
    }

    public String getBankcode() 
    {
        return bankcode;
    }
    public void setSapBankcode(String sapBankcode) 
    {
        this.sapBankcode = sapBankcode;
    }

    public String getSapBankcode() 
    {
        return sapBankcode;
    }
    public void setReservedSeal(String reservedSeal) 
    {
        this.reservedSeal = reservedSeal;
    }

    public String getReservedSeal() 
    {
        return reservedSeal;
    }
    public void setReservedSignet(String reservedSignet) 
    {
        this.reservedSignet = reservedSignet;
    }

    public String getReservedSignet() 
    {
        return reservedSignet;
    }
    public void setCapitalpool(Integer capitalpool) 
    {
        this.capitalpool = capitalpool;
    }

    public Integer getCapitalpool() 
    {
        return capitalpool;
    }
    public void setOrderReservedSignet(String orderReservedSignet) 
    {
        this.orderReservedSignet = orderReservedSignet;
    }

    public String getOrderReservedSignet() 
    {
        return orderReservedSignet;
    }
    public void setOrderReservedSeal(String orderReservedSeal) 
    {
        this.orderReservedSeal = orderReservedSeal;
    }

    public String getOrderReservedSeal() 
    {
        return orderReservedSeal;
    }
    public void setFinanceManageTeam(String financeManageTeam) 
    {
        this.financeManageTeam = financeManageTeam;
    }

    public String getFinanceManageTeam() 
    {
        return financeManageTeam;
    }
    public void setCustomerNumber(String customerNumber) 
    {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() 
    {
        return customerNumber;
    }
    public void setBigPayNumber(String bigPayNumber) 
    {
        this.bigPayNumber = bigPayNumber;
    }

    public String getBigPayNumber() 
    {
        return bigPayNumber;
    }
    public void setIfsign(Integer ifsign) 
    {
        this.ifsign = ifsign;
    }

    public Integer getIfsign() 
    {
        return ifsign;
    }
    public void setBu(String bu) 
    {
        this.bu = bu;
    }

    public String getBu() 
    {
        return bu;
    }
    public void setConnect(Integer connect) 
    {
        this.connect = connect;
    }

    public Integer getConnect() 
    {
        return connect;
    }
    public void setBranchOrgCode(String branchOrgCode) 
    {
        this.branchOrgCode = branchOrgCode;
    }

    public String getBranchOrgCode() 
    {
        return branchOrgCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("accId", getAccId())
            .append("accNo", getAccNo())
            .append("accName", getAccName())
            .append("accAttr", getAccAttr())
            .append("accPurpose", getAccPurpose())
            .append("openDate", getOpenDate())
            .append("lawfullMan", getLawfullMan())
            .append("cancelDate", getCancelDate())
            .append("currId", getCurrId())
            .append("bankCnapsCode", getBankCnapsCode())
            .append("orgId", getOrgId())
            .append("interactiveMode", getInteractiveMode())
            .append("memo", getMemo())
            .append("isActivity", getIsActivity())
            .append("isCloseConfirm", getIsCloseConfirm())
            .append("isVirtual", getIsVirtual())
            .append("status", getStatus())
            .append("depositsMode", getDepositsMode())
            .append("subjectCode", getSubjectCode())
            .append("subjectName", getSubjectName())
            .append("bankcode", getBankcode())
            .append("sapBankcode", getSapBankcode())
            .append("reservedSeal", getReservedSeal())
            .append("reservedSignet", getReservedSignet())
            .append("capitalpool", getCapitalpool())
            .append("orderReservedSignet", getOrderReservedSignet())
            .append("orderReservedSeal", getOrderReservedSeal())
            .append("financeManageTeam", getFinanceManageTeam())
            .append("customerNumber", getCustomerNumber())
            .append("bigPayNumber", getBigPayNumber())
            .append("ifsign", getIfsign())
            .append("bu", getBu())
            .append("connect", getConnect())
            .append("branchOrgCode", getBranchOrgCode())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
