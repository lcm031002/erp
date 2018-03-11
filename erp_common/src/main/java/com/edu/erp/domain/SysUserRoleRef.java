package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_User_Role_Ref")
public class SysUserRoleRef implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 用户id
    private Long userId;
    // 角色id
    private Long roleId;

    /**
     * 设置 主键id,对应字段 t_sys_user_role_ref.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_user_role_ref.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 用户id,对应字段 t_sys_user_role_ref.user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 用户id,对应字段 t_sys_user_role_ref.user_id
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * 设置 角色id,对应字段 t_sys_user_role_ref.role_id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色id,对应字段 t_sys_user_role_ref.role_id
     */
    public Long getRoleId() {
        return this.roleId;
    }
}