package com.smt.endpoint;

import com.smt.service.ClientService;
import com.smt.service.PolicyService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class PolicyEndpoint {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final PolicyService policyService;

    @GetMapping("/policy")
    public Flux<Object> findPolicy() {
        logger.info("/policy");
        return policyService.getClientAgentPolicy();
    }

}