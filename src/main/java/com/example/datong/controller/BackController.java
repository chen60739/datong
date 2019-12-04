package com.example.datong.controller;

import com.example.datong.pojo.CompanyRegistrationInfo;
import com.example.datong.pojo.FloatingPopulation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Controller
public class BackController {

    @GetMapping("/back")
    public String back(){
        return "back";
    }

    @GetMapping("/back_all")
    public String back_all(){
        return "back_all";
    }

    @GetMapping("/back_two")
    @ResponseBody
    public HashMap<String,Object> back_two(){
        List<CompanyRegistrationInfo> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<String, Object>();
        CompanyRegistrationInfo obj=new CompanyRegistrationInfo();
        obj.setUnitId(1);
        obj.setUnitName("王八蛋公司");
        obj.setPhone("15369570978");
        obj.setPassword("5464654");
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }

    @GetMapping("/back_register")
    public String back_register(){ return "back_register";}

    @GetMapping("/back_float")
    @ResponseBody
    public HashMap<String,Object> back_float(){
        List<FloatingPopulation> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<String,Object>();
        Date date=new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        FloatingPopulation obj=new FloatingPopulation();
        obj.setId(1);
        obj.setName("孙一");
        obj.setPhone("15369570978");
        obj.setGmtCreate(date);
        obj.setCompanyId(1);
        obj.setExamine("查看详情");
        obj.setAuditor("孙二");
        obj.setIsChecked(1);
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }


    @GetMapping("/back_three")
    public String back_three(){ return "back_three";}

    @GetMapping("/back_four")
    public String back_four(){ return "back_four";}

    @GetMapping("/back_population")
    @ResponseBody
    public HashMap<String,Object> back_population(){
        List<FloatingPopulation> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<String,Object>();
        Date date=new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        FloatingPopulation obj=new FloatingPopulation();
        obj.setId(1);
        obj.setName("孙一");
        obj.setPhone("15369570978");
        obj.setGmtCreate(date);
        obj.setCompanyId(1);
        obj.setExamine("查看详情");
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }

    @GetMapping("/back_login")
    public String back_login(){ return "back_login";}

    @GetMapping("/register_person")
    public String registerPerson(){ return "register_person";}

    @GetMapping("/back_register_info")
    @ResponseBody
    public HashMap<String,Object> back_register_info(){

        List<CompanyRegistrationInfo> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<String, Object>();
        Date date =new Date();
        System.out.println(date);
        CompanyRegistrationInfo obj=new CompanyRegistrationInfo();
        obj.setUnitId(1);
        obj.setUnitName("王八蛋公司");
        obj.setPhone("15369570978");
        obj.setGmtCreate(date);
        obj.setIsChecked(1);
        obj.setExamine("查看详情");
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
            return map;
    }
}
