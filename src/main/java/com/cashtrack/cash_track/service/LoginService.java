package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    UserRepository userRepository;

    public int loginCheck(User user){

        int resultInt = 0;

        User thisUser = userRepository.findOne();

        // user check

        return resultInt;
    }

}
