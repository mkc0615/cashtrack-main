package com.cashtrack.cash_track.domain.api;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UserStockList {

    private int userNo;

    List<Stock> stockList = new ArrayList<>();

    public void createList(int userNo, List<Stock> stockList){
        this.userNo = userNo;
        this.stockList = stockList;
    }
}
