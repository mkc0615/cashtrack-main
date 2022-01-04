package com.cashtrack.cash_track.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    private int userNo;

    private String userPw;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private LocalDateTime inputDate;

}
