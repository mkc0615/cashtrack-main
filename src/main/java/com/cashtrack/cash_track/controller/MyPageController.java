package com.cashtrack.cash_track.controller;

import com.cashtrack.cash_track.domain.Book;
import com.cashtrack.cash_track.service.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/myPage")
public class MyPageController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    MyPageService pageService;

    @GetMapping("/book")
    public Book myPage(){
        return pageService.getMyBook();
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
