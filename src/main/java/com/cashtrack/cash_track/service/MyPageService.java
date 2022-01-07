package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.Account;
import com.cashtrack.cash_track.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class MyPageService {

    AccountRepository accountRepository;

    // Add account
    public int addNewAccount(){
        Account account = new Account();

        int resultInt = accountRepository.insertAccount();
        return resultInt;
    }


    // withdraw account
    public int deleteAccount(){
        int resultInt = accountRepository.deleteAccount();

        return resultInt;
    }

}
