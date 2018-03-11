package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_Company_Account")
public class BasCompanyAccount implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 公司账号
    private String encoding;
    // 公司名称
    private String accountName;
    // 描述
    private String description;
    // 状态(1=有效 0=逻辑删除)
    private Integer status;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_bas_company_account.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_company_account.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 公司账号,对应字段 t_bas_company_account.encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 获取 公司账号,对应字段 t_bas_company_account.encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * 设置 公司名称,对应字段 t_bas_company_account.account_name
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 获取 公司名称,对应字段 t_bas_company_account.account_name
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * 设置 描述,对应字段 t_bas_company_account.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_company_account.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_company_account.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_company_account.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_company_account.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_company_account.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_company_account.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_company_account.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_company_account.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_company_account.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_company_account.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_company_account.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}