package com.edu.erp.web.controller;

import com.edu.erp.common.service.RightService;
import com.edu.erp.domain.SysUser;
import com.edu.erp.entity.RightModel;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RightController extends BaseController {
    private static final Logger log = Logger.getLogger(RightController.class);

    @Resource(name = "rightService")
    private RightService rightService;

    @RequestMapping(value = { "/common/rightservice" }, method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody
    RightModel queryRights(HttpServletRequest request,
                           HttpServletResponse response) {
        if (log.isDebugEnabled()) {
            log.debug("begin to query user rights info");
        }

        SysUser sysUser = (SysUser) request.getSession().getAttribute("sysUser");
        RightModel rightModel = rightService.getUserRightModel(sysUser.getId());
        if (log.isDebugEnabled()) {
            log.debug("end to query user rights info");
        }
        return rightModel;
    }
}
