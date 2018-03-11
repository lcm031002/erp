package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_Invoice_Company")
public class BasInvoiceCompany implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 公司名称
    private String companyName;
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
     * 设置 主键id,对应字段 t_bas_invoice_company.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_invoice_company.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 公司名称,对应字段 t_bas_invoice_company.company_name
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取 公司名称,对应字段 t_bas_invoice_company.company_name
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * 设置 描述,对应字段 t_bas_invoice_company.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_invoice_company.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_invoice_company.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_invoice_company.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_invoice_company.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_invoice_company.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_invoice_company.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_invoice_company.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_invoice_company.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_invoice_company.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_invoice_company.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_invoice_company.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}