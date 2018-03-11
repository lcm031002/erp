package com.edu.erp.repository;

import com.edu.erp.domain.OrganizationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationInfoRepository extends JpaRepository<OrganizationInfo, Long> {
}