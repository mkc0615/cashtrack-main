package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.api.SaveAccount;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {

    public SaveAccount findOne();

    public List<SaveAccount> findAll();

    public int insertAccount();

    public int updateAccount();

    public int deleteAccount();

}
