package com.edu.erp.common.service.impl;

import com.edu.erp.common.service.RightService;
import com.edu.erp.core.service.SysRoleMenuRefService;
import com.edu.erp.entity.Permission;
import com.edu.erp.entity.RightModel;
import com.edu.erp.utils.RightUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rightService")
public class RightServiceImpl implements RightService {
    @Autowired
    private SysRoleMenuRefService sysRoleMenuRefService;

    @Override
    public RightModel getUserRightModel(Long userId) {
        List<Permission> permissionList = sysRoleMenuRefService.findPermissionByUserId(userId);
        return RightUtils.getInstance().genUserRightModel(permissionList);
    }
}
