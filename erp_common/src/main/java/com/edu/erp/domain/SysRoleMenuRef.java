package com.edu.erp.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "T_Sys_Role_Menu_Ref")
public class SysRoleMenuRef implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 角色id
    private Long roleId;
    // 菜单id
    private String menuId;

    /**
     * 设置 主键id,对应字段 t_sys_role_menu_ref.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 主键id,对应字段 t_sys_role_menu_ref.id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 角色id,对应字段 t_sys_role_menu_ref.role_id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色id,对应字段 t_sys_role_menu_ref.role_id
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * 设置 模板id,对应字段 t_sys_role_menu_ref.menu_id
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取 模板id,对应字段 t_sys_role_menu_ref.menu_id
     */
    public String getMenuId() {
        return this.menuId;
    }
}