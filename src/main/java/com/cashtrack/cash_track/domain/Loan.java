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

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private int entry;

    private int amount;

    private double interestRate;

    private int interestAmount;

    private LocalDateTime lendTime;

    private LocalDateTime expireTime;

}
