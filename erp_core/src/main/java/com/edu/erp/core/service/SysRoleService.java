package com.edu.erp.core.service;

import com.edu.erp.domain.SysRole;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysRoleService {
    SysRole findOne(Long id);

    List<SysRole> findAll();

    List<SysRole> findAll(Sort sort);

    List<SysRole> findAll(Example<SysRole> example);

    List<SysRole> findAll(Example<SysRole> example, Sort sort);

    SysRole saveAndFlush(SysRole sysRole);

    List<SysRole> save(Iterable<SysRole> iter);

    void delete(Long id);

    void delete(SysRole sysRole);
}