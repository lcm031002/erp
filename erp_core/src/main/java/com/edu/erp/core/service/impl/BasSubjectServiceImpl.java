package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasSubjectService;
import com.edu.erp.domain.BasSubject;
import com.edu.erp.repository.BasSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basSubjectService")
public class BasSubjectServiceImpl implements BasSubjectService {

    @Autowired
    private BasSubjectRepository basSubjectRepository;

    @Override
    public BasSubject findOne(Long id) {
        return basSubjectRepository.findOne(id);
    }

    @Override
    public List<BasSubject> findAll() {
        return basSubjectRepository.findAll();
    }

    @Override
    public List<BasSubject> findAll(Sort sort) {
        return basSubjectRepository.findAll(sort);
    }

    @Override
    public List<BasSubject> findAll(Example<BasSubject> example) {
        return basSubjectRepository.findAll(example);
    }

    @Override
    public List<BasSubject> findAll(Example<BasSubject> example, Sort sort) {
        return basSubjectRepository.findAll(example, sort);
    }

    @Override
    public BasSubject saveAndFlush(BasSubject basSubject) {
        return basSubjectRepository.saveAndFlush(basSubject);
    }

    @Override
    public List<BasSubject> save(Iterable<BasSubject> iter) {
        return basSubjectRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basSubjectRepository.delete(id);
    }

    @Override
    public void delete(BasSubject basSubject) {
        basSubjectRepository.delete(basSubject);
    }
}