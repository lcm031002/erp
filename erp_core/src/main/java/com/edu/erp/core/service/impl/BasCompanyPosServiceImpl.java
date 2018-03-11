package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasCompanyPosService;
import com.edu.erp.domain.BasCompanyPos;
import com.edu.erp.repository.BasCompanyPosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basCompanyPosService")
public class BasCompanyPosServiceImpl implements BasCompanyPosService {

    @Autowired
    private BasCompanyPosRepository basCompanyPosRepository;

    @Override
    public BasCompanyPos findOne(Long id) {
        return basCompanyPosRepository.findOne(id);
    }

    @Override
    public List<BasCompanyPos> findAll() {
        return basCompanyPosRepository.findAll();
    }

    @Override
    public List<BasCompanyPos> findAll(Sort sort) {
        return basCompanyPosRepository.findAll(sort);
    }

    @Override
    public List<BasCompanyPos> findAll(Example<BasCompanyPos> example) {
        return basCompanyPosRepository.findAll(example);
    }

    @Override
    public List<BasCompanyPos> findAll(Example<BasCompanyPos> example, Sort sort) {
        return basCompanyPosRepository.findAll(example, sort);
    }

    @Override
    public BasCompanyPos saveAndFlush(BasCompanyPos basCompanyPos) {
        return basCompanyPosRepository.saveAndFlush(basCompanyPos);
    }

    @Override
    public List<BasCompanyPos> save(Iterable<BasCompanyPos> iter) {
        return basCompanyPosRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basCompanyPosRepository.delete(id);
    }

    @Override
    public void delete(BasCompanyPos basCompanyPos) {
        basCompanyPosRepository.delete(basCompanyPos);
    }
}