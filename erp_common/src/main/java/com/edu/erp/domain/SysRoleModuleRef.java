package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_Role_Module_Ref")
public class SysRoleModuleRef implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 角色id
    private Long roleId;
    // 模板id
    private Long moduleId;

    /**
     * 设置 主键id,对应字段 t_sys_role_module_ref.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_role_module_ref.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 角色id,对应字段 t_sys_role_module_ref.role_id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色id,对应字段 t_sys_role_module_ref.role_id
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 模板id,对应字段 t_sys_role_module_ref.module_id
     */
    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 获取 模板id,对应字段 t_sys_role_module_ref.module_id
     */
    public Long getModuleId() {
        return this.moduleId;
    }
}