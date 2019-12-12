package com.example.datong.controller;

import com.example.datong.model.CheckReason;
import com.example.datong.service.FloatingPopulationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class FloatingPopulationController {

    @Resource
    FloatingPopulationService floatingPopulationService;

    //个人登记信息审核
    @RequestMapping("findAllFloatingPopulation")
    @ResponseBody
    public Map<String,Object> findAll(String unitName,String name,String phone,String time1,String time2){
        return floatingPopulationService.findAll( unitName,name, phone,time1,time2);
    }
    @RequestMapping("backRegistrationInfoAudit")
    public String backRegistrationInfoAudit(){
        return  "backRegistrationInfoAudit" ;
    }
    @RequestMapping("backFloatingManagement")
    public String backFloatingManagement(){
        return "backFloatingManagement";
    }


    //修改个人等级审核状态--通过
    @RequestMapping("changePass")
    @ResponseBody
    public int changePass(Integer id){
        return floatingPopulationService.changePass(id);
    }
    //修改个人等级审核状态--不通过
    @RequestMapping("changeNoPass")
    @ResponseBody
    public Map<String, Object> changeNoPass(Integer id,CheckReason reason){
        return  floatingPopulationService.changeNoPass(id, reason);

    }

}
