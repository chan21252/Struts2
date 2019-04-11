# Struts2
Struts2 demo code

## 介绍
1. Struts2是一个web MVC框架
2. 三层架构，web层，service层，dao层
3. web层MVC框架，controller控制器，view视图，model模型
4. 框架：
    - SSH：Struts+Spring+Hibernate
    - SSM：SpringMVC+Spring+mybatis

## 下载安装

## 快速创建一个Struts2项目
1. 创建一个javaweb项目
2. 导入Struts2 jar包
3. web.xml配置Struts2过滤器，应用于所有请求。
4. src目录添加struts.xml，并配置
    1. 包：\<package name=包名 extends=default>
    2. 动作：\<action name=动作名 class=类名 method=方法名>
    3. 结果：\<result name=返回值名>/url\</result>
5. 编写动作对应的类和方法，方法的返回值 = result.name

## 项目执行顺序
1. 浏览器访问 http://localhost:8080/hello
2. 根据web.xml，请求经过Struts2过滤器
3. 加载struts配置
4. 找到名为“hello”的动作，执行对应的类方法
5. 返回结果，转发到url
