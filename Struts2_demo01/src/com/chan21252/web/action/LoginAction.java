package com.chan21252.web.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

    @Override
    public String execute() throws Exception {
        System.out.println("Login action!");
        return SUCCESS;
    }
}
