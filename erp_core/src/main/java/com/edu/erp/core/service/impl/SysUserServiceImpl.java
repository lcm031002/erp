package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysUserService;
import com.edu.erp.domain.SysUser;
import com.edu.erp.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser findOne(Long id) {
        return sysUserRepository.findOne(id);
    }

    @Override
    public SysUser findByUsername(String username) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(username);
        Example<SysUser> example = Example.of(sysUser);
        return this.sysUserRepository.findOne(example);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserRepository.findAll();
    }

    @Override
    public List<SysUser> findAll(Sort sort) {
        return sysUserRepository.findAll(sort);
    }

    @Override
    public List<SysUser> findAll(Example<SysUser> example) {
        return sysUserRepository.findAll(example);
    }

    @Override
    public List<SysUser> findAll(Example<SysUser> example, Sort sort) {
        return sysUserRepository.findAll(example, sort);
    }

    @Override
    public SysUser saveAndFlush(SysUser sysUser) {
        return sysUserRepository.saveAndFlush(sysUser);
    }

    @Override
    public List<SysUser> save(Iterable<SysUser> iter) {
        return sysUserRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysUserRepository.delete(id);
    }

    @Override
    public void delete(SysUser sysUser) {
        sysUserRepository.delete(sysUser);
    }
}