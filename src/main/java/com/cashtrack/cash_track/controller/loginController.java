package com.cashtrack.cash_track.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {

    @RequestMapping("login")
    public String loginPage(@RequestBody String param, HttpServletRequest request){
        String resultStr = "";

        return resultStr;
    }



}
