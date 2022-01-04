package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {

    public Account findOne();

    public List<Account> findAll();

}
