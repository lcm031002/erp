package com.edu.erp.security;

import com.edu.erp.core.service.SysUserService;
import com.edu.erp.domain.SysUser;
import com.edu.erp.entity.SecurityUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.findByUsername(username);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        SecurityUser securityUser = new SecurityUser();
        BeanUtils.copyProperties(sysUser, securityUser);
        return securityUser;
    }
}
