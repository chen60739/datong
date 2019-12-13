package com.example.datong.controller;

import com.example.datong.message.Result;
import com.example.datong.model.*;
import com.example.datong.service.AddressService;
import com.example.datong.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private CompanyService companyService;

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
     * 返回前台主页
     * @return
     */
    @RequestMapping("/main")
    public String frontMain(){
        return "front_main";
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
    public List<AddressCounty> getCounty(@RequestParam(name = "cityCode",defaultValue = "140200") String cityCode) {
        List<AddressCounty> counties = addressService.getCountyByCityCode(cityCode);
        return counties;
    }

    @GetMapping("/getTown")
    @ResponseBody
    public List<AddressTown> getTown(@RequestParam("countyCode") String countyCode) {
        List<AddressTown> towns = addressService.getTownByCountyCode(countyCode);
        return towns;
    }

    /**
     * 登录账户注册
     * @param company
     * @return 返回登录页面
     */
    @PostMapping("/register")
    public String register(CompanyRegistrationInfo company) {
        companyService.insert(company);
        return "redirect:/";
    }

    /**
     * 注册页面手机号检查是否重复
     * @param phone 手机号
     * @return true为不重复，可用
     */
    @RequestMapping("/checkPhone")
    @ResponseBody
    public boolean checkUnitPhone(@RequestParam("phone") String phone){
        boolean flag = companyService.checkPhone(phone);
        return flag;
    }
}
