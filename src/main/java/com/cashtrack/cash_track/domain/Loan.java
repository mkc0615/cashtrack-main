package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue
    private int bondNo;

    @ManyToOne(fetch= FetchType.LAZY)
    private int userId;

    private int entry;

    private int amount;

    private double interestRate;

    private int interestAmount;

    private LocalDateTime lendTime;

    private LocalDateTime expireTime;

    public Loan(int bondNo, int userId, int entry, int amount, double interestRate, int interestAmount, LocalDateTime lendTime, LocalDateTime expireTime) {
        this.bondNo = bondNo;
        this.userId = userId;
        this.entry = entry;
        this.amount = amount;
        this.interestRate = interestRate;
        this.interestAmount = interestAmount;
        this.lendTime = lendTime;
        this.expireTime = expireTime;
    }
}
