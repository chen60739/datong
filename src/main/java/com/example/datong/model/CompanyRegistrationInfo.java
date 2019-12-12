package com.example.datong.model;


import java.util.Date;

/**
 * 公司注册登录类
 */
public class CompanyRegistrationInfo {

    private Integer unitId;
    //公司名称
    private String unitName;

    private String unitPhone;

    private String password;

    private String unitCountyCode;

    private String unitTownCode;

    private Integer unitTypeId;
    //详细地址
    private String unitAddress;
    //单位编号
    private String unitNum;
    //单位社保号
    private String unitSocial;
    //行业类别
    private String industryCategoryId;
    //组织机构代码
    private String organizationCode;
    //法人代表
    private String legalPersonName;
    //用工人数
    private String workerNum;
    //创建时间
    private Date gmtCreate;
    //修改时间
    private Date gmtModified;
    //审核状态
    private Integer isChecked;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getUnitPhone() {
        return unitPhone;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone == null ? null : unitPhone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUnitCountyCode() {
        return unitCountyCode;
    }

    public void setUnitCountyCode(String unitCountyCode) {
        this.unitCountyCode = unitCountyCode == null ? null : unitCountyCode.trim();
    }

    public String getUnitTownCode() {
        return unitTownCode;
    }

    public void setUnitTownCode(String unitTownCode) {
        this.unitTownCode = unitTownCode == null ? null : unitTownCode.trim();
    }

    public Integer getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress == null ? null : unitAddress.trim();
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum == null ? null : unitNum.trim();
    }

    public String getUnitSocial() {
        return unitSocial;
    }

    public void setUnitSocial(String unitSocial) {
        this.unitSocial = unitSocial == null ? null : unitSocial.trim();
    }

    public String getIndustryCategoryId() {
        return industryCategoryId;
    }

    public void setIndustryCategoryId(String industryCategoryId) {
        this.industryCategoryId = industryCategoryId == null ? null : industryCategoryId.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName == null ? null : legalPersonName.trim();
    }

    public String getWorkerNum() {
        return workerNum;
    }

    public void setWorkerNum(String workerNum) {
        this.workerNum = workerNum == null ? null : workerNum.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "CompanyRegistrationInfo{" +
                "unitId=" + unitId +
                ", unitName='" + unitName + '\'' +
                ", unitPhone='" + unitPhone + '\'' +
                ", password='" + password + '\'' +
                ", unitCountyCode='" + unitCountyCode + '\'' +
                ", unitTownCode='" + unitTownCode + '\'' +
                ", unitTypeId=" + unitTypeId +
                ", unitAddress='" + unitAddress + '\'' +
                ", unitNum='" + unitNum + '\'' +
                ", unitSocial='" + unitSocial + '\'' +
                ", industryCategoryId='" + industryCategoryId + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", legalPersonName='" + legalPersonName + '\'' +
                ", workerNum='" + workerNum + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isChecked=" + isChecked +
                '}';
    }
}