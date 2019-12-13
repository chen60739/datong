package com.example.datong.controller;

import com.example.datong.message.Result;
import com.example.datong.model.*;
import com.example.datong.service.AddressService;
import com.example.datong.service.CompanyService;
import com.example.datong.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private DictionaryService dictionaryService;

    /**
     * 检查登录账户是否正确
     *
     * @param username 用户名（手机号）
     * @param password 密码
     * @return 结果集
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody @RequestParam("username") String username,
                        @RequestBody @RequestParam("password") String password,
                        HttpServletRequest request) {

        Result result = companyService.login(username, password, request);
        return result;
    }

    /**
     * 登录检查通过后跳转主页
     *
     * @return 主页
     */
    @GetMapping("/main")
    public String mainPage(Model model) {
        HashMap<String, List<Dictionary>> dictionary = dictionaryService.getDictionary();
        model.addAttribute("dictionary", dictionary);
        List<AddressProvince> provinces = addressService.getProvice();
        model.addAttribute("provinces", provinces);
        List<AddressCounty> counties = addressService.getCountyByCityCode();
        model.addAttribute("counties", counties);
        return "register_person";
    }


    /**
     * @return 注册页面
     */
    @GetMapping("/registerPage")
    public String registerPage() {
        return "register";
    }

    @GetMapping("/getCounty")
    @ResponseBody
    public List<AddressCounty> getCounty() {
        List<AddressCounty> counties = addressService.getCountyByCityCode();
        return counties;
    }

    @GetMapping("/getTown")
    @ResponseBody
    public List<AddressTown> getTown(@RequestParam("countyCode") String countyCode) {
        List<AddressTown> towns = addressService.getTownByCountyCode(countyCode);
        return towns;
    }

    @PostMapping("/register")
    public String register(CompanyRegistrationInfo company) {
        companyService.insert(company);
        return "redirect:/";
    }

}
