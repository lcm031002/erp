package com.edu.erp.core.service;

import com.edu.erp.domain.BasGrade;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasGradeService {
    BasGrade findOne(Long id);

    List<BasGrade> findAll();

    List<BasGrade> findAll(Sort sort);

    List<BasGrade> findAll(Example<BasGrade> example);

    List<BasGrade> findAll(Example<BasGrade> example, Sort sort);

    BasGrade saveAndFlush(BasGrade basGrade);

    List<BasGrade> save(Iterable<BasGrade> iter);

    void delete(Long id);

    void delete(BasGrade basGrade);
}