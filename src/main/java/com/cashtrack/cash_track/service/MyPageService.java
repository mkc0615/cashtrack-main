package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.*;
import com.cashtrack.cash_track.domain.api.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MyPageService {

    @Autowired
    RestTemplate restTemplate;

    // Get Book
    public Book getMyBook(int userNo){
        User user = getUser();
        List<SaveAccount> thisSaveAcc = getAccountList(userNo);
        List<Stock> thisStock = getStockList(userNo);
        List<Loan> thisLoan = getLoanList(userNo);

        Book book = new Book();
        book.createBookEntry(user, thisSaveAcc, thisStock, thisLoan);
        return book;
    }

    // Get User
    public User getUser(){
        User user = new User();
        user.createUser("mkc0615", "12345", "2021-12-01"); // placeholder
        return user;
    }

    // Get Savings
    public List<SaveAccount> getAccountList(int userNo){
        ResponseEntity<UserSavingList> response = restTemplate.getForEntity("http://cashtrack-savings/saving/mine/"+userNo, UserSavingList.class);
        return response.getBody().getSavingsList();
    }

    // Add Savings
    public int addAccount(SaveAccount saveAccount){
        ResponseEntity<Integer> response = restTemplate.postForEntity("http://cashtrack-savings/saving/add", saveAccount, Integer.class);
        return response.getBody();
    }

    // Get Stocks
    public List<Stock> getStockList(int userNo){
        ResponseEntity<UserStockList> response = restTemplate.getForEntity("http://cashtrack-savings/stock/mine/"+userNo, UserStockList.class);
        return response.getBody().getStockList();
    }

    // Add Stock
    public int addStock(Stock stock){
        ResponseEntity<Integer> response = restTemplate.postForEntity("http://cashtrack-savings/stock/add", stock, Integer.class);
        return response.getBody();
    }

    // Get Loans
    public List<Loan> getLoanList(int userNo){
        ResponseEntity<UserLoanList> response = restTemplate.getForEntity("http://cashtrack-loans/loan/mine/"+userNo, UserLoanList.class);
        return response.getBody().getLoanList();
    }

    // Add Loan
    public int addLoan(Loan loan){
        ResponseEntity<Integer> response = restTemplate.postForEntity("http://cashtrack-loans/loan/add", loan, Integer.class);
        return response.getBody();
    }

    public InfoSheet getInvestInfo() {
        InfoSheet info = new InfoSheet();

        return info;
    }
}
