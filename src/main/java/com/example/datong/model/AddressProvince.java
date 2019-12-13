package com.example.datong.model;

import java.util.List;

public class AddressProvince {
    private Integer provinceId;

    private String provinceCode;

    private String provinceName;

    private List<AddressCity> addressCityList;

    private List<AddressCounty> addressCountyList;

    private List<AddressTown> addressTownList;

    @Override
    public String toString() {
        return "AddressProvince{" +
                "provinceId=" + provinceId +
                ", provinceCode='" + provinceCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", addressCityList=" + addressCityList +
                ", addressCountyList=" + addressCountyList +
                ", addressTownList=" + addressTownList +
                '}';
    }

    public List<AddressCity> getAddressCityList() {
        return addressCityList;
    }

    public void setAddressCityList(List<AddressCity> addressCityList) {
        this.addressCityList = addressCityList;
    }

    public List<AddressCounty> getAddressCountyList() {
        return addressCountyList;
    }

    public void setAddressCountyList(List<AddressCounty> addressCountyList) {
        this.addressCountyList = addressCountyList;
    }

    public List<AddressTown> getAddressTownList() {
        return addressTownList;
    }

    public void setAddressTownList(List<AddressTown> addressTownList) {
        this.addressTownList = addressTownList;
    }

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


}