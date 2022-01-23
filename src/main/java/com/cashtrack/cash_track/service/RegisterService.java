package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.repository.RegisterRepository;
import com.cashtrack.cash_track.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Service
public class RegisterService {

    @Autowired
    RegisterRepository registerRepository;

    // Join member
    @Transactional
    public int joinMember(HashMap<String, Object> param){

        // set user

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String thisDate = LocalDate.now().format(dtf);

        User newUser = new User();
        newUser.createUser(param.get("userId").toString(),
                           param.get("userPw").toString(),
                           thisDate);

        int resultInt = registerRepository.insertUser(newUser);

        return resultInt;
    }

    // Modify member
    public int modifyMember(){
        User thisUser = registerRepository.findOne();

        // modify set user

        int resultInt = registerRepository.insertUser(thisUser);
        return resultInt;
    }

    // Withdraw member


}
