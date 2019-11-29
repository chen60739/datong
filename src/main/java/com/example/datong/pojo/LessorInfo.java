package com.example.datong.pojo;

public class LessorInfo {
    private Integer id;

    private Integer pId;

    private Boolean lessorType;

    private String lessorName;

    private String lessorPhone;

    private String lessorIdCard;

    private Boolean isSign;

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

    public Boolean getLessorType() {
        return lessorType;
    }

    public void setLessorType(Boolean lessorType) {
        this.lessorType = lessorType;
    }

    public String getLessorName() {
        return lessorName;
    }

    public void setLessorName(String lessorName) {
        this.lessorName = lessorName == null ? null : lessorName.trim();
    }

    public String getLessorPhone() {
        return lessorPhone;
    }

    public void setLessorPhone(String lessorPhone) {
        this.lessorPhone = lessorPhone == null ? null : lessorPhone.trim();
    }

    public String getLessorIdCard() {
        return lessorIdCard;
    }

    public void setLessorIdCard(String lessorIdCard) {
        this.lessorIdCard = lessorIdCard == null ? null : lessorIdCard.trim();
    }

    public Boolean getIsSign() {
        return isSign;
    }

    public void setIsSign(Boolean isSign) {
        this.isSign = isSign;
    }
}