package com.example.logbacktest.controller;

import com.example.logbacktest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/log")
public class LogController extends BaseController {

    @Autowired
    private LogService logService;

    @RequestMapping("/printLog")
    public String printLog(HttpServletRequest httpServletRequest){
        ThreadLocalUtil.setRequest(httpServletRequest);
        logService.printLog();
        return "success";
    }

}
