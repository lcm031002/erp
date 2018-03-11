package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysRoleModuleRefService;
import com.edu.erp.domain.SysRoleModuleRef;
import com.edu.erp.repository.SysRoleModuleRefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysRoleModuleRefService")
public class SysRoleModuleRefServiceImpl implements SysRoleModuleRefService {

    @Autowired
    private SysRoleModuleRefRepository sysRoleModuleRefRepository;

    @Override
    public SysRoleModuleRef findOne(Long id) {
        return sysRoleModuleRefRepository.findOne(id);
    }

    @Override
    public List<SysRoleModuleRef> findAll() {
        return sysRoleModuleRefRepository.findAll();
    }

    @Override
    public List<SysRoleModuleRef> findAll(Sort sort) {
        return sysRoleModuleRefRepository.findAll(sort);
    }

    @Override
    public List<SysRoleModuleRef> findAll(Example<SysRoleModuleRef> example) {
        return sysRoleModuleRefRepository.findAll(example);
    }

    @Override
    public List<SysRoleModuleRef> findAll(Example<SysRoleModuleRef> example, Sort sort) {
        return sysRoleModuleRefRepository.findAll(example, sort);
    }

    @Override
    public SysRoleModuleRef saveAndFlush(SysRoleModuleRef sysRoleModuleRef) {
        return sysRoleModuleRefRepository.saveAndFlush(sysRoleModuleRef);
    }

    @Override
    public List<SysRoleModuleRef> save(Iterable<SysRoleModuleRef> iter) {
        return sysRoleModuleRefRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysRoleModuleRefRepository.delete(id);
    }

    @Override
    public void delete(SysRoleModuleRef sysRoleModuleRef) {
        sysRoleModuleRefRepository.delete(sysRoleModuleRef);
    }
}