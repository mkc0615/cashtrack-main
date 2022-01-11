package com.cashtrack.cash_track.domain;


import javax.persistence.Id;
import java.time.LocalDateTime;

public class MyBond {

    @Id
    private int seq;

    private int entry;

    private int amount;

    private double interestRate;

    private int interestAmount;

    private LocalDateTime lendTime;

    private LocalDateTime expireTime;

}
