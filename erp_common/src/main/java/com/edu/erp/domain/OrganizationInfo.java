package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Organization_Info")
public class OrganizationInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 组织名称
    private String orgName;
    // 组织机构简称
    private String shortOrgName;
    // 上级组织
    private Long parentId;
    // 组织级别 1=地区级别 2=部门级别 3=团队级别 4=校区级别
    private Integer orgType;
    // 状态(1=有效 0=逻辑删除)
    private Integer status;
    // 排序
    private Integer sortNum;
    // 地址
    private String address;
    // logo
    private String Logo;
    // 电话
    private String phone;
    // 邮箱
    private String email;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_organization_info.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_organization_info.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 组织名称,对应字段 t_organization_info.org_name
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取 组织名称,对应字段 t_organization_info.org_name
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * 设置 组织机构简称,对应字段 t_organization_info.short_org_name
     */
    public void setShortOrgName(String shortOrgName) {
        this.shortOrgName = shortOrgName;
    }

    /**
     * 获取 组织机构简称,对应字段 t_organization_info.short_org_name
     */
    public String getShortOrgName() {
        return this.shortOrgName;
    }

    /**
     * 设置 上级组织,对应字段 t_organization_info.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 上级组织,对应字段 t_organization_info.parent_id
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * 设置 组织级别 1=地区级别 2=部门级别 3=团队级别 4=校区级别 ,对应字段 t_organization_info.org_type
     */
    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取 组织级别 1=地区级别 2=部门级别 3=团队级别 4=校区级别 ,对应字段 t_organization_info.org_type
     */
    public Integer getOrgType() {
        return this.orgType;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_organization_info.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_organization_info.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 排序,对应字段 t_organization_info.sort_num
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取 排序,对应字段 t_organization_info.sort_num
     */
    public Integer getSortNum() {
        return this.sortNum;
    }

    /**
     * 设置 地址,对应字段 t_organization_info.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取 地址,对应字段 t_organization_info.address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置 logo,对应字段 t_organization_info.Logo
     */
    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    /**
     * 获取 logo,对应字段 t_organization_info.Logo
     */
    public String getLogo() {
        return this.Logo;
    }

    /**
     * 设置 电话,对应字段 t_organization_info.phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取 电话,对应字段 t_organization_info.phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置 邮箱,对应字段 t_organization_info.email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 邮箱,对应字段 t_organization_info.email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 设置 创建用户,对应字段 t_organization_info.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_organization_info.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_organization_info.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_organization_info.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_organization_info.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_organization_info.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_organization_info.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_organization_info.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}