package com.cashtrack.cash_track.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Stock {

    @Id
    @GeneratedValue
    private int stockNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private int userId;

    private String market;

    private int price;

    private int volume;

    private LocalDateTime buyDate;

    private LocalDateTime sellDate;

    private LocalDateTime inputDate;

    public Stock(){

    }

    public Stock(int stockNo, int userId, String market, int price, int volume, LocalDateTime buyDate, LocalDateTime sellDate, LocalDateTime inputDate) {
        this.stockNo = stockNo;
        this.userId = userId;
        this.market = market;
        this.price = price;
        this.volume = volume;
        this.buyDate = buyDate;
        this.sellDate = sellDate;
        this.inputDate = inputDate;
    }
}
