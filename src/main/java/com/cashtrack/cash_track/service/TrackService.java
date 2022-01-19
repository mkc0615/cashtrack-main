package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.Loan;
import com.cashtrack.cash_track.repository.BondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService {

    BondRepository bondRepository;

    public int insertBond(){
        int resultInt = bondRepository.insertBond();
        return resultInt;
    }

    public int updateBond(){
        int resultInt = bondRepository.updateBond();
        return resultInt;
    }

    public int deleteBond(){
        int resultInt = bondRepository.deleteBond();
        return resultInt;
    }

    // bond list
    public List<Loan> bondList(){
        List<Loan> myBonds = bondRepository.findAll();
        return myBonds;
    }

}
