package com.edu.erp.core.service;

import com.edu.erp.domain.BasCompanyAccount;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasCompanyAccountService {
    BasCompanyAccount findOne(Long id);

    List<BasCompanyAccount> findAll();

    List<BasCompanyAccount> findAll(Sort sort);

    List<BasCompanyAccount> findAll(Example<BasCompanyAccount> example);

    List<BasCompanyAccount> findAll(Example<BasCompanyAccount> example, Sort sort);

    BasCompanyAccount saveAndFlush(BasCompanyAccount basCompanyAccount);

    List<BasCompanyAccount> save(Iterable<BasCompanyAccount> iter);

    void delete(Long id);

    void delete(BasCompanyAccount basCompanyAccount);
}