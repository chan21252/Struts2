package com.chan21252.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

    private final String ADD_STUDENT = "addStudent";
    private final String DELETE_STUDENT = "deleteStudent";
    private final String UPDATE_STUDENT = "updateStudent";
    private final String QUERY_STUDENT = "queryStudent";

    public String addStudent() {
        System.out.println("add student");
        return SUCCESS;
    }


    public String deleteStudent() {
        System.out.println("delete student");
        return SUCCESS;
    }

    public String updateStudent() {
        System.out.println("update student");
        return SUCCESS;
    }

    public String queryStudent() {
        System.out.println("query student");
        return SUCCESS;
    }

    public String successAction() {
        System.out.println("success action");
        return SUCCESS;
    }
}
