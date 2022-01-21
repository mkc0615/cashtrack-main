package com.cashtrack.cash_track.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stock {

    @Id
    @GeneratedValue
    private int stockNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    private String market;

    private int price;

    private int volume;

    private LocalDateTime buyDate;

    private LocalDateTime sellDate;

    private LocalDateTime inputDate;

    // 내부 생성자 메서드
    public void createStockEntry(String market,
                                int price,
                                int volume,
                                String buyDateStr,
                                String sellDateStr
                                ){
        this.market=market;
        this.price=price;
        this.volume = volume;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.buyDate = LocalDateTime.parse(buyDateStr, dtf);
        this.sellDate = LocalDateTime.parse(sellDateStr, dtf);
        this.inputDate = LocalDateTime.now();
    }
}
