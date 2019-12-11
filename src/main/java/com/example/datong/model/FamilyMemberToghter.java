package com.example.datong.model;

public class FamilyMemberToghter {
    private Integer id;
    //用户人id
    private Integer pId;
    //姓名
    private String memberName;
    //性别
    private Boolean memberSex;
    //身份证号
    private String memberIdCard;
    //关系描述
    private Integer relationId;
    //有无预防接种
    private Boolean hasVaccinate;
    //是否在本市就学
    private Boolean isLocal;

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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Boolean getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(Boolean memberSex) {
        this.memberSex = memberSex;
    }

    public String getMemberIdCard() {
        return memberIdCard;
    }

    public void setMemberIdCard(String memberIdCard) {
        this.memberIdCard = memberIdCard == null ? null : memberIdCard.trim();
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Boolean getHasVaccinate() {
        return hasVaccinate;
    }

    public void setHasVaccinate(Boolean hasVaccinate) {
        this.hasVaccinate = hasVaccinate;
    }

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    @Override
    public String toString() {
        return "FamilyMemberToghter{" +
                "id=" + id +
                ", pId=" + pId +
                ", memberName='" + memberName + '\'' +
                ", memberSex=" + memberSex +
                ", memberIdCard='" + memberIdCard + '\'' +
                ", relationId=" + relationId +
                ", hasVaccinate=" + hasVaccinate +
                ", isLocal=" + isLocal +
                '}';
    }
}