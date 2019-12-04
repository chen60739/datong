package com.example.datong.model;

public class ResidentialInfo {
    private Integer id;

    private Integer pId;

    private String townCode;

    private String addres;
    //居住方式id
    private Integer livingStyleId;
    //居住事由id
    private Integer reasonForResidenceId;
    //房屋类别id
    private Integer houseTypeId;
    //房屋类型
    private Integer houseGener;
    //房屋用途
    private Integer houseUse;

    private String messagePerson;

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

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode == null ? null : townCode.trim();
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres == null ? null : addres.trim();
    }

    public Integer getLivingStyleId() {
        return livingStyleId;
    }

    public void setLivingStyleId(Integer livingStyleId) {
        this.livingStyleId = livingStyleId;
    }

    public Integer getReasonForResidenceId() {
        return reasonForResidenceId;
    }

    public void setReasonForResidenceId(Integer reasonForResidenceId) {
        this.reasonForResidenceId = reasonForResidenceId;
    }

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public Integer getHouseGener() {
        return houseGener;
    }

    public void setHouseGener(Integer houseGener) {
        this.houseGener = houseGener;
    }

    public Integer getHouseUse() {
        return houseUse;
    }

    public void setHouseUse(Integer houseUse) {
        this.houseUse = houseUse;
    }

    public String getMessagePerson() {
        return messagePerson;
    }

    public void setMessagePerson(String messagePerson) {
        this.messagePerson = messagePerson == null ? null : messagePerson.trim();
    }
}