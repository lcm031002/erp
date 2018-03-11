package com.edu.erp.core.service;

import com.edu.erp.domain.BasSchool;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasSchoolService {
    BasSchool findOne(Long id);

    List<BasSchool> findAll();

    List<BasSchool> findAll(Sort sort);

    List<BasSchool> findAll(Example<BasSchool> example);

    List<BasSchool> findAll(Example<BasSchool> example, Sort sort);

    BasSchool saveAndFlush(BasSchool basSchool);

    List<BasSchool> save(Iterable<BasSchool> iter);

    void delete(Long id);

    void delete(BasSchool basSchool);
}