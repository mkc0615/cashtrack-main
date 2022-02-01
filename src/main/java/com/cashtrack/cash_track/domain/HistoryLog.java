package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@RequiredArgsConstructor
public class HistoryLog {

    @Id
    private int entryNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userNo")
    private User userNo;

    private LocalDate entryDate;
    private String entryType;
    private String entryDivision;
    private int entryAmount;
    private String entryDetail;
    private LocalDate inputDate;

    public void createEntry(String entryDateStr, String entryType, String entryDivision, int entryAmount){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.entryDate = LocalDate.parse(entryDateStr, dtf);
        this.entryType = entryType;
        this.entryDivision = entryDivision;
        this.entryAmount = entryAmount;
        this.entryDetail = entryDetail;
        this.inputDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "HistoryLog{" +
                "entryNo=" + entryNo +
                ", entryDate=" + entryDate +
                ", entryType='" + entryType + '\'' +
                ", entryDivision='" + entryDivision + '\'' +
                ", entryAmount=" + entryAmount +
                ", entryDetail='" + entryDetail + '\'' +
                ", inputDate=" + inputDate +
                '}';
    }
}
