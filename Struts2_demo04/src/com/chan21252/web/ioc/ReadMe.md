# 初识控制反转

---
## 一、引言
最近在学习Struts2框架，Struts2框架的执行逻辑如下：
1. Struts2过滤器拦截request
2. 根据request的路径，在Struts2.xml中寻找name和request路径匹配的action标签
3. 找到action，读取action标签的class和method属性
4. 创建对应的类对象并执行方法，返回结果给action标签的子标签result
5. result渲染结果视图

往常编写程序，调用某个类的方法，需要事先知道要使用的类，new一个对象，然后调用方法。而Struts2在编译时不知道要调用的对象和方法，在运行时根据传入的参数动态创建对象和方法。
对比两种调用类方法的方式：
1. 传统方式，程序主动依赖对象，需要在程序内部创建对象；
2. Struts2，通过容器创建对象，将对象交给程序使用。

第二种方式和原本相比，控制反转了，应用程序被动的接受对象，然后执行对象方法。

## 二、IOC概念
Ioc—Inversion of Control，即“控制反转”，不是编程技术，而是一种设计思想。在Java开发中，Ioc意味着将你设计好的对象交给容器控制，而不是传统的在你的程序内部直接控制。

- 控制：容器控制了对象
- 反转：程序不主动控制对象，由容器来创建并注入依赖对象，程序被动接受对象。

## 三、Demo
为了更好的理解IoC，借鉴Struts2的执行逻辑，编写一个Demo：
1. Request使用Action对象（依赖）
2. Container创建Action对象，注入到Request中

源代码 [https://github.com/chan21252/Struts2/tree/master/Struts2_demo04/src/com/chan21252/web/ioc](https://github.com/chan21252/Struts2/tree/master/Struts2_demo04/src/com/chan21252/web/ioc)






