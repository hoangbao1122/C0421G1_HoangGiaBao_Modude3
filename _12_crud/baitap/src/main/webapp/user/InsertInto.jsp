<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/8/2021
  Time: 9:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới user</h1>
<a href="/users">Trở về</a>
<form method="post">
    <h5>nhập vào id</h5>
    <input type="hidden" name="idUser"><br/>
    <h5>nhập vào name</h5>
    <input type="text" name="nameUser" ><br/>
    <h5>nhập vào phone</h5>
    <input type="text" name="phoneUser"><br/>
    <h5>nhập vào email</h5>
    <input type="text" name="emailUser"><br/>
    <h5>nhập vào address</h5>
    <input type="text" name="addressUser"><br/>
    <h5>nhập vào country</h5>
    <input type="text" name="countryUser"><br/>
    <input type="submit" value="thêm mới">
</form>
</body>
</html>
