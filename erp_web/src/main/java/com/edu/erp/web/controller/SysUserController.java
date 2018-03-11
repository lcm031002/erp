package com.edu.erp.web.controller;

import com.edu.erp.core.service.SysUserService;
import com.edu.erp.domain.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource(name="sysUserService")
    private SysUserService sysUserService;

    @ResponseBody
    @RequestMapping(value = { "/selectById" }, method = RequestMethod.GET, headers = { "Accept=application/json" })
    public Map<String, Object> findById(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Long id = Long.valueOf(request.getParameter("id"));
        SysUser sysUser = sysUserService.findOne(id);
        resultMap.put("data", sysUser);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = { "/service" }, method = RequestMethod.POST, headers = { "Accept=application/json" })
    public Map<String, Object> save(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        SysUser sysUser = new SysUser();
        sysUser.setUsername("lincm");
        sysUser.setPassword("111111");
        sysUser.setEmployeeId(2L);
        sysUser.setStatus(1L);
        sysUser.setCreateTime(Calendar.getInstance().getTime());
        sysUser = this.sysUserService.saveAndFlush(sysUser);
        resultMap.put("data", sysUser);
        return resultMap;
    }
}
