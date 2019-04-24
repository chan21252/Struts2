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
    <title>注册页面</title>
</head>
<body>
<s:fielderror/>
<form action="<s:url namespace="/user" action="register"/>" method="post">
    用户名：<input type="text" name="username" />
    <br/>
    密码：<input type="password" name="password" />
    <br/>
    生日：<input type="text" name="birthday" />
    <br/>
    爱好：<input type="checkbox" value="写代码" name="hobby"/>写代码
    <input type="checkbox" value="看电影" name="hobby"/>看电影
    <input type="checkbox" value="打游戏" name="hobby"/>打游戏
    <br/>
    婚否：<input type="checkbox" name="married" value="true">
    <br/>
    <input type="submit" value=注册 />
</form>
</body>
</html>
