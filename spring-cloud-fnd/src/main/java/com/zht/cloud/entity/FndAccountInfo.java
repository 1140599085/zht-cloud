package com.zht.cloud.entity;

import com.zht.cloud.domin.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 供应商账户信息(FndAccountInfo)实体类
 *
 * @author makejava
 * @since 2020-06-04 15:54:39
 */
public class FndAccountInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -15709697117619647L;
    
    private Integer accountId;
    
    private Integer companyCode;
    /**
    * 银行名称
    */
    private String bankName;
    /**
    * 支行信息
    */
    private String branchName;
    /**
    * 账户名称
    */
    private String accountName;
    /**
    * 银行账号
    */
    private String accountNum;
    
    private String enabled;


    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

}