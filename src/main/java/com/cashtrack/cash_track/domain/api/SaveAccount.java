package com.cashtrack.cash_track.domain.api;

import com.cashtrack.cash_track.domain.Book;
import com.cashtrack.cash_track.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class SaveAccount {

    private int accNo;
    private int userNo;
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
