package com.edu.erp.core.service;

import com.edu.erp.domain.SysUser;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface SysUserService {
    SysUser findOne(Long id);

    SysUser findByUsername(String username);

    List<SysUser> findAll();

    List<SysUser> findAll(Sort sort);

    List<SysUser> findAll(Example<SysUser> example);

    List<SysUser> findAll(Example<SysUser> example, Sort sort);

    SysUser saveAndFlush(SysUser sysUser);

    List<SysUser> save(Iterable<SysUser> iter);

    void delete(Long id);

    void delete(SysUser sysUser);
}