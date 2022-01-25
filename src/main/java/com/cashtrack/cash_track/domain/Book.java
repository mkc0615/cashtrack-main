package com.cashtrack.cash_track.domain;

import com.cashtrack.cash_track.domain.api.Loan;
import com.cashtrack.cash_track.domain.api.SaveAccount;
import com.cashtrack.cash_track.domain.api.Stock;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Getter
@NoArgsConstructor
public class Book {

    private User user;

    private List<SaveAccount> accountList = new ArrayList<>();

    private List<Stock> stockList = new ArrayList<>();

    private List<Loan> loanList = new ArrayList<>();

    // 내부 생성자 메서드
    public void createBookEntry(User user,
                                 List<SaveAccount> accountList,
                                 List<Stock> stockList,
                                 List<Loan> loanList
                                 ){
        this.user=user;
        this.accountList=accountList;
        this.stockList = stockList;
        this.loanList = loanList;
    }
}
