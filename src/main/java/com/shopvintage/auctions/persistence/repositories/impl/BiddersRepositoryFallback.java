package com.shopvintage.auctions.persistence.repositories.impl;

import com.shopvintage.auctions.persistence.entities.Bidder;
import com.shopvintage.auctions.persistence.repositories.BiddersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BiddersRepositoryFallback implements BiddersRepository {

    private final Logger LOGGER = LoggerFactory.getLogger(BiddersRepositoryFallback.class);

    @Override
    public Bidder findById(Integer id) {
        LOGGER.info("CircuitBreaker - Fallback - findById");
        return new Bidder(id,"none","no-email");
    }
}
