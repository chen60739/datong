package com.example.datong.service.impl;

import com.example.datong.dao.AddressCityMapper;
import com.example.datong.dao.AddressCountyMapper;
import com.example.datong.dao.AddressProvinceMapper;
import com.example.datong.dao.AddressTownMapper;
import com.example.datong.model.AddressCity;
import com.example.datong.model.AddressCounty;
import com.example.datong.model.AddressProvince;
import com.example.datong.model.AddressTown;
import com.example.datong.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService {

    @Autowired
    private AddressProvinceMapper provinceMapper;
    @Autowired
    private AddressCityMapper cityMapper;
    @Autowired
    private AddressCountyMapper countyMapper;
    @Autowired
    private AddressTownMapper townMapper;

    @Override
    public List<AddressCounty> getCountyByCityCode(String cityCode) {
        List<AddressCounty> counties = countyMapper.selectByCityCode(cityCode);
        return counties;
    }

    @Override
    public List<AddressTown> getTownByCountyCode(String countyCode) {
        List<AddressTown> towns = townMapper.selectByCountyCode(countyCode);
        return towns;
    }

    @Override
    public List<AddressProvince> getProvice() {
        List<AddressProvince> provinces = provinceMapper.selectAll();
        return provinces;
    }

    @Override
    public List<AddressCity> getCity(String provinceCode) {
        List<AddressCity> cities = cityMapper.selectByProvinceCode(provinceCode);
        return cities;
    }
}
