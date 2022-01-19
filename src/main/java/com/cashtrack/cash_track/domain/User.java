package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private int userNo;

    private String userPw;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SaveAccount> myAccounts = new ArrayList<>();

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<Stock> myStocks = new ArrayList<>();

    @OneToMany(mappedBy = "bonds", cascade = CascadeType.ALL)
    private List<Loan> myBonds = new ArrayList<>();

    private LocalDateTime inputDate;

    public void addAccount(SaveAccount account){

    }

    public void addStock(Stock stock){

    }

    public void addBond(Loan mybond){

    }


}
