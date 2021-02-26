package com.shopvintage.auctions.web.controllers;

import com.shopvintage.auctions.persistence.entities.Bidder;
import com.shopvintage.auctions.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
//import reactor.core.publisher.Mono;

@RestController
@RequestMapping("auctions")
public class AuctionsController {

    @Autowired
    private BiddersRepository biddersRepository;

    @PostMapping
    Bidder save(@Valid @RequestBody() Bidder bidder) {
        System.out.println("bidder = " + bidder);
        return new Bidder();
    }

    @GetMapping("bidder/{id}")
    Bidder findBidderById(@PathVariable("id") Integer id) {
        System.out.println("findBidderById, id = " + id);
        return this.biddersRepository.findById(id);
    }
//
//    @GetMapping("bidder-mono/{id}")
//    Mono<Bidder> findBidderByIdMono(@PathVariable("id") Integer id) {
//        System.out.println("findBidderByIdMono, id = " + id);
//        return this.biddersRepository.findByIdMono(id);
//    }

}
