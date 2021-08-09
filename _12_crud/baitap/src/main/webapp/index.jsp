<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<p><a href="/users?action=create">Thêm mới User</a></p>

<%--  <a href="/users?action=search">Search</a>--%>
<form action="/users?action=search" method="post">
    <table border="1">
        <tr>
            <th><input type="text" name="search"></th>
            <th><input type="submit" value="search"></th>
        </tr>
    </table>
</form>

<a href="/users?action=orderBy">Sắp xếp</a>
<a href="/users">Trở về</a>


<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>phone</th>
        <th>email</th>
        <th>address</th>
        <th>Country</th>
        <th colspan="2">Action</th>
    </tr>

    <c:forEach var="userObj" items="${listAll}">
        <tr>
            <td><c:out value="${userObj.id}"/></td>
            <td><c:out value="${userObj.name}"/></td>
            <td><c:out value="${userObj.phone}"/></td>
            <td><c:out value="${userObj.email}"/></td>
            <td><c:out value="${userObj.address}"/></td>
            <td><c:out value="${userObj.country}"></c:out></td>
            <td><a href="/users?action=update&userId=${userObj.id}">Update</a></td>
            <td><a href="/users?action=delete&userId=${userObj.id}">Delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>

