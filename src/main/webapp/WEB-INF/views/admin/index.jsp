<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员首页</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<div class="alert alert-info">${info}--当前时间--<span><script>document.write(Date())</script></span></div>
<div class="container">
    <span class="btn  btn-primary" >用户管理</span>
    <span class="btn  btn-primary" onclick="window.location='/product/manager.view'">商品管理</span>
    <span class="btn  btn-primary" >货架管理</span>
    <span class="btn  btn-primary" >订单管理</span>
    <span class="btn  btn-primary" >库存管理</span>
</div>
</body>
</html>
