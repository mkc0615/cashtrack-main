package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue
    private int bondNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    private int entry;
    private int amount;
    private double interestRate;
    private int interestAmount;
    private LocalDateTime lendTime;
    private LocalDateTime expireTime;

    // 내부 생성자 메서드
    public void createLoanEntry(int entry,
                                int amount,
                                double interestRate,
                                int interestAmount,
                                String lendTimeStr,
                                String expireTimeStr){
        this.entry=entry;
        this.amount=amount;
        this.interestRate = interestRate;
        this.interestAmount = interestAmount;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.lendTime = LocalDateTime.parse(lendTimeStr, dtf);
        this.expireTime = LocalDateTime.parse(expireTimeStr, dtf);
    }
}
