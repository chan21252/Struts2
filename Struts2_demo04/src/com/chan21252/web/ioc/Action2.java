package com.chan21252.web.ioc;

/**
 * 操作类2
 */
public class Action2 implements ActionSupport {
    private static final String actionName = "action2";

    public static String getActionName() {
        return actionName;
    }

    public String add() {
        System.out.println(actionName + "执行add");
        return "add success";
    }

    public String delete() {
        System.out.println(actionName + "执行delete");
        return "delete success";
    }

    public String update() {
        System.out.println(actionName + "执行update");
        return "update success";
    }

    public String query() {
        System.out.println(actionName + "执行query");
        return "query success";
    }

    public String customize() {
        System.out.println(actionName + "执行customize");
        return "customize success";
    }
}
