package com.edu.erp.core.service;

import com.edu.erp.domain.BasCompanyPos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasCompanyPosService {
    BasCompanyPos findOne(Long id);

    List<BasCompanyPos> findAll();

    List<BasCompanyPos> findAll(Sort sort);

    List<BasCompanyPos> findAll(Example<BasCompanyPos> example);

    List<BasCompanyPos> findAll(Example<BasCompanyPos> example, Sort sort);

    BasCompanyPos saveAndFlush(BasCompanyPos basCompanyPos);

    List<BasCompanyPos> save(Iterable<BasCompanyPos> iter);

    void delete(Long id);

    void delete(BasCompanyPos basCompanyPos);
}