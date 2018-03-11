package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasCompanyAccountService;
import com.edu.erp.domain.BasCompanyAccount;
import com.edu.erp.repository.BasCompanyAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basCompanyAccountService")
public class BasCompanyAccountServiceImpl implements BasCompanyAccountService {

    @Autowired
    private BasCompanyAccountRepository basCompanyAccountRepository;

    @Override
    public BasCompanyAccount findOne(Long id) {
        return basCompanyAccountRepository.findOne(id);
    }

    @Override
    public List<BasCompanyAccount> findAll() {
        return basCompanyAccountRepository.findAll();
    }

    @Override
    public List<BasCompanyAccount> findAll(Sort sort) {
        return basCompanyAccountRepository.findAll(sort);
    }

    @Override
    public List<BasCompanyAccount> findAll(Example<BasCompanyAccount> example) {
        return basCompanyAccountRepository.findAll(example);
    }

    @Override
    public List<BasCompanyAccount> findAll(Example<BasCompanyAccount> example, Sort sort) {
        return basCompanyAccountRepository.findAll(example, sort);
    }

    @Override
    public BasCompanyAccount saveAndFlush(BasCompanyAccount basCompanyAccount) {
        return basCompanyAccountRepository.saveAndFlush(basCompanyAccount);
    }

    @Override
    public List<BasCompanyAccount> save(Iterable<BasCompanyAccount> iter) {
        return basCompanyAccountRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basCompanyAccountRepository.delete(id);
    }

    @Override
    public void delete(BasCompanyAccount basCompanyAccount) {
        basCompanyAccountRepository.delete(basCompanyAccount);
    }
}