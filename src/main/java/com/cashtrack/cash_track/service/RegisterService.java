package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.User;
import com.cashtrack.cash_track.domain.UserSheet;
import com.cashtrack.cash_track.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@Service
@Transactional
@RequiredArgsConstructor
public class RegisterService {

    UserRepository userRepository;

    // Join member
    public int joinMember(UserSheet userSheet){

        // set user
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String thisDate = LocalDate.now().format(dtf);

        // user 저장
        User newUser = new User();
        newUser.createUser(userSheet.getUserId(), userSheet.getUserPw(), thisDate);

        // 저장된 user 번호 확인하고 반환
        User thisUser = userRepository.findByUserId(newUser.getUserId());
        return thisUser.getUserNo();
    }

    // Modify member
    public int modifyMember(){
        // User thisUser = userRepository.findOne();

        // modify set user

        // int resultInt = userRepository.insertUser(thisUser);
        int resultInt = 0;
        return resultInt;
    }

    // Withdraw member


}
