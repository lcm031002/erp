package com.edu.erp.mapper;

import com.edu.erp.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMenuRefMapper {
    List<Permission> findPermissionByUserId(Long userId);
}
