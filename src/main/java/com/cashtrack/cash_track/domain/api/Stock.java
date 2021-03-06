package com.cashtrack.cash_track.domain.api;

import com.cashtrack.cash_track.domain.Book;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor
public class Stock {

    private int stockNo;
    private int userNo;
    private String market;
    private int price;
    private int volume;
    private LocalDate buyDate;
    private LocalDate sellDate;
    private LocalDate inputDate;

    // 내부 생성자 메서드
    public void createStockEntry(String market,
                                    int price,
                                    int volume,
                                    String buyDateStr
                                ){
        this.market=market;
        this.price=price;
        this.volume = volume;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.buyDate = LocalDate.parse(buyDateStr, dtf);
        this.inputDate = LocalDate.now();
    }
}
