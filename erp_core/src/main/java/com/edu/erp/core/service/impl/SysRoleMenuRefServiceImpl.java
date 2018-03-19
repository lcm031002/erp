package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysRoleMenuRefService;
import com.edu.erp.domain.SysRoleMenuRef;
import com.edu.erp.entity.Permission;
import com.edu.erp.mapper.SysRoleMenuRefMapper;
import com.edu.erp.repository.SysRoleMenuRefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysRoleModuleRefService")
public class SysRoleMenuRefServiceImpl implements SysRoleMenuRefService {

    @Autowired
    private SysRoleMenuRefRepository sysRoleMenuRefRepository;

    @Autowired
    private SysRoleMenuRefMapper sysRoleMenuRefMapper;

    @Override
    public SysRoleMenuRef findOne(Long id) {
        return sysRoleMenuRefRepository.findOne(id);
    }

    @Override
    public List<SysRoleMenuRef> findAll() {
        return sysRoleMenuRefRepository.findAll();
    }

    @Override
    public List<SysRoleMenuRef> findAll(Sort sort) {
        return sysRoleMenuRefRepository.findAll(sort);
    }

    @Override
    public List<SysRoleMenuRef> findAll(Example<SysRoleMenuRef> example) {
        return sysRoleMenuRefRepository.findAll(example);
    }

    @Override
    public List<SysRoleMenuRef> findAll(Example<SysRoleMenuRef> example, Sort sort) {
        return sysRoleMenuRefRepository.findAll(example, sort);
    }

    @Override
    public SysRoleMenuRef saveAndFlush(SysRoleMenuRef sysRoleMenuRef) {
        return sysRoleMenuRefRepository.saveAndFlush(sysRoleMenuRef);
    }

    @Override
    public List<SysRoleMenuRef> save(Iterable<SysRoleMenuRef> iter) {
        return sysRoleMenuRefRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysRoleMenuRefRepository.delete(id);
    }

    @Override
    public void delete(SysRoleMenuRef sysRoleMenuRef) {
        sysRoleMenuRefRepository.delete(sysRoleMenuRef);
    }

    @Override
    public List<Permission> findPermissionByUserId(Long userId) {
        return sysRoleMenuRefMapper.findPermissionByUserId(userId);
    }
}