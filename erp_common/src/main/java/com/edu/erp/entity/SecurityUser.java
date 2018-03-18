package com.edu.erp.entity;

import com.edu.erp.domain.SysRole;
import com.edu.erp.domain.SysUser;
import com.edu.erp.domain.SysUserRoleRef;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecurityUser extends SysUser implements UserDetails {

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        List<SysUserRoleRef> sysUserRoleRefList = getSysUserRoleRefList();
        if (!CollectionUtils.isEmpty(sysUserRoleRefList)) {
            SysRole sysRole = null;
            SimpleGrantedAuthority authority = null;
            for (SysUserRoleRef sysUserRoleRef : sysUserRoleRefList) {
                sysRole = sysUserRoleRef.getSysRole();
                if (sysRole != null) {
                    authority = new SimpleGrantedAuthority(sysRole.getRoleCode());
                    authorities.add(authority);
                }
            }
        }
        return authorities;
    }
}
