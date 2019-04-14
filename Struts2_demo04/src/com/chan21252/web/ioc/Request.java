package com.chan21252.web.ioc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Request：
 * 程序的操作请求类，用来处理Action和返回结果
 *
 * @author cuican
 * @date 2019-04-14
 */
public class Request {
    private ActionSupport action;
    private String result;

    public ActionSupport getAction() {
        return action;
    }

    public void setAction(ActionSupport action) {
        this.action = action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    //传入参数，动态调用Action类的方法
    public void useAction(String methodName) {
        try {
            Method method = action.getClass().getMethod(methodName);
            String result = (String) method.invoke(action);
            setResult(result);
        } catch (NoSuchMethodException e) {
            System.out.println("错误：不支持方法 " + methodName);
        } catch (IllegalAccessException e) {
            System.out.println("错误：方法参数非法");
        } catch (InvocationTargetException e) {
            System.out.println("错误：方法调用目标异常");
        }
    }
}
