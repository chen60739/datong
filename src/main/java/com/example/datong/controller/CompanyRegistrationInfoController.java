package com.example.datong.controller;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.CompanyRegistrationInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class CompanyRegistrationInfoController {
    @Resource
    CompanyRegistrationInfoService companyRegistrationInfoService;

    @RequestMapping("findAllCompany")
    @ResponseBody
    public Map<String,Object> findAllCompany(CompanyRegistrationInfo companyRegistrationInfo){
        Map<String, Object> all = companyRegistrationInfoService.findAll(companyRegistrationInfo);
        return all;
    }
    @RequestMapping("backInforAudit")
    public String backInforAudit(){
        return "backInforAudit";
    }
    @RequestMapping("back_all")
    public String back_all(){
        return "back_all";
    }
}
