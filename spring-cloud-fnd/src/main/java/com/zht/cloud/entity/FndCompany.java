package com.zht.cloud.entity;

import com.zht.cloud.domin.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 公司信息表(FndCompany)实体类
 *
 * @author 张洪涛
 * @since 2020-06-04 15:54:56
 */
public class FndCompany extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 635118846187714420L;
    
    private Integer companyId;
    /**
    * 供应商编码
    */
    private String companyCode;
    /**
    * 供应商描述
    */
    private String companyDesc;
    /**
    * 经营地址
    */
    private String address;
    /**
    * 企业性质
    */
    private String enterpriseNature;
    /**
    * 营业执照注册号
    */
    private String businessNumber;
    /**
    * 营业期限
    */
    private Date businessData;
    /**
    * 营业范围
    */
    private String businessContent;
    /**
    * 法人
    */
    private String legalName;
    /**
    * 法人证件号
    */
    private String legalNumber;
    /**
    * 性别
    */
    private String legalSex;
    /**
    * 生命周期
    */
    private String lifeStage;



    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public Date getBusinessData() {
        return businessData;
    }

    public void setBusinessData(Date businessData) {
        this.businessData = businessData;
    }

    public String getBusinessContent() {
        return businessContent;
    }

    public void setBusinessContent(String businessContent) {
        this.businessContent = businessContent;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalNumber() {
        return legalNumber;
    }

    public void setLegalNumber(String legalNumber) {
        this.legalNumber = legalNumber;
    }

    public String getLegalSex() {
        return legalSex;
    }

    public void setLegalSex(String legalSex) {
        this.legalSex = legalSex;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

}