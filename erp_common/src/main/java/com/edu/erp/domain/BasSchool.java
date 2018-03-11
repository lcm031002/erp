package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_School")
public class BasSchool implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 学校名称
    private String schoolName;
    // 简称
    private String shortSchoolName;
    // 学校类型(1=幼儿园 2=小学 3=初中 4=高中 5=初高中-完全中学 6=九年一贯制 7=十二年一贯制 8=职业教育 9=特殊教育 10=成人教育 11=其它)
    private Integer schoolType;
    // 联系人
    private String linkMan;
    // 联系电话
    private String phone;
    // 描述
    private String description;
    // 省份
    private Long provinceId;
    // 城市
    private Long cityId;
    // 县/区
    private Long areaId;
    // 地址
    private String address;
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
     * 设置 主键id,对应字段 t_bas_school.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_school.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 学校名称,对应字段 t_bas_school.school_name
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * 获取 学校名称,对应字段 t_bas_school.school_name
     */
    public String getSchoolName() {
        return this.schoolName;
    }

    /**
     * 设置 简称,对应字段 t_bas_school.short_school_name
     */
    public void setShortSchoolName(String shortSchoolName) {
        this.shortSchoolName = shortSchoolName;
    }

    /**
     * 获取 简称,对应字段 t_bas_school.short_school_name
     */
    public String getShortSchoolName() {
        return this.shortSchoolName;
    }

    /**
     * 设置 学校类型(1=幼儿园 2=小学 3=初中 4=高中 5=初高中-完全中学 6=九年一贯制 7=十二年一贯制 8=职业教育 9=特殊教育 10=成人教育 11=其它),对应字段 t_bas_school.school_type
     */
    public void setSchoolType(Integer schoolType) {
        this.schoolType = schoolType;
    }

    /**
     * 获取 学校类型(1=幼儿园 2=小学 3=初中 4=高中 5=初高中-完全中学 6=九年一贯制 7=十二年一贯制 8=职业教育 9=特殊教育 10=成人教育 11=其它),对应字段 t_bas_school.school_type
     */
    public Integer getSchoolType() {
        return this.schoolType;
    }

    /**
     * 设置 联系人,对应字段 t_bas_school.link_man
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    /**
     * 获取 联系人,对应字段 t_bas_school.link_man
     */
    public String getLinkMan() {
        return this.linkMan;
    }

    /**
     * 设置 联系电话,对应字段 t_bas_school.phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取 联系电话,对应字段 t_bas_school.phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置 描述,对应字段 t_bas_school.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_school.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 省份,对应字段 t_bas_school.province_id
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取 省份,对应字段 t_bas_school.province_id
     */
    public Long getProvinceId() {
        return this.provinceId;
    }

    /**
     * 设置 城市,对应字段 t_bas_school.city_id
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取 城市,对应字段 t_bas_school.city_id
     */
    public Long getCityId() {
        return this.cityId;
    }

    /**
     * 设置 县/区,对应字段 t_bas_school.area_id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取 县/区,对应字段 t_bas_school.area_id
     */
    public Long getAreaId() {
        return this.areaId;
    }

    /**
     * 设置 地址,对应字段 t_bas_school.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取 地址,对应字段 t_bas_school.address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_school.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_school.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_school.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_school.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_school.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_school.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_school.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_school.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_school.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_school.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}