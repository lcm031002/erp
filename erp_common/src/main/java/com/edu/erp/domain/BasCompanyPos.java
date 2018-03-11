package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_Company_Pos")
public class BasCompanyPos implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // POS编码
    private String encoding;
    // POS名称
    private String posName;
    // 简称
    private String shortPostName;
    // 公司账号
    private Long accountId;
    // 状态(1=有效 0=逻辑删除)
    private Integer status;
    // 描述
    private String description;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_bas_company_pos.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_company_pos.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 POS编码,对应字段 t_bas_company_pos.encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 获取 POS编码,对应字段 t_bas_company_pos.encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * 设置 POS名称,对应字段 t_bas_company_pos.pos_name
     */
    public void setPosName(String posName) {
        this.posName = posName;
    }

    /**
     * 获取 POS名称,对应字段 t_bas_company_pos.pos_name
     */
    public String getPosName() {
        return this.posName;
    }

    /**
     * 设置 简称,对应字段 t_bas_company_pos.short_post_name
     */
    public void setShortPostName(String shortPostName) {
        this.shortPostName = shortPostName;
    }

    /**
     * 获取 简称,对应字段 t_bas_company_pos.short_post_name
     */
    public String getShortPostName() {
        return this.shortPostName;
    }

    /**
     * 设置 公司账号,对应字段 t_bas_company_pos.account_id
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取 公司账号,对应字段 t_bas_company_pos.account_id
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_company_pos.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_company_pos.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 描述,对应字段 t_bas_company_pos.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_company_pos.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_company_pos.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_company_pos.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_company_pos.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_company_pos.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_company_pos.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_company_pos.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_company_pos.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_company_pos.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}