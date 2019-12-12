package com.example.datong.model;

import java.util.Date;

public class FertilityInfo {
    private Integer id;

    private Integer pId;

    private Boolean childSex;

    private Date childBirthday;

    private Boolean isInside;

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

    public Boolean getChildSex() {
        return childSex;
    }

    public void setChildSex(Boolean childSex) {
        this.childSex = childSex;
    }

    public Date getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(Date childBirthday) {
        this.childBirthday = childBirthday;
    }

    public Boolean getIsInside() {
        return isInside;
    }

    public void setIsInside(Boolean isInside) {
        this.isInside = isInside;
    }

    @Override
    public String toString() {
        return "FertilityInfo{" +
                "id=" + id +
                ", pId=" + pId +
                ", childSex=" + childSex +
                ", childBirthday=" + childBirthday +
                ", isInside=" + isInside +
                '}';
    }
}