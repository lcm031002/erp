package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.SysLogService;
import com.edu.erp.domain.SysLog;
import com.edu.erp.repository.SysLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogRepository sysLogRepository;

    @Override
    public SysLog findOne(Long id) {
        return sysLogRepository.findOne(id);
    }

    @Override
    public List<SysLog> findAll() {
        return sysLogRepository.findAll();
    }

    @Override
    public List<SysLog> findAll(Sort sort) {
        return sysLogRepository.findAll(sort);
    }

    @Override
    public List<SysLog> findAll(Example<SysLog> example) {
        return sysLogRepository.findAll(example);
    }

    @Override
    public List<SysLog> findAll(Example<SysLog> example, Sort sort) {
        return sysLogRepository.findAll(example, sort);
    }

    @Override
    public SysLog saveAndFlush(SysLog sysLog) {
        return sysLogRepository.saveAndFlush(sysLog);
    }

    @Override
    public List<SysLog> save(Iterable<SysLog> iter) {
        return sysLogRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        sysLogRepository.delete(id);
    }

    @Override
    public void delete(SysLog sysLog) {
        sysLogRepository.delete(sysLog);
    }
}