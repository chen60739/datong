package com.example.datong.controller;

import com.example.datong.model.AddressCounty;
import com.example.datong.model.AddressTown;
import com.example.datong.model.CheckReason;
import com.example.datong.service.AddressService;
import com.example.datong.service.FloatingPopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class FloatingPopulationController {

    @Resource
    FloatingPopulationService floatingPopulationService;
    @Autowired
    private AddressService addressService;

    //个人登记信息审核
    @RequestMapping("findAllFloatingPopulation")
    @ResponseBody
    public Map<String,Object> findAll(String unitName,String name,String phone,String time1,String time2,
                                      @RequestParam("page") Integer page,
                                      @RequestParam("limit") Integer limit){
        return floatingPopulationService.findAll(unitName,name, phone,time1,time2,page,limit);
    }
    @RequestMapping("backRegistrationInfoAudit")
    public String backRegistrationInfoAudit(){
        return  "backRegistrationInfoAudit" ;
    }
    @RequestMapping("backAccountManagement")
    public String backAccountManagement(){
        return "backAccountManagement";
    }

    @RequestMapping("backFloatingManagement")
    public String backFloatingManagement(){
        return "backFloatingManagement";
    }


    /*//修改个人等级审核状态--通过
    @RequestMapping("changePass")
    @ResponseBody
    public int changePass(Integer id){
        //return floatingPopulationService.changePass(id);
    }*/
    //修改个人等级审核状态--不通过
    @RequestMapping("changeNoPass")
    @ResponseBody
    public Map<String, Object> changeNoPass(Integer id,CheckReason reason){
        return  floatingPopulationService.changeNoPass(id, reason);
    }

    //流动人口信息跳转页面
    @GetMapping("/back_statis")
    public String toBackStatis(Model model, String county, String town,
                               @RequestParam(name = "Create_time1",required = false) String Create_time1,
                               @RequestParam(name = "Create_time2",required = false) String Create_time2) {
        Model model1= floatingPopulationService.findModel(model,county,town,Create_time1,Create_time2);
        return "information_statistics"; }
    //查询大同市下所有的县
    @GetMapping("/findDaTongCounty")
    @ResponseBody
    public List<AddressCounty> findDaTongCounty(){
        List<AddressCounty> list= addressService.getCountyByCityCode("140200");
        return list;
    }
    //根据相应的县查询相应的区
    @GetMapping("/findTownByCountyCode")
    @ResponseBody
    public List<AddressTown> findTownByCountyCode(String countyCode){
        List<AddressTown> list=  addressService.getTownByCountyCode(countyCode);
        return  list;
    }
}
