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
    <title>用户中心</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js
"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js
"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js

"></script>
</head>
<script>
    $(document).ready(function () {
        $("#email").blur(function () {
            var emailVal = $(this).val();
            $.get("/customer/customerCheckEmail/"+(emailVal),
                    function result(data) {

                    if(data.equal("error")){
                        $("#emailDiv").innerHTML="该邮箱已被注册，请重新注册"
                    }
                    }, "text");
        })
    });
    $.validator.setDefaults({
        submitHandler: function(form) {
            alert("注册成功");
            form.submit();
        }
    });
    $().ready(function() {
        $("#commentForm").validate();
    });

</script>


<body>
<div class="container">
    <div class="row">
        <h1>用户注册</h1>
        <form action="/customer/register.do" id="commentForm" method="POST" class="form-horizontal" role="form">
            <div class="form-group">

                <label for="firstname" class="col-sm-2 control-label">用户名(必须两个字母)</label>
                <div class="col-sm-5">
                    <input name="customerName" type="text" class="form-control" id="firstname" minlength="2" placeholder="请输入名字">
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">密码(必填)</label>
                <div class="col-sm-5">
                    <input name="customerPassword" type="password" class="form-control" id="lastname" minlength="6"
                           placeholder="请输入密码">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">电话(必填)</label>
                <div class="col-sm-5">
                    <input name="customerPhone" type="text" class="form-control" minlength="11"
                           placeholder="请输入电话">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">邮箱(必填)</label>
                <div class="col-sm-5">
                    <input id="email" name="customerEmail" type="text" class="form-control"
                           placeholder="请输入邮箱">
                </div>
            </div>
            <div id="emailDiv"></div>

            <div class="form-group">
                <div class="col-sm-2"></div>
                <div class=" col-sm-5">
                    <button type="submit" class="btn btn-primary btn-block">注册</button>
                </div>
            </div>
        </form>
    </div>


</div>
</body>
</html>
