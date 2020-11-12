package com.example.logbacktest.controller;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    public HttpServletRequest getRequest(){
        return  ThreadLocalUtil.getRequest();
    }

    public void setRequest(HttpServletRequest t){
        ThreadLocalUtil.setRequest(t);
    }

}
