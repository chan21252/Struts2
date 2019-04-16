package com.chan21252.web.result;


import cn.dsna.util.images.ValidateCode;
import com.opensymphony.xwork2.ActionInvocation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;

public class Captcha extends StrutsResultSupport {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
        ValidateCode code = new ValidateCode(width, height, 4, 10);
        //HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        code.write(response.getOutputStream());
    }
}
