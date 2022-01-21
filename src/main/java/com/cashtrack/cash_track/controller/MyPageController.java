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
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Controller
public class MyPageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;


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
    public String getAccountList(){
        // use RestTemplate
        SaveAccount saveAccount = restTemplate.getForObject("http://cashtrack-savings/savings/mine", SaveAccount.class);

        String resultStr = "";

        if(saveAccount == null){

            resultStr = "its null for now";

        }else{

            resultStr = saveAccount.toString();
        }

        // use WebClient Builder
        /* case of async
        SaveAccount saveAccount = webClientBuilder.build()
                .get()
                .uri("https://localhost:8082/savings/mine")
                .retrieve()
                .bodyToMono(SaveAccount.class) // MEANS ::: in async, this object will eventually come!
                .block(); // MEANS ::: this blocks the method from finishing until we get the result object
                */
        return resultStr;
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
