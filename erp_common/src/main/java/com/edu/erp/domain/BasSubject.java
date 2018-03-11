package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Bas_Subject")
public class BasSubject implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 科目编码
    private String encoding;
    // 科目名称
    private String subjectName;
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
     * 设置 主键id,对应字段 t_bas_subject.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_bas_subject.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 科目编码,对应字段 t_bas_subject.encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 获取 科目编码,对应字段 t_bas_subject.encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * 设置 科目名称,对应字段 t_bas_subject.subject_name
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * 获取 科目名称,对应字段 t_bas_subject.subject_name
     */
    public String getSubjectName() {
        return this.subjectName;
    }

    /**
     * 设置 描述,对应字段 t_bas_subject.description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 描述,对应字段 t_bas_subject.description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_bas_subject.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_bas_subject.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 创建用户,对应字段 t_bas_subject.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_bas_subject.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_subject.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_subject.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_bas_subject.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_bas_subject.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 创建时间,对应字段 t_bas_subject.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间,对应字段 t_bas_subject.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}