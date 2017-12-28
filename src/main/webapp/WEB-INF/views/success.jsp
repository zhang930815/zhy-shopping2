<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

姓名<c:out value="${sessionScope.customer.customerName}"></c:out>
密码<c:out value="${sessionScope.customer.customerPassword}"></c:out>

邮箱<c:out value="${sessionScope.customer.customerEmail}"></c:out>

<a href="/customer1/info">111111</a>
</body>
</html>
