package com.edu.erp.core.service;

import com.edu.erp.domain.SysModule;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysModuleService {
    SysModule findOne(Long id);

    List<SysModule> findAll();

    List<SysModule> findAll(Sort sort);

    List<SysModule> findAll(Example<SysModule> example);

    List<SysModule> findAll(Example<SysModule> example, Sort sort);

    SysModule saveAndFlush(SysModule sysModule);

    List<SysModule> save(Iterable<SysModule> iter);

    void delete(Long id);

    void delete(SysModule sysModule);
}