package com.edu.erp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_Module")
public class SysModule implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    // 菜单code
    private String encoding;
    // 菜单名称
    private String moduleName;
    // URL
    private String moduleUrl;
    // 排序
    private Integer sortNum;
    // 父模块ID
    private Long parentId;
    // 状态(1=有效 0=逻辑删除)
    private Integer status;
    // 菜单url
    private String url;
    // 是否是菜单
    private Integer isMenu;
    // 菜单图片路径
    private String menuImg;
    // 菜单class
    private String styleClass;
    // 创建用户
    private Long createUser;
    // 创建时间
    private Date createTime;
    // 修改用户
    private Long updateUser;
    // 修改时间
    private Date updateTime;

    /**
     * 设置 主键ID,对应字段 t_sys_module.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键ID,对应字段 t_sys_module.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 菜单code,对应字段 t_sys_module.encoding
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 获取 菜单code,对应字段 t_sys_module.encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * 设置 菜单名称,对应字段 t_sys_module.module_name
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * 获取 菜单名称,对应字段 t_sys_module.module_name
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * 设置 URL,对应字段 t_sys_module.module_url
     */
    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl;
    }

    /**
     * 获取 URL,对应字段 t_sys_module.module_url
     */
    public String getModuleUrl() {
        return this.moduleUrl;
    }

    /**
     * 设置 排序,对应字段 t_sys_module.sort_num
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取 排序,对应字段 t_sys_module.sort_num
     */
    public Integer getSortNum() {
        return this.sortNum;
    }

    /**
     * 设置 父模块ID,对应字段 t_sys_module.parent_id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 父模块ID,对应字段 t_sys_module.parent_id
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * 设置 状态(1=有效 0=逻辑删除),对应字段 t_sys_module.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 状态(1=有效 0=逻辑删除),对应字段 t_sys_module.status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置 菜单url,对应字段 t_sys_module.url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取 菜单url,对应字段 t_sys_module.url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * 设置 是否是菜单,对应字段 t_sys_module.is_menu
     */
    public void setIsMenu(Integer isMenu) {
        this.isMenu = isMenu;
    }

    /**
     * 获取 是否是菜单,对应字段 t_sys_module.is_menu
     */
    public Integer getIsMenu() {
        return this.isMenu;
    }

    /**
     * 设置 菜单图片路径,对应字段 t_sys_module.menu_img
     */
    public void setMenuImg(String menuImg) {
        this.menuImg = menuImg;
    }

    /**
     * 获取 菜单图片路径,对应字段 t_sys_module.menu_img
     */
    public String getMenuImg() {
        return this.menuImg;
    }

    /**
     * 设置 菜单class,对应字段 t_sys_module.style_class
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    /**
     * 获取 菜单class,对应字段 t_sys_module.style_class
     */
    public String getStyleClass() {
        return this.styleClass;
    }

    /**
     * 设置 创建用户,对应字段 t_sys_module.create_user
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取 创建用户,对应字段 t_sys_module.create_user
     */
    public Long getCreateUser() {
        return this.createUser;
    }

    /**
     * 设置 创建时间,对应字段 t_sys_module.create_time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建时间,对应字段 t_sys_module.create_time
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 修改用户,对应字段 t_sys_module.update_user
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取 修改用户,对应字段 t_sys_module.update_user
     */
    public Long getUpdateUser() {
        return this.updateUser;
    }

    /**
     * 设置 修改时间,对应字段 t_sys_module.update_time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 修改时间,对应字段 t_sys_module.update_time
     */
    public Date getUpdateTime() {
        return this.updateTime;
    }
}