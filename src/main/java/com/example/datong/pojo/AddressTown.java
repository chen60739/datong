package com.example.datong.pojo;

public class AddressTown {
    private Integer townId;

    private String townCode;

    private String townName;

    private String countyCode;

    public Integer getTownId() {
        return townId;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode == null ? null : townCode.trim();
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }
}