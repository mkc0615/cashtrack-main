package com.cashtrack.cash_track.service;

import com.cashtrack.cash_track.domain.Stock;
import com.cashtrack.cash_track.repository.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    StockRepository stockRepository;

    public int insertStock(){
        int resultInt = stockRepository.insertStock();
        return resultInt;
    }

    public int updateStock(){
        int resultInt = stockRepository.updateStock();
        return resultInt;
    }

    public int deleteStock(){
        int resultInt = stockRepository.deleteStock();
        return resultInt;
    }

    public List<Stock> stockList(){
        List<Stock> myStocks = stockRepository.findAll();
        return myStocks;
    }

}
