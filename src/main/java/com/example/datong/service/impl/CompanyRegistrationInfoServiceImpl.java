package com.example.datong.service.impl;

import com.example.datong.dao.CompanyRegistrationInfoMapper;
import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.CompanyRegistrationInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CompanyRegistrationInfoServiceImpl implements CompanyRegistrationInfoService {
    @Resource
    CompanyRegistrationInfoMapper companyRegistrationInfoMapper;

    @Override
    public Map<String,Object> findAll(CompanyRegistrationInfo companyRegistrationInfo) {
        HashMap<String,Object> map=new HashMap<>();
        List<CompanyRegistrationInfo> companyRegistrationInfos = companyRegistrationInfoMapper.selectAll(companyRegistrationInfo);
       System.out.println(companyRegistrationInfos);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        for (int i = 0; i < companyRegistrationInfos.size(); i++) {

            CompanyRegistrationInfo companyRegistrationInfo1 = companyRegistrationInfos.get(i);
            //创建时间
            Date gmtCreate = companyRegistrationInfo1.getGmtCreate();
            String format = simpleDateFormat.format(gmtCreate);
            companyRegistrationInfo1.setGmtCreateStr(format);

            //修改时间
            Date gmtModified = companyRegistrationInfo1.getGmtModified();
            String format1 = simpleDateFormat.format(gmtModified);
            companyRegistrationInfo1.setGmtModifiedStr(format1);

            String dictionaryName = companyRegistrationInfo1.getDictionary().getDictionaryName();
            companyRegistrationInfo1.setIsCheckeds(dictionaryName);

        }

        map.put("data",companyRegistrationInfos);
        map.put("code",0);
        return map;

    }
}
