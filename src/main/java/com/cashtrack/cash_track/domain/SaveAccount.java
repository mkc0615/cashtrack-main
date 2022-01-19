package com.cashtrack.cash_track.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SaveAccount {

    @Id
    @GeneratedValue
    private int accNo;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String bankname;
    private int amount;
    private Long rate;
    private LocalDateTime inputDate;

    // === Define relationships === //


}
