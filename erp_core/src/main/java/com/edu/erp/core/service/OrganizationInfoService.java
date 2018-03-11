package com.edu.erp.core.service;

import com.edu.erp.domain.OrganizationInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface OrganizationInfoService {
    OrganizationInfo findOne(Long id);

    List<OrganizationInfo> findAll();

    List<OrganizationInfo> findAll(Sort sort);

    List<OrganizationInfo> findAll(Example<OrganizationInfo> example);

    List<OrganizationInfo> findAll(Example<OrganizationInfo> example, Sort sort);

    OrganizationInfo saveAndFlush(OrganizationInfo organizationInfo);

    List<OrganizationInfo> save(Iterable<OrganizationInfo> iter);

    void delete(Long id);

    void delete(OrganizationInfo organizationInfo);
}