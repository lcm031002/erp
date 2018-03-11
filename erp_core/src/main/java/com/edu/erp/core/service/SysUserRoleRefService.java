package com.edu.erp.core.service;

import com.edu.erp.domain.SysUserRoleRef;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysUserRoleRefService {
    SysUserRoleRef findOne(Long id);

    List<SysUserRoleRef> findAll();

    List<SysUserRoleRef> findAll(Sort sort);

    List<SysUserRoleRef> findAll(Example<SysUserRoleRef> example);

    List<SysUserRoleRef> findAll(Example<SysUserRoleRef> example, Sort sort);

    SysUserRoleRef saveAndFlush(SysUserRoleRef sysUserRoleRef);

    List<SysUserRoleRef> save(Iterable<SysUserRoleRef> iter);

    void delete(Long id);

    void delete(SysUserRoleRef sysUserRoleRef);
}