package com.cashtrack.cash_track.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@NoArgsConstructor
public class SaveAccount {

    @Id
    @GeneratedValue
    private int accNo;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    private String bankName;
    private int amount;
    private double rate;
    private LocalDate inputDate;

    // 내부 생성자 메서드
    public void createSaveAccEntry(String bankName,
                                int amount,
                                double rate
                                ){
        this.bankName=bankName;
        this.amount=amount;
        this.rate = rate;
    }
}
