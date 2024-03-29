///*
// * Copyright (c) 2018 New Hope Group. All rights reserved.
// * Project: nhdc-cloud-psi-service
// * FileName: C.java
// * Author: panwensheng
// * Date:  16:42
// */
//package com.example.eurekazuul;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @author panwensheng
// * @version 1.0.0
// * @description
// * @date 2019/7/18 16:42
// */
//@Component
//public class MyZuulFilter extends ZuulFilter {
//    /**
//     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
//     * pre：路由之前
//     * routing：路由之时
//     * post： 路由之后
//     * error：发送错误调用
//     * @return
//     */
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    /**
//     * filterOrder：过滤的顺序
//     * @return
//     */
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    /**
//     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
//     * @return
//     */
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    /**
//     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
//     * @return
//     * @throws ZuulException
//     */
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext currentContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = currentContext.getRequest();
//        String cookie = request.getParameter("token");
//
//        return null;
//    }
//}
