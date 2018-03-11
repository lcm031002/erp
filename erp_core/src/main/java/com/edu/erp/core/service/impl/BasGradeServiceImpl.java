package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.BasGradeService;
import com.edu.erp.domain.BasGrade;
import com.edu.erp.repository.BasGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("basGradeService")
public class BasGradeServiceImpl implements BasGradeService {

    @Autowired
    private BasGradeRepository basGradeRepository;

    @Override
    public BasGrade findOne(Long id) {
        return basGradeRepository.findOne(id);
    }

    @Override
    public List<BasGrade> findAll() {
        return basGradeRepository.findAll();
    }

    @Override
    public List<BasGrade> findAll(Sort sort) {
        return basGradeRepository.findAll(sort);
    }

    @Override
    public List<BasGrade> findAll(Example<BasGrade> example) {
        return basGradeRepository.findAll(example);
    }

    @Override
    public List<BasGrade> findAll(Example<BasGrade> example, Sort sort) {
        return basGradeRepository.findAll(example, sort);
    }

    @Override
    public BasGrade saveAndFlush(BasGrade basGrade) {
        return basGradeRepository.saveAndFlush(basGrade);
    }

    @Override
    public List<BasGrade> save(Iterable<BasGrade> iter) {
        return basGradeRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        basGradeRepository.delete(id);
    }

    @Override
    public void delete(BasGrade basGrade) {
        basGradeRepository.delete(basGrade);
    }
}