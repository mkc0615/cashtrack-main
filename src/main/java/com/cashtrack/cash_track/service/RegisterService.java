package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.repository.RegisterRepository;
import com.cashtrack.cash_track.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterRepository registerRepository;

    // Join member
    public int joinMember(){

        User newUser = new User();

        // set user

        int resultInt = registerRepository.insertUser();

        return resultInt;
    }

    // Modify member
    public int modifyMember(){
        User thisUser = registerRepository.findOne();

        // modify set user

        int resultInt = registerRepository.insertUser();
        return resultInt;
    }

    // Withdraw member


}
