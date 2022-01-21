package com.cashtrack.cash_track.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Stock {

    @Id
    @GeneratedValue
    private int stockNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String market;

    private int price;

    private int volume;

    private LocalDateTime buyDate;

    private LocalDateTime sellDate;

    private LocalDateTime inputDate;

}
