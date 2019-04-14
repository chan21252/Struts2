package com.chan21252.web.ioc;

import java.lang.reflect.Method;

/**
 * 容器类
 * 创建Request和Action对象，为Request对象注入Action对象
 */
public class Container {
    public static void main(String[] args) throws Exception {
        //Action名
        String actionName = "com.chan21252.web.ioc.Action1";
        //要执行的方法名
        String actionMethodName = "delete";

        //容器创建Action对象
        Class actionClass = Class.forName(actionName);
        ActionSupport action = (ActionSupport) actionClass.newInstance();

        //实例化一个Request对象，
        Class requestClass = Class.forName("com.chan21252.web.ioc.Request");
        Request request = (Request) requestClass.newInstance();

        //动态注入Action对象
        Method setActionMethod = requestClass.getMethod("setAction", ActionSupport.class);
        setActionMethod.invoke(request, action);

        //动态调用Action对象方法
        Method useActionMethod = requestClass.getMethod("useAction", String.class);
        useActionMethod.invoke(request, actionMethodName);

        //输出结果
        System.out.println(request.getResult());
    }
}
