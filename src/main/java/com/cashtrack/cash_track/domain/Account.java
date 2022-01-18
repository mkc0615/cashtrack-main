package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    private int accNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private int userNo;

    private String bankname;

    private int amount;

    private Long rate;

    private LocalDateTime inputDate;

    public Account(int accNo, int userNo, String bankname, int amount, Long rate, LocalDateTime inputDate) {
        this.accNo = accNo;
        this.userNo = userNo;
        this.bankname = bankname;
        this.amount = amount;
        this.rate = rate;
        this.inputDate = inputDate;
    }
}
