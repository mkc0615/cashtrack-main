package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.Account;
import com.cashtrack.cash_track.domain.MyBond;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {

    public Account findOne();

    public List<Account> findAll();

    public int insertAccount();

    public int updateAccount();

    public int deleteAccount();

    public List<MyBond> bondList();

}
