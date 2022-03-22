package com.cashtrack.cash_track.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@RequiredArgsConstructor
public class UserSheet {

    private String userId;
    private String userPw;
    private String startDateStr;

    public UserSheet(String userId, String userPw, String startDateStr){
        this.userId = userId;
        this.userPw = userPw;
        this.startDateStr = startDateStr;
    }

}
