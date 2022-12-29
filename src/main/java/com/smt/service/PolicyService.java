package com.smt.service;

import com.smt.repository.PolicyAdminSys;
import com.smt.repository.PolicyAdminSysRepository;
import com.smt.repository.PolicyClient;
import com.smt.repository.PolicyClientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private final PolicyAdminSysRepository policyAdminSysRepository;
    private final PolicyClientRepository policyClientRepository;

    public Flux<Object> getClientAgentPolicy() {
        Mono<PolicyAdminSys> monoPolicyAdminSys = policyAdminSysRepository.findById(1L);
        Mono<PolicyClient> monoPolicyClient = policyClientRepository.findById(1L);

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");

        Flux<String> fruitFlux = Flux.fromIterable(fruitList);


        return Flux.merge(monoPolicyAdminSys, monoPolicyClient);
    }
}
