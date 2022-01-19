package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.SaveAccount;
import com.cashtrack.cash_track.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyPageService {

    AccountRepository accountRepository;

    // Get accounts
    public List<SaveAccount> getAccountList(){
        List<SaveAccount> resultList = accountRepository.findAll();
        return resultList;
    }

    // withdraw account
    public int deleteAccount(){
        int resultInt = accountRepository.deleteAccount();
        return resultInt;
    }

}
