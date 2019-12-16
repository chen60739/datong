package com.example.datong.service.impl;

import com.example.datong.dao.CompanyRegistrationInfoMapper;
import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.CompanyRegistrationInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyRegistrationInfoServiceImpl implements CompanyRegistrationInfoService {
    @Resource
    CompanyRegistrationInfoMapper companyRegistrationInfoMapper;

    @Override
    public Map<String,Object> findAll(CompanyRegistrationInfo companyRegistrationInfo,Integer page,Integer limit) {
        HashMap<String,Object> map=new HashMap<>();
        int offest = (page - 1) * limit;
        List<CompanyRegistrationInfo> companyRegistrationInfos = companyRegistrationInfoMapper.selectAll(companyRegistrationInfo,offest,limit);
        int count = companyRegistrationInfoMapper.selectAllCount(companyRegistrationInfo);
        map.put("data",companyRegistrationInfos);
        map.put("count",count);
        map.put("code",0);
        return map;

    }
}
