package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.Account;
import com.cashtrack.cash_track.domain.MyBond;
import com.cashtrack.cash_track.repository.AccountRepository;
import com.cashtrack.cash_track.repository.BondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyPageService {

    AccountRepository accountRepository;

    // Get accounts
    public List<Account> getAccountList(){
        List<Account> resultList = accountRepository.findAll();
        return resultList;
    }

    // Add account
    public int addNewAccount(){
        Account account = new Account();

        int resultInt = accountRepository.insertAccount();
        return resultInt;
    }

    // Modify account
    public int modifyAccount(){
        Account account = new Account();
        int resultInt = accountRepository.updateAccount();
        return resultInt;
    }

    // withdraw account
    public int deleteAccount(){
        int resultInt = accountRepository.deleteAccount();
        return resultInt;
    }

}
