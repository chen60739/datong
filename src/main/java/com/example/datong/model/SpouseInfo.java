package com.example.datong.model;

public class SpouseInfo {

    private Integer id;
    //人id
    private Integer pId;

    private String spouseName;

    private String spouseIdCard;

    private Integer spouseCountyCode;

    private String spouseAddress;

    private Integer spouseEmploymentStateId;

    private String spouseWorkUnit;

    private String spousePhone;

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

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdCard() {
        return spouseIdCard;
    }

    public void setSpouseIdCard(String spouseIdCard) {
        this.spouseIdCard = spouseIdCard;
    }

    public Integer getSpouseCountyCode() {
        return spouseCountyCode;
    }

    public void setSpouseCountyCode(Integer spouseCountyCode) {
        this.spouseCountyCode = spouseCountyCode;
    }

    public String getSpouseAddress() {
        return spouseAddress;
    }

    public void setSpouseAddress(String spouseAddress) {
        this.spouseAddress = spouseAddress;
    }

    public Integer getSpouseEmploymentStateId() {
        return spouseEmploymentStateId;
    }

    public void setSpouseEmploymentStateId(Integer spouseEmploymentStateId) {
        this.spouseEmploymentStateId = spouseEmploymentStateId;
    }

    public String getSpouseWorkUnit() {
        return spouseWorkUnit;
    }

    public void setSpouseWorkUnit(String spouseWorkUnit) {
        this.spouseWorkUnit = spouseWorkUnit;
    }

    public String getSpousePhone() {
        return spousePhone;
    }

    public void setSpousePhone(String spousePhone) {
        this.spousePhone = spousePhone;
    }

    @Override
    public String toString() {
        return "SpouseInfo{" +
                "id=" + id +
                ", pId=" + pId +
                ", spouseName='" + spouseName + '\'' +
                ", spouseIdCard='" + spouseIdCard + '\'' +
                ", spouseCountyCode=" + spouseCountyCode +
                ", spouseAddress='" + spouseAddress + '\'' +
                ", spouseEmploymentStateId=" + spouseEmploymentStateId +
                ", spouseWorkUnit='" + spouseWorkUnit + '\'' +
                ", spousePhone='" + spousePhone + '\'' +
                '}';
    }
}