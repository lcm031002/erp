package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasSchoolService;
import com.edu.erp.domain.BasSchool;
import com.edu.erp.repository.BasSchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basSchoolService")
public class BasSchoolServiceImpl implements BasSchoolService {

    @Autowired
    private BasSchoolRepository basSchoolRepository;

    @Override
    public BasSchool findOne(Long id) {
        return basSchoolRepository.findOne(id);
    }

    @Override
    public List<BasSchool> findAll() {
        return basSchoolRepository.findAll();
    }

    @Override
    public List<BasSchool> findAll(Sort sort) {
        return basSchoolRepository.findAll(sort);
    }

    @Override
    public List<BasSchool> findAll(Example<BasSchool> example) {
        return basSchoolRepository.findAll(example);
    }

    @Override
    public List<BasSchool> findAll(Example<BasSchool> example, Sort sort) {
        return basSchoolRepository.findAll(example, sort);
    }

    @Override
    public BasSchool saveAndFlush(BasSchool basSchool) {
        return basSchoolRepository.saveAndFlush(basSchool);
    }

    @Override
    public List<BasSchool> save(Iterable<BasSchool> iter) {
        return basSchoolRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basSchoolRepository.delete(id);
    }

    @Override
    public void delete(BasSchool basSchool) {
        basSchoolRepository.delete(basSchool);
    }
}