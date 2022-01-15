package com.cashtrack.cash_track.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Stock {

    @Id
    private int stockNo;

    private String market;

    private int price;

    private int volume;

    private LocalDateTime buyDate;

    private LocalDateTime sellDate;

    private LocalDateTime inputDate;

}
