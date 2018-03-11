package com.edu.erp.core.service;

import com.edu.erp.domain.SysRoleModuleRef;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysRoleModuleRefService {
    SysRoleModuleRef findOne(Long id);

    List<SysRoleModuleRef> findAll();

    List<SysRoleModuleRef> findAll(Sort sort);

    List<SysRoleModuleRef> findAll(Example<SysRoleModuleRef> example);

    List<SysRoleModuleRef> findAll(Example<SysRoleModuleRef> example, Sort sort);

    SysRoleModuleRef saveAndFlush(SysRoleModuleRef sysRoleModuleRef);

    List<SysRoleModuleRef> save(Iterable<SysRoleModuleRef> iter);

    void delete(Long id);

    void delete(SysRoleModuleRef sysRoleModuleRef);
}