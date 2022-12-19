package com.smt.service;

import com.smt.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Mono<Client> isRegisteredAgent(String uid) {

        return clientRepository.findByUid(uid);
    }

}
