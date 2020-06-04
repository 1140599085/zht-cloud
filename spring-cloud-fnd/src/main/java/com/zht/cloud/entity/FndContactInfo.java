package com.zht.cloud.entity;

import com.zht.cloud.domin.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 供应商联系人表(FndContactInfo)实体类
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
public class FndContactInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 862526097404158485L;
    
    private Integer contactId;
    
    private Integer companyCode;
    /**
    * 联系人姓名
    */
    private String contactName;
    /**
    * 联系人性别
    */
    private String contactSex;
    /**
    * 职位
    */
    private String position;
    /**
    * 电话
    */
    private String phone;
    /**
    * 邮箱
    */
    private String email;
    
    private String enabled;
    /**
    * 默认联系人
    */
    private String defaultFlag;


    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSex() {
        return contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }

}