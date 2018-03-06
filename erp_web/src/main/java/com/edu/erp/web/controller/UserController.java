package com.edu.erp.web.controller;

import com.edu.erp.core.user.UserService;
import com.edu.erp.domain.User;
import com.edu.erp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = { "/selectById" }, method = RequestMethod.GET, headers = { "Accept=application/json" })
    public Map<String, Object> findById(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Long id = Long.valueOf(request.getParameter("id"));
        User user = userService.findOne(id);
        resultMap.put("data", user);
        return resultMap;
    }

    @ResponseBody
    @RequestMapping(value = { "/service" }, method = RequestMethod.POST, headers = { "Accept=application/json" })
    public Map<String, Object> save(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        User user = new User();
        user.setId(2L);
        user.setUserName("test2");
        user = this.userService.saveAndFlush(user);
        resultMap.put("data", user);
        return resultMap;
    }
}
