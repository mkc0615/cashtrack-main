package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
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

    private String role;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "userNo")
    List<HistoryLog> historyLogs = new ArrayList<>();

    private LocalDate inputDate;

    // 내부 생성자 메서드
    public void createUser(String userId,
                           String userPw,
                           String startDateStr
                          ){
        this.userId = userId;
        this.userPw = userPw;
        this.role = "user";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.startDate = LocalDate.parse(startDateStr, dtf);
        this.inputDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", inputDate=" + inputDate +
                '}';
    }
}
