package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "bookNo")
    private int bookNo;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "book")
    private List<SaveAccount> accountList = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<Stock> stockList = new ArrayList<>();

    @OneToMany(mappedBy = "book")
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
