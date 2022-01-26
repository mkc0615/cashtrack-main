package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    public int loginCheck(User user){

        User thisUser = userRepository.findOne();

        if(user.getUserNo() != thisUser.getUserNo()){
            return 1;
        }else if(user.getUserId() != thisUser.getUserId()){
            return 1;
        }else if(user.getUserPw() != thisUser.getUserPw()){
            return 1;
        }

        return 0;
    }

}
