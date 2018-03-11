package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysRoleService;
import com.edu.erp.domain.SysRole;
import com.edu.erp.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleRepository sysRoleRepository;

    @Override
    public SysRole findOne(Long id) {
        return sysRoleRepository.findOne(id);
    }

    @Override
    public List<SysRole> findAll() {
        return sysRoleRepository.findAll();
    }

    @Override
    public List<SysRole> findAll(Sort sort) {
        return sysRoleRepository.findAll(sort);
    }

    @Override
    public List<SysRole> findAll(Example<SysRole> example) {
        return sysRoleRepository.findAll(example);
    }

    @Override
    public List<SysRole> findAll(Example<SysRole> example, Sort sort) {
        return sysRoleRepository.findAll(example, sort);
    }

    @Override
    public SysRole saveAndFlush(SysRole sysRole) {
        return sysRoleRepository.saveAndFlush(sysRole);
    }

    @Override
    public List<SysRole> save(Iterable<SysRole> iter) {
        return sysRoleRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysRoleRepository.delete(id);
    }

    @Override
    public void delete(SysRole sysRole) {
        sysRoleRepository.delete(sysRole);
    }
}