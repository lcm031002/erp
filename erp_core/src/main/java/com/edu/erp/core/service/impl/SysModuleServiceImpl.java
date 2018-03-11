package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysModuleService;
import com.edu.erp.domain.SysModule;
import com.edu.erp.repository.SysModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysModuleService")
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    private SysModuleRepository sysModuleRepository;

    @Override
    public SysModule findOne(Long id) {
        return sysModuleRepository.findOne(id);
    }

    @Override
    public List<SysModule> findAll() {
        return sysModuleRepository.findAll();
    }

    @Override
    public List<SysModule> findAll(Sort sort) {
        return sysModuleRepository.findAll(sort);
    }

    @Override
    public List<SysModule> findAll(Example<SysModule> example) {
        return sysModuleRepository.findAll(example);
    }

    @Override
    public List<SysModule> findAll(Example<SysModule> example, Sort sort) {
        return sysModuleRepository.findAll(example, sort);
    }

    @Override
    public SysModule saveAndFlush(SysModule sysModule) {
        return sysModuleRepository.saveAndFlush(sysModule);
    }

    @Override
    public List<SysModule> save(Iterable<SysModule> iter) {
        return sysModuleRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysModuleRepository.delete(id);
    }

    @Override
    public void delete(SysModule sysModule) {
        sysModuleRepository.delete(sysModule);
    }
}