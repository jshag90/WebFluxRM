package com.smt.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyAdminSysRepository extends R2dbcRepository<PolicyAdminSys, Long> {
}
