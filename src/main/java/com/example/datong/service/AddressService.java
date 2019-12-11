package com.example.datong.service;

import com.example.datong.model.AddressCity;
import com.example.datong.model.AddressCounty;
import com.example.datong.model.AddressProvince;
import com.example.datong.model.AddressTown;

import java.util.List;

public interface AddressService {
    //通过城市编码获取县级
    List<AddressCounty> getCountyByCityCode(String cityCode);
    //通过县级获取镇
    List<AddressTown> getTownByCountyCode(String countyCode);

    List<AddressProvince> getProvice();

    List<AddressCity> getCity(String provinceCode);

}
