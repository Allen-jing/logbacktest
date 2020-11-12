package com.example.logbacktest.controller;

import javax.servlet.http.HttpServletRequest;

public class ThreadLocalUtil {

    private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();

    public static HttpServletRequest getRequest(){
        return  threadLocal.get();
    }

    public static void setRequest(HttpServletRequest request){
        threadLocal.set(request);
    }

}

