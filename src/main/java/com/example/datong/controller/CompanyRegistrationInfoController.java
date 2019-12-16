package com.example.datong.controller;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.service.CompanyRegistrationInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class CompanyRegistrationInfoController {
    @Resource
    CompanyRegistrationInfoService companyRegistrationInfoService;

    @RequestMapping("/back/findAllCompany")
    @ResponseBody
    public Map<String,Object> findAllCompany(CompanyRegistrationInfo companyRegistrationInfo,
                                             @RequestParam("page") Integer page,
                                             @RequestParam("limit") Integer limit){
        Map<String, Object> all = companyRegistrationInfoService.findAll(companyRegistrationInfo,page,limit);
        return all;
    }
    @RequestMapping("/back/inforAudit")
    public String backInforAudit(){
        return "backInforAudit";
    }
    @RequestMapping("/back/all")
    public String back_all(){
        return "back_all";
    }
}
