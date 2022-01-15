package com.cashtrack.cash_track.repository;

import com.cashtrack.cash_track.domain.Stock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository {

    public Stock findOne();

    public List<Stock> findAll();

    public int insertStock();

    public int updateStock();

    public int deleteStock();

}
