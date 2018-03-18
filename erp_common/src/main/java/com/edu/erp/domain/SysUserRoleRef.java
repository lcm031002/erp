package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_User_Role_Ref")
public class SysUserRoleRef implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 用户id
    private Long userId;
    // 角色id
    private Long roleId;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    private SysUser sysUser;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", insertable = false, updatable = false)
    private SysRole sysRole;

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

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }
}