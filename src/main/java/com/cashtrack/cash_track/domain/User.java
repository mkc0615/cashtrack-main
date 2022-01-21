package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private int userNo;

    private String userPw;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private LocalDateTime inputDate;

}
