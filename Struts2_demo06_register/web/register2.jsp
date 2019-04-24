<%--
  Created by IntelliJ IDEA.
  User: cuican
  Date: 2019/4/22
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <s:head></s:head>
    <title>注册页面</title>
</head>
<body>

<s:form action="/user/register.action" method="POST">
    <s:textfield name="username" label="用户名" requiredLabel="true" requiredPosition="left"></s:textfield>
    <s:password name="password" label="密码" requiredLabel="true" requiredPosition="left"></s:password>
    <s:textfield name="birthday" label="生日" requiredLabel="true" requiredPosition="left"></s:textfield>
    <%-- OGNL表达式 --%>
    <s:checkboxlist list="#{'写代码':'写代码', '看电影':'看电影', '打游戏':'打游戏'}" label="爱好" name="hobby" requiredLabel="true" requiredPosition="left"></s:checkboxlist>
    <s:radio list="#{'true': '已婚', 'false':'未婚'}" name="married" label="是否已婚" requiredLabel="true" requiredPosition="left"></s:radio>
    <s:submit value="注册"></s:submit>
    <%--
    <s:checkbox name="hobby" label="写代码" value="写代码"></s:checkbox>
    <s:checkbox name="hobby" label="看电影" value="看电影"></s:checkbox>
    <s:checkbox name="hobby" label="打游戏" value="打游戏"></s:checkbox>
    --%>
</s:form>
</body>
</html>
