package com.edu.erp.core.service;

import com.edu.erp.domain.SysRoleMenuRef;
import com.edu.erp.entity.Permission;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysRoleMenuRefService {
    SysRoleMenuRef findOne(Long id);

    List<SysRoleMenuRef> findAll();

    List<SysRoleMenuRef> findAll(Sort sort);

    List<SysRoleMenuRef> findAll(Example<SysRoleMenuRef> example);

    List<SysRoleMenuRef> findAll(Example<SysRoleMenuRef> example, Sort sort);

    SysRoleMenuRef saveAndFlush(SysRoleMenuRef sysRoleMenuRef);

    List<SysRoleMenuRef> save(Iterable<SysRoleMenuRef> iter);

    void delete(Long id);

    void delete(SysRoleMenuRef sysRoleMenuRef);

    List<Permission> findPermissionByUserId(Long userId);
}