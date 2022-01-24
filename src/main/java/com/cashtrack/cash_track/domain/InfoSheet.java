package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class InfoSheet {

    private LocalDate todayDate;

    private double interestRate;

    private double exchangeRate;

    private double kospiPoint;

}
