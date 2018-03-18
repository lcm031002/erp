package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "T_Sys_User")
public class SysUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 用户名
    private String username;
    // 用户密码
    private String password;
    // 员工id
    private Long employeeId;
    // 状态(1=有效 0=逻辑删除)
    private Long status;
    // 密码更新时间
    private Date updatePwdTime;
    // 是否管理员更新
    private Integer sysUpdate;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    List<SysUserRoleRef> sysUserRoleRefList;

    /**
     * 设置 主键id,对应字段 t_sys_user.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_user.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 用户名,对应字段 t_sys_user.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取 用户名,对应字段 t_sys_user.username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置 用户密码,对应字段 t_sys_user.password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 用户密码,对应字段 t_sys_user.password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 设置 员工id,对应字段 t_sys_user.employee_id
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取 员工id,对应字段 t_sys_user.employee_id
     */
    public Long getEmployeeId() {
        return this.employeeId;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_sys_user.status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_sys_user.status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * 设置 密码更新时间,对应字段 t_sys_user.update_pwd_time
     */
    public void setUpdatePwdTime(Date updatePwdTime) {
        this.updatePwdTime = updatePwdTime;
    }

    /**
     * 获取 密码更新时间,对应字段 t_sys_user.update_pwd_time
     */
    public Date getUpdatePwdTime() {
        return this.updatePwdTime;
    }

    /**
     * 设置 是否管理员更新,对应字段 t_sys_user.sys_update
     */
    public void setSysUpdate(Integer sysUpdate) {
        this.sysUpdate = sysUpdate;
    }

    /**
     * 获取 是否管理员更新,对应字段 t_sys_user.sys_update
     */
    public Integer getSysUpdate() {
        return this.sysUpdate;
    }

    /**
     * 设置 创建用户,对应字段 t_sys_user.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_sys_user.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_user.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_user.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_sys_user.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_sys_user.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_user.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_user.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public List<SysUserRoleRef> getSysUserRoleRefList() {
        return sysUserRoleRefList;
    }

    public void setSysUserRoleRefList(List<SysUserRoleRef> sysUserRoleRefList) {
        this.sysUserRoleRefList = sysUserRoleRefList;
    }
}