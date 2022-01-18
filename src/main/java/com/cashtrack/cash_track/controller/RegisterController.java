package com.cashtrack.cash_track.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    // Register page
    @RequestMapping("/register")
    public String registerPage(){
        String resultStr = "";

        return resultStr;
    }

    // Register member
    @RequestMapping("/join")
    public void joinMember(@RequestBody String param){

    }

}
