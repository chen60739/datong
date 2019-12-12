package com.example.datong.model;

public class SpouseInfo {
    private Integer id;

    private Integer pId;
    //配偶姓名
    private String name;
    //配偶身份证号
    private String idCard;

    private Integer countyCode;
    //现居住地地址
    private String address;
    //从业状况id
    private Integer employmentStateId;
    //工作单位
    private String workUnit;
    //联系电话
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getEmploymentStateId() {
        return employmentStateId;
    }

    public void setEmploymentStateId(Integer employmentStateId) {
        this.employmentStateId = employmentStateId;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}