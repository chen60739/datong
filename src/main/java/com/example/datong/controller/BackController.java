package com.example.datong.controller;

import com.example.datong.model.CompanyRegistrationInfo;
import com.example.datong.model.FloatingPopulation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class BackController {

    //后台注册
    @GetMapping("/back_register")
    public String backRegister(){ return "back_register";}
    //后台登录
    @GetMapping("/back_login")
    public String back_login(){ return "back_login";}
    //布局首页
    @GetMapping("/back_index")
    public String toBackIndex(){return  "backIndex";}
    //跳转到注册信息审核
    @GetMapping("/back_info_audit")
    public String toBackInfoAudit(){
        return "backInforAudit";
    }
    //跳转到账户管理
    @GetMapping("/back_account_management")
    public String toBackAccountManagement(){
        return "backAccountManagement";
    }
    //跳转到登记信息审核
    @GetMapping("/back_register_audit")
    public String toBackRegistrationInfoAudit(){ return "backRegistrationInfoAudit";}
    //跳转到流动人口信息管理页面
    @GetMapping("/back_floatingManagement")
    public String toBackFloatingManagement(){ return "backFloatingManagement";}
    //获取注册信息去进行审核
    @GetMapping("/back_register_info")
    @ResponseBody
    public HashMap<String,Object> backFindRegisterInfo(){
        List<CompanyRegistrationInfo> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();
        Date date =new Date();
        System.out.println(date);
        CompanyRegistrationInfo obj=new CompanyRegistrationInfo();
        obj.setUnitId(1);
        obj.setUnitName("李公司");
        obj.setGmtCreate(date);
        obj.setIsChecked(1);
        obj.setUnitPhone("1536975845");
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }
    //获取账户信息进行管理，一般用于查询用户密码
    @GetMapping("/back_account_info")
    @ResponseBody
    public HashMap<String,Object> backFindAccountInfo(){
        List<CompanyRegistrationInfo> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();
        CompanyRegistrationInfo obj=new CompanyRegistrationInfo();
        obj.setUnitId(1);
        obj.setUnitName("李公司");
        // obj.setPhone("15369570978");
        obj.setPassword("5464654");
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }
    //登记信息审核
    @GetMapping("/backFindFloatInfo")
    @ResponseBody
    public Map<String,Object> backFindFloatInfo(){
        List<FloatingPopulation> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        Date date=new Date();
        FloatingPopulation obj=new FloatingPopulation();
        obj.setId(1);
        obj.setName("孙一");
        obj.setPhone("15369570978");
        obj.setGmtCreate(date);
        obj.setCompanyId(1);
       // obj.setExamine("查看详情");
        //obj.setAuditor("孙二");
        obj.setIsChecked(1);
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }
    //流动信息人口管理
    @GetMapping("/back_population")
    @ResponseBody
    public HashMap<String,Object> back_population(){
        List<FloatingPopulation> list= new ArrayList<>();
        HashMap<String,Object> map = new HashMap<>();
        Date date=new Date();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        FloatingPopulation obj=new FloatingPopulation();
        obj.setId(1);
        obj.setName("孙一");
        obj.setPhone("15369570978");
        obj.setGmtCreate(date);
        obj.setCompanyId(1);
        list.add(obj);
        list.add(obj);
        map.put("code",0);
        map.put("data",list);
        return map;
    }

    //个人注册页面或者回显页面
    @GetMapping("/register_person")
    public String registerPerson(Integer id){
        System.out.println("进入方法内");
        System.out.println(id);
        return "register_person";}
    //流动人口信息跳转页面
    @GetMapping("/back_statis")
    public String toBackStatis(Model model){
        List<String> rs=new ArrayList<>();
        List<String> list=new ArrayList<>();
        rs.add("1");
        rs.add("2");
        rs.add("3");
        rs.add("4");
        rs.add("5");
        list.add("河北");
        list.add("北京");
        list.add("河南");
        list.add("上海");
        list.add("广东");
        model.addAttribute("rs",rs);
        model.addAttribute("provinces",list);
        return "information_statistics"; }
        //审核通过
        @GetMapping("/toPass")
        @ResponseBody
        public int pass(@RequestParam("id") Integer id){
        System.out.println(id);
        int insert=1;
            return insert;
        }
        //不通过
        @GetMapping("/noPass")
        @ResponseBody
        public String noPass(){
            return null;
        }
}
