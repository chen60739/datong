package com.example.datong.model;


public class AddressCity {
    private Integer cityId;

    private String cityCode;

    private String cityName;

    private String provinceCode;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    @Override
    public String toString() {
        return "AddressCity{" +
                "cityId=" + cityId +
                ", cityCode='" + cityCode + '\'' +
                ", cityName='" + cityName + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                '}';
    }
}