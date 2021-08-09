<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/8/2021
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>
    <h1>Update User</h1>
    <a href="/users">Trở về</a>
    <form  method="post">

        <input type="hidden" name="idUser" value="${editUser.id}">

        <p>Name</p>
        <input type="text" name="nameUser" value="${editUser.name}">
        <p>phone</p>
        <input type="text" name="phoneUser" value="${editUser.phone}">
        <p>Email</p>
        <input type="text" name="emailUser" value="${editUser.email}">
        <p>Address</p>
        <input type="text" name="addressUser" value="${editUser.address}">
        <p>Country</p>
        <input type="text" name="country" value="${editUser.country}">
        <input type="submit" value="update">
    </form>

</body>
</html>
