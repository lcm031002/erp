package com.edu.erp.core.service;

import com.edu.erp.domain.EmployeeInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface EmployeeInfoService {
    EmployeeInfo findOne(Long id);

    List<EmployeeInfo> findAll();

    List<EmployeeInfo> findAll(Sort sort);

    List<EmployeeInfo> findAll(Example<EmployeeInfo> example);

    List<EmployeeInfo> findAll(Example<EmployeeInfo> example, Sort sort);

    EmployeeInfo saveAndFlush(EmployeeInfo employeeInfo);

    List<EmployeeInfo> save(Iterable<EmployeeInfo> iter);

    void delete(Long id);

    void delete(EmployeeInfo employeeInfo);
}