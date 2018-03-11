package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysConfigService;
import com.edu.erp.domain.SysConfig;
import com.edu.erp.repository.SysConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysConfigService")
public class SysConfigServiceImpl implements SysConfigService {

    @Autowired
    private SysConfigRepository sysConfigRepository;

    @Override
    public SysConfig findOne(Long id) {
        return sysConfigRepository.findOne(id);
    }

    @Override
    public List<SysConfig> findAll() {
        return sysConfigRepository.findAll();
    }

    @Override
    public List<SysConfig> findAll(Sort sort) {
        return sysConfigRepository.findAll(sort);
    }

    @Override
    public List<SysConfig> findAll(Example<SysConfig> example) {
        return sysConfigRepository.findAll(example);
    }

    @Override
    public List<SysConfig> findAll(Example<SysConfig> example, Sort sort) {
        return sysConfigRepository.findAll(example, sort);
    }

    @Override
    public SysConfig saveAndFlush(SysConfig sysConfig) {
        return sysConfigRepository.saveAndFlush(sysConfig);
    }

    @Override
    public List<SysConfig> save(Iterable<SysConfig> iter) {
        return sysConfigRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysConfigRepository.delete(id);
    }

    @Override
    public void delete(SysConfig sysConfig) {
        sysConfigRepository.delete(sysConfig);
    }
}