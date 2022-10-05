package com.lashe.example.api.service;

import com.daml.ledger.javaapi.data.Transaction;
import com.lashe.example.api.domain.CreateCorporation;
import com.lashe.example.api.domain.CreateTrader;
import com.lashe.example.api.domain.exchange.MatchOffers;
import reactor.core.publisher.Mono;

public interface CustodianService {
    Mono<Transaction> createCustodian(String workflowId);

    Mono<Transaction> createCorporation(CreateCorporation createCorporation, String workflowId);

    Mono<Transaction> createTrader(CreateTrader createTrader, String workflowId);

    Mono<Transaction> exerciseMatch(MatchOffers match, String workflowId);
}
