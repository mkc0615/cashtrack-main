package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.service.CommonService;
import com.cashtrack.cash_track.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @Autowired
    CommonService cmmService;

    @RequestMapping("login")
    public String loginSequence(@RequestBody String param, HttpServletRequest request, Model model){

        HashMap<String, Object> thisUser = cmmService.jsonToString(param);
        User user = new User();

        int loginResult = loginService.loginCheck(user);

        // check login process
        if(loginResult == 0){
            return "success";
        }else{
            return "fail";
        }
    }
}
