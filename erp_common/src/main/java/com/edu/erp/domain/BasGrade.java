package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_Grade")
public class BasGrade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 年级编码
    private String encoding;
    // 年级名称
    private String gradeName;
    // 上一级年级编码
    private Long lastId;
    // 上一级年级编码
    private String lastEncoding;
    // 上一级年级名称
    private String lastGradeName;
    // 描述
    private String description;
    // 状态(1=有效 0=逻辑删除)
    private Integer status;
    // 排序
    private Integer sortNum;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 创建时间
    private Date updateTime;

    /**
     * 设置 主键id,对应字段 t_bas_grade.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_grade.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 年级编码,对应字段 t_bas_grade.encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 获取 年级编码,对应字段 t_bas_grade.encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * 设置 年级名称,对应字段 t_bas_grade.grade_name
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    /**
     * 获取 年级名称,对应字段 t_bas_grade.grade_name
     */
    public String getGradeName() {
        return this.gradeName;
    }

    /**
     * 设置 上一级年级编码,对应字段 t_bas_grade.last_id
     */
    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    /**
     * 获取 上一级年级编码,对应字段 t_bas_grade.last_id
     */
    public Long getLastId() {
        return this.lastId;
    }

    /**
     * 设置 上一级年级编码,对应字段 t_bas_grade.last_encoding
     */
    public void setLastEncoding(String lastEncoding) {
        this.lastEncoding = lastEncoding;
    }

    /**
     * 获取 上一级年级编码,对应字段 t_bas_grade.last_encoding
     */
    public String getLastEncoding() {
        return this.lastEncoding;
    }

    /**
     * 设置 上一级年级名称,对应字段 t_bas_grade.last_grade_name
     */
    public void setLastGradeName(String lastGradeName) {
        this.lastGradeName = lastGradeName;
    }

    /**
     * 获取 上一级年级名称,对应字段 t_bas_grade.last_grade_name
     */
    public String getLastGradeName() {
        return this.lastGradeName;
    }

    /**
     * 设置 描述,对应字段 t_bas_grade.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_grade.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_grade.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_grade.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 排序,对应字段 t_bas_grade.sort_num
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取 排序,对应字段 t_bas_grade.sort_num
     */
    public Integer getSortNum() {
        return this.sortNum;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_grade.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_grade.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_grade.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_grade.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_grade.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_grade.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_grade.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_grade.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}