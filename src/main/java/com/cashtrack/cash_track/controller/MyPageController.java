package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.service.MyPageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {

    MyPageService myPageService;

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

    @RequestMapping("/addAccount")
    public String addAccount(){
        String resultStr;

        int resultInt = myPageService.addNewAccount();
        if(resultInt != 0){
            resultStr = "success";
        }else{
            resultStr = "error";
        }

        return resultStr;
    }

    @RequestMapping("/deleteAccount")
    public String deleteAccount(){
        String resultStr = "";

        int resultInt = myPageService.deleteAccount();
        if(resultInt != 0){
            resultStr = "success";
        }else{
            resultStr = "error";
        }

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
