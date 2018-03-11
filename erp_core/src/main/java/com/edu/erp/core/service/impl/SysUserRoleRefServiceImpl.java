package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysUserRoleRefService;
import com.edu.erp.domain.SysUserRoleRef;
import com.edu.erp.repository.SysUserRoleRefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserRoleRefService")
public class SysUserRoleRefServiceImpl implements SysUserRoleRefService {

    @Autowired
    private SysUserRoleRefRepository sysUserRoleRefRepository;

    @Override
    public SysUserRoleRef findOne(Long id) {
        return sysUserRoleRefRepository.findOne(id);
    }

    @Override
    public List<SysUserRoleRef> findAll() {
        return sysUserRoleRefRepository.findAll();
    }

    @Override
    public List<SysUserRoleRef> findAll(Sort sort) {
        return sysUserRoleRefRepository.findAll(sort);
    }

    @Override
    public List<SysUserRoleRef> findAll(Example<SysUserRoleRef> example) {
        return sysUserRoleRefRepository.findAll(example);
    }

    @Override
    public List<SysUserRoleRef> findAll(Example<SysUserRoleRef> example, Sort sort) {
        return sysUserRoleRefRepository.findAll(example, sort);
    }

    @Override
    public SysUserRoleRef saveAndFlush(SysUserRoleRef sysUserRoleRef) {
        return sysUserRoleRefRepository.saveAndFlush(sysUserRoleRef);
    }

    @Override
    public List<SysUserRoleRef> save(Iterable<SysUserRoleRef> iter) {
        return sysUserRoleRefRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysUserRoleRefRepository.delete(id);
    }

    @Override
    public void delete(SysUserRoleRef sysUserRoleRef) {
        sysUserRoleRefRepository.delete(sysUserRoleRef);
    }
}