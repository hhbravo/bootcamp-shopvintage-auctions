package com.shopvintage.auctions.persistence.repositories;

import com.shopvintage.auctions.persistence.entities.Bidder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "BOOTCAMP-SHOPVINTAGE-BIDDERS")
public interface BiddersRepository {

//    @GetMapping("bidders/{id}")
    @RequestMapping(method= RequestMethod.GET, value="bidders/{id}")
    Bidder findById(@PathVariable("id") Integer id);

}
