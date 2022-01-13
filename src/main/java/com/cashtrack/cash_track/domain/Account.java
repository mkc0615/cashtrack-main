package com.cashtrack.cash_track.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Account {

    @Id
    private int accNo;

    private int userNo;

    private String bankname;

    private int amount;

    private Long rate;

    private LocalDateTime inputDate;
}
