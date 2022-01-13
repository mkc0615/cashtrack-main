package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.MyBond;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BondRepository {

    public MyBond findOne();

    public List<MyBond> findAll();

    public int insertBond();

    public int updateBond();

    public int deleteBond();

}
