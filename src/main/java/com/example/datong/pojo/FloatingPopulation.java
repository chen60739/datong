package com.example.datong.pojo;

import java.util.Date;

/**
 * 流动人口信息类
 */
public class FloatingPopulation {
    private Integer id;
    //姓名
    private String name;
    //曾用名
    private String nameUsedBefore;
    //性别 1 男  0 女
    private Boolean sex;
    //身份证号
    private String idCard;
    //固定电话
    private String fixedPhone;
    //户籍市编码
    private String householdCityCode;
    //联系手机
    private String phone;
    //民族
    private Integer nationId;
    //来本地时间
    private Date comeTime;
    //文化程度
    private Integer educationLevelId;
    //政治面貌
    private Integer politicalOutlookId;
    //宗教信仰
    private Integer faithId;
    //身高 cm
    private Double height;
    //体重 kg
    private Double weight;
    //血型
    private Integer bloodTypeId;
    //健康状况
    private Integer healthy;
    //残疾证编号
    private String hCode;
    //从业情况
    private Integer employmentStateId;
    //婚姻状况
    private Integer maritalStateId;
    //是否删除 1删除  0 未删除
    private Boolean isDel;
    //状态 1存在  0不存在
    private Boolean state;
    //创建时间
    private Date gmtCreate;
    //修改时间
    private Date gmtModified;
    //审核状态
    private Integer isChecked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameUsedBefore() {
        return nameUsedBefore;
    }

    public void setNameUsedBefore(String nameUsedBefore) {
        this.nameUsedBefore = nameUsedBefore == null ? null : nameUsedBefore.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone == null ? null : fixedPhone.trim();
    }

    public String getHouseholdCityCode() {
        return householdCityCode;
    }

    public void setHouseholdCityCode(String householdCityCode) {
        this.householdCityCode = householdCityCode == null ? null : householdCityCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public Integer getEducationLevelId() {
        return educationLevelId;
    }

    public void setEducationLevelId(Integer educationLevelId) {
        this.educationLevelId = educationLevelId;
    }

    public Integer getPoliticalOutlookId() {
        return politicalOutlookId;
    }

    public void setPoliticalOutlookId(Integer politicalOutlookId) {
        this.politicalOutlookId = politicalOutlookId;
    }

    public Integer getFaithId() {
        return faithId;
    }

    public void setFaithId(Integer faithId) {
        this.faithId = faithId;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBloodTypeId() {
        return bloodTypeId;
    }

    public void setBloodTypeId(Integer bloodTypeId) {
        this.bloodTypeId = bloodTypeId;
    }

    public Integer getHealthy() {
        return healthy;
    }

    public void setHealthy(Integer healthy) {
        this.healthy = healthy;
    }

    public String gethCode() {
        return hCode;
    }

    public void sethCode(String hCode) {
        this.hCode = hCode == null ? null : hCode.trim();
    }

    public Integer getEmploymentStateId() {
        return employmentStateId;
    }

    public void setEmploymentStateId(Integer employmentStateId) {
        this.employmentStateId = employmentStateId;
    }

    public Integer getMaritalStateId() {
        return maritalStateId;
    }

    public void setMaritalStateId(Integer maritalStateId) {
        this.maritalStateId = maritalStateId;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
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
}