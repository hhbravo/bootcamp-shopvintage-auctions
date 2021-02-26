package com.shopvintage.auctions.persistence.repositories.impl;

import com.shopvintage.auctions.persistence.entities.Bidder;
import com.shopvintage.auctions.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
//import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Repository
public class BiddersRepositoryImpl { // implements BiddersRepository {

//    private final WebClient webClient;
//
////    @Value("${shopvintage.services.bidders_url}")
////    private String biddersUrl;
//
//    public BiddersRepositoryImpl(WebClient.Builder webClientBuilder,
//                                 @Value("${shopvintage.services.bidders_url}") String biddersUrl) {
//        System.out.println("biddersUrl = " + biddersUrl);
//        this.webClient = webClientBuilder.baseUrl(biddersUrl).build();
//    }
//
//    @Override
//    public Mono<Bidder> findByIdMono(Integer id) {
//        System.out.println("findByIdMono - id = " + id);
//        return this.webClient
//                .get()
//                .uri("/{id}", id)
//                .retrieve()
//                .bodyToMono(Bidder.class);
//    }
//
//    @Override
//    public Bidder findById(Integer id) {
//        return null;
//    }
}
