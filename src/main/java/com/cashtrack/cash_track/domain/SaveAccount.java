package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SaveAccount {

    @Id
    @GeneratedValue
    private int accNo;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;

    private String bankName;
    private int amount;
    private double rate;
    private LocalDateTime inputDate;

}
