package com.example.datong.model;

public class AddressProvince {
    private Integer provinceId;

    private String provinceCode;

    private String provinceName;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    @Override
    public String toString() {
        return "AddressProvince{" +
                "provinceId=" + provinceId +
                ", provinceCode='" + provinceCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}