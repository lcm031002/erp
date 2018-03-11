package com.edu.erp.core.service;

import com.edu.erp.domain.SysLog;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysLogService {
    SysLog findOne(Long id);

    List<SysLog> findAll();

    List<SysLog> findAll(Sort sort);

    List<SysLog> findAll(Example<SysLog> example);

    List<SysLog> findAll(Example<SysLog> example, Sort sort);

    SysLog saveAndFlush(SysLog sysLog);

    List<SysLog> save(Iterable<SysLog> iter);

    void delete(Long id);

    void delete(SysLog sysLog);
}