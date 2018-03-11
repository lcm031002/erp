package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_Log")
public class SysLog implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 用户名
    private String username;
    // 操作名称
    private String operate;
    // 内容(执行的SQL语句等)
    private String content;
    // IP地址
    private String ip;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_sys_log.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_log.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 用户名,对应字段 t_sys_log.username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取 用户名,对应字段 t_sys_log.username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 设置 操作名称,对应字段 t_sys_log.operate
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    /**
     * 获取 操作名称,对应字段 t_sys_log.operate
     */
    public String getOperate() {
        return this.operate;
    }

    /**
     * 设置 内容(执行的SQL语句等),对应字段 t_sys_log.content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 内容(执行的SQL语句等),对应字段 t_sys_log.content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置 IP地址,对应字段 t_sys_log.ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取 IP地址,对应字段 t_sys_log.ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * 设置 创建用户,对应字段 t_sys_log.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_sys_log.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_log.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_log.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_sys_log.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_sys_log.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_log.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_log.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}