package com.example.datong.controller;

import com.example.datong.model.*;
import com.example.datong.model.Dictionary;
import com.example.datong.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;


@Controller
public class ViewController {
    @Autowired
    ShowService showService;

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
    @GetMapping("/show_person")
    public String toshowPerson(){ return "show_person";}
    @RequestMapping("/changeProvince")
    @ResponseBody
    public List<AddressCity> findCity(String code){
        List<AddressCity> result=showService.findCityBy(code);
        System.err.println(result);
        return result;
    }
    @RequestMapping("/changeCity")
    @ResponseBody
    public List<AddressCounty> findCounty(String code){
        List<AddressCounty> result=showService.findCountyBy(code);
        System.err.println(result);
        return result;
    }
    @RequestMapping("/changeTown")
    @ResponseBody
    public List<AddressTown> findTown(String code){
        List<AddressTown> result=showService.findTownByCode(code);
        System.err.println(result);
        return result;
    }

    @RequestMapping("/showPeople")
    public String showPeople(ModelMap map,@RequestParam("id") String id){
        Integer pid=Integer.valueOf(id);
        //字典集合
        List<Dictionary> dictionaries = showService.findDictionary();
        //个人信息
        FloatingPopulation peopleSelf=showService.getPeopleSelf(pid);
        String townCode=peopleSelf.getResidentialInfo().getResidentialTownCode();
        String prov = showService.getProvinceByCity(peopleSelf.getHouseholdCityCode());
        AddressProvince address = showService.getAddressByTownCode(townCode);
        //参保情况
        Integer[] insuranceStates=showService.findInsuranceState(pid);
        //加载所有地址
        List<AddressProvince>  provinces= showService.findProvince();
        List<AddressCity> cities =showService.findCity();
        List<AddressCounty> counties =showService.findCounty();
        List<AddressTown> towns = showService.findTown();
        //查询家庭成员信息
        List<FamilyMemberToghter> familyMember=showService.findById(pid);
        //配偶信息
        SpouseInfo spouseInfo = showService.getByPid(pid);
        map.put("spouseInfo",spouseInfo);

        FamilyPlanningInfo familyPlanningInfo= showService.getPlanningInfoById(pid);
        List<FertilityInfo> fertilityInfos = showService.findFertilityInfoById(pid);
        EmploymentInfo employmentInfo =showService.getEmploymentInfo(pid);
        AddressProvince employmentAddress =showService.getAddressByTownCode(employmentInfo.getCompany().getUnitTownCode());
        ResidentialInfo residentialInfo =showService.getResidentialInfo(pid);
        AddressProvince residentialAddress = showService.getAddressByTownCode(residentialInfo.getResidentialTownCode());
        //System.err.println(employmentAddress);
        //System.err.println(peopleSelf);
        map.put("insuranceStates",insuranceStates);
       // System.err.println(insuranceStates);
        map.put("address",address);
        map.put("dictionary",dictionaries);
        map.put("people",peopleSelf);
        map.put("prov",prov);
        map.put("provinces",provinces);
        map.put("cities",cities);
        map.put("counties",counties);
        map.put("towns",towns);
        map.put("familyMember",familyMember);
        map.put("familyPlanningInfo",familyPlanningInfo);
        map.put("fertilityInfos",fertilityInfos);
        map.put("employmentInfo",employmentInfo);
        map.put("residentialInfo",residentialInfo);
        map.put("employmentAddress",employmentAddress);
        map.put("residentialAddress",residentialAddress);
//        System.err.println(residentialInfo);
//        System.err.println(employmentInfo);
//        System.err.println(spouseInfo);
//        System.out.println(address);
//        System.err.println(dictionaries);
        if(spouseInfo!=null){
            AddressProvince spouseInfoAddress =showService.getSpouseAddress(spouseInfo.getSpouseCountyCode().toString());
            map.put("spouseInfoAddress",spouseInfoAddress);
            return "show_person2";
        }else{
            return "show_person";
        }

    }
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
        return "register_person";

    }
    //审核通过
    @RequestMapping("/toPass")
    @ResponseBody
    public int pass(@RequestParam("id") Integer id){
       Integer a= showService.replayCheckedByCompanyId(id);
       Integer message = null;
        if(a!=null){
            message = 1;
        }else {
            message = 0;
        }
        return message;
    }
    //不通过
   @RequestMapping("/noPass")
   @ResponseBody
    public int noPass(CheckReason checkReason){
        CheckReason result= showService.getCheckedReason(checkReason.getadminId());
       Integer row=null;
        if(result!=null){
            row=showService.replayReason(checkReason.getadminId(),checkReason.getReason());
        }else {
            row=showService.addReason(checkReason);
            showService.replayNoPass(checkReason.getadminId());
        }
        Integer messsage=0;
        System.err.println(row);
        if(row==null) {
            messsage = 0;
        } else {
            messsage = 1;
        }
        return messsage;
    }
    @RequestMapping("/companyPass")
    @ResponseBody
    public int companyPass(Integer id){
        System.err.println(id);
        Integer row= showService.replayCheckedByCompanyId(id);
        Integer message =null;
        if(row!=null){
            message=1;
        }else {
            message=0;
        }
        return message;
    }
    @RequestMapping("/companyNoPass")
    @ResponseBody
    public int companyNoPass(Integer id){
       Integer row= showService.replayCompanyNoPass(id);
       Integer message =null;
        if(row!=null){
            message=1;
        }else {
            message=0;
        }
        return message;
    }
    @RequestMapping("/noPassReason")
    public String noPassReason(Integer id,ModelMap map){
        map.put("id",id);
        return "noPass";
    }
    @RequestMapping("/showCompany")
    public String showCompany(Integer id){
        return "register";
    }

}
