package com.edu.erp.mapper;

import com.edu.erp.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper {
    List<SysRole> findRolesByUserId(Long userId);
}
