package com.edu.erp.repository;

import com.edu.erp.domain.BasCompanyAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasCompanyAccountRepository extends JpaRepository<BasCompanyAccount, Long> {
}