package com.edu.erp.core.service;

import com.edu.erp.domain.BasInvoiceCompany;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasInvoiceCompanyService {
    BasInvoiceCompany findOne(Long id);

    List<BasInvoiceCompany> findAll();

    List<BasInvoiceCompany> findAll(Sort sort);

    List<BasInvoiceCompany> findAll(Example<BasInvoiceCompany> example);

    List<BasInvoiceCompany> findAll(Example<BasInvoiceCompany> example, Sort sort);

    BasInvoiceCompany saveAndFlush(BasInvoiceCompany basInvoiceCompany);

    List<BasInvoiceCompany> save(Iterable<BasInvoiceCompany> iter);

    void delete(Long id);

    void delete(BasInvoiceCompany basInvoiceCompany);
}