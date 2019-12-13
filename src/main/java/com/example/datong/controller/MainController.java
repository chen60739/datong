package com.example.datong.controller;

import com.example.datong.model.*;
import com.example.datong.service.AddressService;
import com.example.datong.service.DictionaryService;
import com.example.datong.service.FloatingPopulationService;
import com.example.datong.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private DictionaryService dictionaryService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private FloatingPopulationService floatingPopulationService;

    @RequestMapping("/audit")
    public String aduit(){
        return "passing";
    }

    @RequestMapping("/passed")
    public String passed(){
        return "passed";
    }

    @RequestMapping("/noPassed")
    public String noPassed(){
        return "noPassed";
    }

    /**
     * 登录检查通过后跳转主页
     *
     * @return 主页
     */
    @GetMapping("/personInfoPage")
    public String mainPage(Model model) {
        HashMap<String, List<Dictionary>> dictionary = dictionaryService.getDictionary();
        model.addAttribute("dictionary", dictionary);
        List<AddressProvince> provinces = addressService.getProvice();
        model.addAttribute("provinces", provinces);
        List<AddressCounty> counties = addressService.getCountyByCityCode("140200");
        model.addAttribute("counties", counties);
        return "register_person";
    }

    @GetMapping("/dictionary")
    @ResponseBody
    public HashMap<String, List<Dictionary>> getDictionary() {
        HashMap<String, List<Dictionary>> dictionary = dictionaryService.getDictionary();
        return dictionary;
    }

    @GetMapping("/getCity")
    @ResponseBody
    public List<AddressCity> getCity(@RequestParam("provinceCode") String provinceCode) {
        List<AddressCity> cities = addressService.getCity(provinceCode);
        return cities;
    }

    /**
     * 个人信息保存
     * @param floatingPopulation 个人信息
     * @param time 来本地时间
     * @param childBirthdayStr 当前生育子女生日
     * @param insuranceIds 所参保险
     * @param companyRegistrationInfo 公司信息详情
     * @param employmentInfo 就业详情
     * @param familyMember 同住家庭成员
     * @param familyPlanningInfo 计生详情
     * @param fertilityInfo 当前生育子女详情
     * @param lessorInfo 出租人情况
     * @param spouseInfo 配偶详情
     * @param residentialInfo 居住详情
     * @return
     * @throws ParseException
     */
    @PostMapping("/addPerson")
    @ResponseBody
    public String addPerson(FloatingPopulation floatingPopulation,
                            @RequestParam(name = "cometime",required = false) String time,
                            @RequestParam(name = "childBirthdayStr",required = false) String childBirthdayStr,
                            @RequestParam(name = "insuranceIds",required = false) String insuranceIds,
                             CompanyRegistrationInfo companyRegistrationInfo,
                             EmploymentInfo employmentInfo,
                            @RequestParam(name = "familyMember",required = false) String familyMember,
                             FamilyPlanningInfo familyPlanningInfo,
                             FertilityInfo fertilityInfo,
                             LessorInfo lessorInfo, SpouseInfo spouseInfo,
                            ResidentialInfo residentialInfo) throws ParseException {

        floatingPopulationService.addPerson(floatingPopulation,time,childBirthdayStr,
                insuranceIds,companyRegistrationInfo,employmentInfo,
                familyMember,familyPlanningInfo,fertilityInfo,
                lessorInfo,spouseInfo,residentialInfo);
        return "/personInfoPage";

    }

    /**
     * 个人信息上传照片保存
     * @param file
     * @return 返回图片名称
     */
    @RequestMapping("/savePhoto")
    @ResponseBody
    public Map<String, Object> addPhoto(@RequestParam MultipartFile file) {
        String name = FileUtil.savePhoto(file);
        Map<String,Object> res = new HashMap<>();
        res.put("code",0);
        res.put("name",name);
        return res;
    }

    /**
     * 审核中列表
     */
    @RequestMapping("/checking")
    @ResponseBody
    public Map<String, Object> checking(HttpServletRequest request){
        CompanyRegistrationInfo company = (CompanyRegistrationInfo) request.getSession().getAttribute("user");
        Map<String, Object> map = floatingPopulationService.findChecking(2101,company.getUnitId());
        return map;
    }

    /**
     * 已通过审核列表
     * @return
     */
    @RequestMapping("/passedData")
    @ResponseBody
    public Map<String, Object> passedData(HttpServletRequest request){
        CompanyRegistrationInfo company = (CompanyRegistrationInfo) request.getSession().getAttribute("user");
        Map<String, Object> map = floatingPopulationService.findChecking(2102, company.getUnitId());
        return map;
    }

    /**
     * 未通过审核列表
     * @param request
     * @return
     */
    @RequestMapping("/noPassedData")
    @ResponseBody
    public Map<String, Object> noPassedData(HttpServletRequest request){
        CompanyRegistrationInfo company = (CompanyRegistrationInfo) request.getSession().getAttribute("user");
        Map<String, Object> map = floatingPopulationService.findNoPassed(company.getUnitId());
        return map;
    }

    @RequestMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:/";
    }

    @RequestMapping("/getRelation")
    @ResponseBody
    public List<Dictionary> getRelation(){
        HashMap<String, List<Dictionary>> dictionary = dictionaryService.getDictionary();
        List<Dictionary> relations = dictionary.get("relation");
        return relations;
    }

}
