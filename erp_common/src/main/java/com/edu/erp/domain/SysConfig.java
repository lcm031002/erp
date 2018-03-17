package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_Config")
public class SysConfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // KEY
    private String strKey;
    // 值
    private String strValue;
    // 备注
    private String memo;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_sys_config.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_config.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 KEY,对应字段 t_sys_config.str_key
     */
    public void setStrKey(String strKey) {
        this.strKey = strKey;
    }

    /**
     * 获取 KEY,对应字段 t_sys_config.str_key
     */
    public String getStrKey() {
        return this.strKey;
    }

    /**
     * 设置 值,对应字段 t_sys_config.str_value
     */
    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    /**
     * 获取 值,对应字段 t_sys_config.str_value
     */
    public String getStrValue() {
        return this.strValue;
    }

    /**
     * 设置 备注,对应字段 t_sys_config.memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取 备注,对应字段 t_sys_config.memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置 创建用户,对应字段 t_sys_config.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_sys_config.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_config.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_config.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_sys_config.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_sys_config.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_config.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_config.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}