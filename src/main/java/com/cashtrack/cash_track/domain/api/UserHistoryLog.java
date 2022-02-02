package com.cashtrack.cash_track.domain.api;

import com.cashtrack.cash_track.domain.HistoryLog;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UserHistoryLog {

    private int userNo;

    List<HistoryLog> historyList = new ArrayList<>();

    public void createList(int userNo, List<HistoryLog> historyList){
        this.userNo = userNo;
        this.historyList = historyList;
    }
}
