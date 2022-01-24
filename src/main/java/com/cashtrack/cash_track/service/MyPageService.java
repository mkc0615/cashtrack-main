package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.*;
import com.cashtrack.cash_track.domain.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class MyPageService {

    @Autowired
    RestTemplate restTemplate;

    // Get Book
    public Book getMyBook(){
        User user = getUser();
        List<SaveAccount> thisSaveAcc = getAccountList();
        List<Stock> thisStock = getStockList();
        List<Loan> thisLoan = getLoanList();

        Book book = new Book();
        book.createBookEntry(user, thisSaveAcc, thisStock, thisLoan);
        return book;
    }

    // Get User
    public User getUser(){
        User user = new User();
        user.createUser("mkc0615", "12345", "2021-12-01");
        return user;
    }

    // Get Savings
    public List<SaveAccount> getAccountList(){
        ResponseEntity<UserSavingList> response = restTemplate.getForEntity("http://cashtrack-savings/saving/mine", UserSavingList.class);
        return response.getBody().getSavingsList();
    }

    // Get Stocks
    public List<Stock> getStockList(){
        ResponseEntity<UserStockList> response = restTemplate.getForEntity("http://cashtrack-savings/stock/mine", UserStockList.class);
        return response.getBody().getStockList();
    }

    // Get Loans
    public List<Loan> getLoanList(){
        ResponseEntity<UserLoanList> response = restTemplate.getForEntity("http://cashtrack-loans/loan/mine", UserLoanList.class);
        return response.getBody().getLoanList();
    }

    public InfoSheet getInvestInfo() {
        InfoSheet info = new InfoSheet();

        return info;
    }
}
