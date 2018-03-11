package com.edu.erp.core.service.impl;

import com.edu.erp.core.service.OrganizationInfoService;
import com.edu.erp.domain.OrganizationInfo;
import com.edu.erp.repository.OrganizationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("organizationInfoService")
public class OrganizationInfoServiceImpl implements OrganizationInfoService {

    @Autowired
    private OrganizationInfoRepository organizationInfoRepository;

    @Override
    public OrganizationInfo findOne(Long id) {
        return organizationInfoRepository.findOne(id);
    }

    @Override
    public List<OrganizationInfo> findAll() {
        return organizationInfoRepository.findAll();
    }

    @Override
    public List<OrganizationInfo> findAll(Sort sort) {
        return organizationInfoRepository.findAll(sort);
    }

    @Override
    public List<OrganizationInfo> findAll(Example<OrganizationInfo> example) {
        return organizationInfoRepository.findAll(example);
    }

    @Override
    public List<OrganizationInfo> findAll(Example<OrganizationInfo> example, Sort sort) {
        return organizationInfoRepository.findAll(example, sort);
    }

    @Override
    public OrganizationInfo saveAndFlush(OrganizationInfo organizationInfo) {
        return organizationInfoRepository.saveAndFlush(organizationInfo);
    }

    @Override
    public List<OrganizationInfo> save(Iterable<OrganizationInfo> iter) {
        return organizationInfoRepository.save(iter);
    }

    @Override
    public void delete(Long id) {
        organizationInfoRepository.delete(id);
    }

    @Override
    public void delete(OrganizationInfo organizationInfo) {
        organizationInfoRepository.delete(organizationInfo);
    }
}