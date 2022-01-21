package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@NoArgsConstructor
public class Book {

    @Id
    private int bookNo;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "book")
    private List<SaveAccount> accountList = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<Stock> stockList = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<Loan> loanList = new ArrayList<>();

}
