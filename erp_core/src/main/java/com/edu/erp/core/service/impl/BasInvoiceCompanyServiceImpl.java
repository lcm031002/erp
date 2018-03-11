package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasInvoiceCompanyService;
import com.edu.erp.domain.BasInvoiceCompany;
import com.edu.erp.repository.BasInvoiceCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basInvoiceCompanyService")
public class BasInvoiceCompanyServiceImpl implements BasInvoiceCompanyService {

    @Autowired
    private BasInvoiceCompanyRepository basInvoiceCompanyRepository;

    @Override
    public BasInvoiceCompany findOne(Long id) {
        return basInvoiceCompanyRepository.findOne(id);
    }

    @Override
    public List<BasInvoiceCompany> findAll() {
        return basInvoiceCompanyRepository.findAll();
    }

    @Override
    public List<BasInvoiceCompany> findAll(Sort sort) {
        return basInvoiceCompanyRepository.findAll(sort);
    }

    @Override
    public List<BasInvoiceCompany> findAll(Example<BasInvoiceCompany> example) {
        return basInvoiceCompanyRepository.findAll(example);
    }

    @Override
    public List<BasInvoiceCompany> findAll(Example<BasInvoiceCompany> example, Sort sort) {
        return basInvoiceCompanyRepository.findAll(example, sort);
    }

    @Override
    public BasInvoiceCompany saveAndFlush(BasInvoiceCompany basInvoiceCompany) {
        return basInvoiceCompanyRepository.saveAndFlush(basInvoiceCompany);
    }

    @Override
    public List<BasInvoiceCompany> save(Iterable<BasInvoiceCompany> iter) {
        return basInvoiceCompanyRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basInvoiceCompanyRepository.delete(id);
    }

    @Override
    public void delete(BasInvoiceCompany basInvoiceCompany) {
        basInvoiceCompanyRepository.delete(basInvoiceCompany);
    }
}