package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.Loan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BondRepository {

    public Loan findOne();

    public List<Loan> findAll();

    public int insertBond();

    public int updateBond();

    public int deleteBond();

}
