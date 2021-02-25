package com.shopvintage.auctions.web.controllers;

import com.shopvintage.auctions.persistence.entities.Bidder;
import com.shopvintage.auctions.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auctions")
public class AuctionsController {

    @Autowired
    private BiddersRepository biddersRepository;

    @GetMapping("bidder/{id}")
    Bidder findBidderById(@PathVariable("id") Integer id) {
        System.out.println("findBidderById, id = " + id);
        return this.biddersRepository.findById(id);
    }

}
