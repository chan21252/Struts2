package com.chan21252.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport {

    public String login(){
        System.out.println("Login Action2!");

        return "success";
    }
}
