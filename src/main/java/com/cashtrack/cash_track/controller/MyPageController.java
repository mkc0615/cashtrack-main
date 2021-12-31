package com.cashtrack.cash_track.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {

    @RequestMapping("/myPage")
    public String myPage(@RequestBody String param){
        String resultStr = "";

        return resultStr;
    }

    @GetMapping("/userInfo")
    public String getUserInfo(){
        String resultStr = "";

        return resultStr;
    }

    @GetMapping("/flowInfo")
    public String getFlowInfo(){
        String resultStr = "";

        return resultStr;
    }

    @GetMapping("/assetInfo")
    public String getAssetInfo(){
        String resultStr = "";

        return resultStr;
    }
}
