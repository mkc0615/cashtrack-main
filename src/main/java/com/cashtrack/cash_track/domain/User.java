package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Array;
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

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Account> myAccounts = new ArrayList<>();

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<Stock> myStocks = new ArrayList<>();

    @OneToMany(mappedBy = "bonds", cascade = CascadeType.ALL)
    private List<MyBond> myBonds = new ArrayList<>();

    private LocalDateTime inputDate;

    public User(int userNo, String userPw, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime inputDate) {
        this.userNo = userNo;
        this.userPw = userPw;
        this.startDate = startDate;
        this.endDate = endDate;
        this.inputDate = inputDate;
    }
}
