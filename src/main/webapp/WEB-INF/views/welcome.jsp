<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/25
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>huanying</title>
</head>
<body>
<h1>欢迎校长</h1>
<c:out value="${name}"></c:out>
<c:out value="${age}"></c:out>


<c:out value="${customer.customerName}"></c:out>
<c:out value="${customer.customerMoney}"></c:out>
<a href="/customer1/customer">1111</a>
</body>
</html>
