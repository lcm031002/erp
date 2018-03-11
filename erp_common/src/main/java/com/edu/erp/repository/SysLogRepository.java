package com.edu.erp.repository;

import com.edu.erp.domain.SysLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysLogRepository extends JpaRepository<SysLog, Long> {
}