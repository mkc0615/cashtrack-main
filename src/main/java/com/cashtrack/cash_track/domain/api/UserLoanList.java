package com.cashtrack.cash_track.domain.api;

import com.cashtrack.cash_track.domain.Loan;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class UserLoanList {

    private int userNo;

    List<Loan> loanList = new ArrayList<>();

    public void createList(int userNo, List<Loan> loanList){
        this.userNo = userNo;
        this.loanList = loanList;
    }
}
