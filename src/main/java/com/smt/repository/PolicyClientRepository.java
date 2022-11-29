package com.smt.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyClientRepository extends R2dbcRepository<PolicyClient, Long> {
}
