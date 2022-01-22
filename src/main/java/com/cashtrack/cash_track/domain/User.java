package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private int userNo;

    private String userId;
    private String userPw;

    private LocalDate startDate;
    private LocalDate endDate;

    private LocalDate inputDate;

    // 내부 생성자 메서드
    public void createUser(String userId,
                           String userPw,
                           String startDateStr
                          ){
        this.userId = userId;
        this.userPw = userPw;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.startDate = LocalDate.parse(startDateStr, dtf);
        this.inputDate = LocalDate.now();
    }
}
