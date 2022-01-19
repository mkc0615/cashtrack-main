package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.domain.SaveAccount;
import com.cashtrack.cash_track.service.MyPageService;
import com.cashtrack.cash_track.service.StockService;
import com.cashtrack.cash_track.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MyPageController {

    @Autowired
    MyPageService myPageService;

    @Autowired
    TrackService trackService;

    @Autowired
    StockService stockService;

    RestTemplate restTemplate = new RestTemplate();

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

    // 예적금
    @GetMapping("/MySavings")
    public SaveAccount getAccountList(){

        return restTemplate.getForObject("https://localhost:8082/savings/mine", SaveAccount.class);

    }

    // 주식
    @GetMapping("/myStocks")
    public String getAssetInfo(){
        String resultStr = "";

        return resultStr;
    }

    // 대출 및 할부
    @GetMapping("/myLoans")
    public String getTrackInfo(){
        String resultStr = "";

        return resultStr;
    }
}
