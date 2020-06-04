package com.zht.cloud.entity;

import com.zht.cloud.domin.BaseEntity;

import java.util.Date;
import java.io.Serializable;

/**
 * 供应商地址表(FndAddressInfo)实体类
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
public class FndAddressInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 329076466533568237L;
    
    private Integer addressId;
    
    private Integer companyCode;
    /**
    * 国家
    */
    private String country;
    /**
    * 省
    */
    private String province;
    /**
    * 城市
    */
    private String city;
    /**
    * 详细地址
    */
    private String addressDetail;
    /**
    * 邮编
    */
    private String postCode;
    
    private String enabled;



    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

}