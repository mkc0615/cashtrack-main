package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.domain.Account;
import com.cashtrack.cash_track.domain.MyBond;
import com.cashtrack.cash_track.domain.Stock;
import com.cashtrack.cash_track.service.MyPageService;
import com.cashtrack.cash_track.service.StockService;
import com.cashtrack.cash_track.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyPageController {

    @Autowired
    MyPageService myPageService;

    @Autowired
    TrackService trackService;

    @Autowired
    StockService stockService;

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

    // Account management
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

    @GetMapping("/accounts")
    public String getAccountList(){
        String resultStr = "";

        List<Account> accountList = myPageService.getAccountList();

        return resultStr;
    }

    @GetMapping("/stocks")
    public String getAssetInfo(){
        String resultStr = "";

        List<Stock> stockList = stockService.stockList();

        return resultStr;
    }

    @GetMapping("/tracks")
    public String getTrackInfo(){
        String resultStr = "";

        List<MyBond> bondList = trackService.bondList();

        return resultStr;
    }
}
