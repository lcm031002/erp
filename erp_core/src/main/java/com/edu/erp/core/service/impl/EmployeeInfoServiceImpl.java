package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.EmployeeInfoService;
import com.edu.erp.domain.EmployeeInfo;
import com.edu.erp.repository.EmployeeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeInfoService")
public class EmployeeInfoServiceImpl implements EmployeeInfoService {

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Override
    public EmployeeInfo findOne(Long id) {
        return employeeInfoRepository.findOne(id);
    }

    @Override
    public List<EmployeeInfo> findAll() {
        return employeeInfoRepository.findAll();
    }

    @Override
    public List<EmployeeInfo> findAll(Sort sort) {
        return employeeInfoRepository.findAll(sort);
    }

    @Override
    public List<EmployeeInfo> findAll(Example<EmployeeInfo> example) {
        return employeeInfoRepository.findAll(example);
    }

    @Override
    public List<EmployeeInfo> findAll(Example<EmployeeInfo> example, Sort sort) {
        return employeeInfoRepository.findAll(example, sort);
    }

    @Override
    public EmployeeInfo saveAndFlush(EmployeeInfo employeeInfo) {
        return employeeInfoRepository.saveAndFlush(employeeInfo);
    }

    @Override
    public List<EmployeeInfo> save(Iterable<EmployeeInfo> iter) {
        return employeeInfoRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        employeeInfoRepository.delete(id);
    }

    @Override
    public void delete(EmployeeInfo employeeInfo) {
        employeeInfoRepository.delete(employeeInfo);
    }
}