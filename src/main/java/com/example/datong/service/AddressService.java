package com.example.datong.service;

import com.example.datong.model.AddressCity;
import com.example.datong.model.AddressCounty;
import com.example.datong.model.AddressProvince;
import com.example.datong.model.AddressTown;

import java.util.List;

public interface AddressService {

    List<AddressCounty> getCountyByCityCode(String cityCode);

    List<AddressTown> getTownByCountyCode(String countyCode);

    List<AddressProvince> getProvice();

    List<AddressCity> getCity(String provinceCode);

}
