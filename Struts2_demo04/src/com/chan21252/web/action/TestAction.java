package com.chan21252.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestAction extends ActionSupport {
    public String test(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        HttpSession session = request.getSession();
        ServletContext context = ServletActionContext.getServletContext();

        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        System.out.println(context);
        return  NONE;
    }
}
