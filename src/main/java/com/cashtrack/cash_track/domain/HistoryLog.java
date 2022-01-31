package com.cashtrack.cash_track.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class HistoryLog {

    @Id
    private int entryNo;

    private LocalDate entryDate;
    private String entryType;
    private String entryDivision;
    private int entryAmount;
    private LocalDate inputDate;

    public void createEntry(String entryDateStr, String entryType, String entryDivision, int entryAmount){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.entryDate = LocalDate.parse(entryDateStr, dtf);
        this.entryType = entryType;
        this.entryDivision = entryDivision;
        this.entryAmount = entryAmount;
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
                ", inputDate=" + inputDate +
                '}';
    }
}
