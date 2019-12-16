package com.example.datong.controller;

import com.example.datong.dto.SuperEmploymentInfo;
import com.example.datong.dto.SuperResidentialInfo;
import com.example.datong.model.*;
import com.example.datong.model.Dictionary;
import com.example.datong.service.AddressService;
import com.example.datong.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;


@Controller
public class ViewController {
    @Autowired
    ShowService showService;
    @Autowired
    AddressService addressService;


    @GetMapping("/show_person")
    public String toshowPerson(){ return "show_person";}
    @GetMapping("/show_person2")
    public String toshowPerson2(){ return "show_person2";}
    @RequestMapping("/changeProvince")
    @ResponseBody
    public List<AddressCity> findCity(String code){
        List<AddressCity> result=addressService.getCityByProvinceCode(code);
        System.err.println(result);
        return result;
    }
    @RequestMapping("/changeCity")
    @ResponseBody
    public List<AddressCounty> findCounty(String code){
        List<AddressCounty> result=addressService.getCountyByCityCode(code);
        System.err.println(result);
        return result;
    }
    @RequestMapping("/changeTown")
    @ResponseBody
    public List<AddressTown> findTown(String code){
        List<AddressTown> result=addressService.getTownByCountyCode(code);
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
        SuperEmploymentInfo superEmploymentInfo =showService.getEmploymentInfo(pid);
        AddressProvince employmentAddress =showService.getAddressByTownCode(superEmploymentInfo.getCompanyRegistrationInfo().getUnitTownCode());
        SuperResidentialInfo residentialInfo =showService.getResidentialInfo(pid);
        AddressProvince residentialAddress = showService.getAddressByTownCode(residentialInfo.getResidentialTownCode());
        map.put("insuranceStates",insuranceStates);
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
        map.put("employmentInfo",superEmploymentInfo);
        map.put("residentialInfo",residentialInfo);
        map.put("employmentAddress",employmentAddress);
        map.put("residentialAddress",residentialAddress);
        if(spouseInfo!=null){
            AddressProvince spouseInfoAddress =showService.getSpouseAddress(spouseInfo.getSpouseCountyCode().toString());
            map.put("spouseInfoAddress",spouseInfoAddress);
            return "show_person2";
        }else{
            return "show_person";
        }
    }

    //个人注册页面或者回显页面
    @GetMapping("/register_person")
    public String registerPerson(Integer id){
        System.out.println("进入方法内");
        System.out.println(id);
        return "register_person";
    }

    /**
     * 审核通过
     * @param id
     * @return
     */
    @RequestMapping("/toPass")
    @ResponseBody
    public boolean pass(@RequestParam(value = "id[]") String[] id){
        showService.replayPass(id);
        return true;
    }

    /**
     * 不通过
     * @param checkReason
     * @param pId
     * @return
     */
   @RequestMapping("/noPass")
   @ResponseBody
    public boolean noPass(CheckReason checkReason,@RequestParam("pId") String pId){
       int i = showService.addReason(checkReason);
       if(i==1){
           showService.replayNoPass(checkReason.getId(),Integer.parseInt(pId));
           return true;
       }
       return false;
    }
    @RequestMapping("/companyPass")
    @ResponseBody
    public int companyPass(Integer id){
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
    public String showCompany(Integer id,ModelMap map){

        return "register";
    }

}
