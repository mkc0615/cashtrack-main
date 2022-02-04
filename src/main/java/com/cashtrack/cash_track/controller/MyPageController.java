package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.domain.Book;
import com.cashtrack.cash_track.domain.HistoryLog;
import com.cashtrack.cash_track.domain.InfoSheet;
import com.cashtrack.cash_track.domain.api.Loan;
import com.cashtrack.cash_track.domain.api.SaveAccount;
import com.cashtrack.cash_track.domain.api.Stock;
import com.cashtrack.cash_track.service.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/myPage")
public class MyPageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    MyPageService pageService;

    // 기록부 가져오기
    @GetMapping("/book")
    @CrossOrigin("*")
    public Book myPage(){
        String userId = "mkc0615";

        Book myBook = pageService.getMyBook(userId);

        // model.addAttribute("book", myBook);

        return myBook;
        // return "myPage/book";
    }

    // 예적금 추가
    @PostMapping("/saving/add")
    public int insertSavings(){
        SaveAccount newSaving = new SaveAccount();
        newSaving.createSaveAccEntry("bankname",4000000, 0.50); // placeholder
        return pageService.addAccount(newSaving);
    }

    // 주식 추가
    @PostMapping("/stock/add")
    public int insertStocks(){
        Stock newStock = new Stock();
        newStock.createStockEntry("marketnm", 200000, 10, "2022-01-25"); // placeholder
        return pageService.addStock(newStock);
    }

    // 대출 및 할부 추가
    @PostMapping("/loan/add")
    public int insertLoans(){
        Loan newLoan = new Loan();
        newLoan.createLoanEntry(1, 500000, 0.08, 200000, "2022-01-25"); // placeholder
        return pageService.addLoan(newLoan);
    }

    @GetMapping("/historyLog")
    @CrossOrigin("*")
    public List<HistoryLog> historyLog(int userNo){
        return pageService.getHistory(userNo);
    }

    @GetMapping("/investInfo")
    @CrossOrigin("*")
    public InfoSheet myInfoSheet(){
        return pageService.getInvestInfo();
    }

    // use WebClient Builder
    /* case of async
    SaveAccount saveAccount = webClientBuilder.build()
            .get()
            .uri("https://localhost:8082/savings/mine")
            .retrieve()
            .bodyToMono(SaveAccount.class) // MEANS ::: in async, this object will eventually come!
            .block(); // MEANS ::: this blocks the method from finishing until we get the result object
    */
}
