<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/25
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div class="row">
        <h1>用户登录</h1>
        <form action="/customer/login.do" method="post"    class="form-horizontal" role="form" >
            <div class="form-group">
                <label for="firstname" class="col-sm-2 control-label">名字</label>
                <div class="col-sm-5">
                    <input  name="customerName" type="text" class="form-control" id="firstname" placeholder="请输入名字">
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-5">
                    <input name="customerPassword" type="password" class="form-control" id="lastname" placeholder="请输入密码">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2"></div>
                <div class=" col-sm-5">
                    <div class="checkbox">
                        <label>
                            <input name="remember" type="checkbox">请记住我
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-2"></div>
                <div class=" col-sm-5">
                    <button type="submit" class="btn btn-primary btn-block">登录</button>
                </div>
            </div>
        </form>

    </div>
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-10">
            <a href="/customer/register.view">注册</a>
            <a href="/customer/forget.view">忘记密码</a>
        </div>
    </div>

</div>
</body>
</html>
