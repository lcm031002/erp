package com.edu.erp.core.service;

import com.edu.erp.domain.SysConfig;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysConfigService {
    SysConfig findOne(Long id);

    List<SysConfig> findAll();

    List<SysConfig> findAll(Sort sort);

    List<SysConfig> findAll(Example<SysConfig> example);

    List<SysConfig> findAll(Example<SysConfig> example, Sort sort);

    SysConfig saveAndFlush(SysConfig sysConfig);

    List<SysConfig> save(Iterable<SysConfig> iter);

    void delete(Long id);

    void delete(SysConfig sysConfig);
}