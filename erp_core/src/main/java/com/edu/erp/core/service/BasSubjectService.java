package com.edu.erp.core.service;

import com.edu.erp.domain.BasSubject;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasSubjectService {
    BasSubject findOne(Long id);

    List<BasSubject> findAll();

    List<BasSubject> findAll(Sort sort);

    List<BasSubject> findAll(Example<BasSubject> example);

    List<BasSubject> findAll(Example<BasSubject> example, Sort sort);

    BasSubject saveAndFlush(BasSubject basSubject);

    List<BasSubject> save(Iterable<BasSubject> iter);

    void delete(Long id);

    void delete(BasSubject basSubject);
}