package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.service.CommonService;
import com.cashtrack.cash_track.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @Autowired
    CommonService cmmService;

    // Register member
    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void joinMember(@RequestBody String param){
        HashMap<String, Object> paramsMap = cmmService.jsonToString(param);
        registerService.joinMember(paramsMap);
    }
}
