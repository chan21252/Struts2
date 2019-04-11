package com.chan21252.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class DefaultAction extends ActionSupport {

    @Override
    public String execute() throws Exception{
        System.out.println("Default Action!");
        return SUCCESS;
    }
}
