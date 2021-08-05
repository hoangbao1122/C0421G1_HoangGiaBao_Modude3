<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/3/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Customer list</h2>
<table border="1px">
    <tr>
        <th>Họ và tên</th>
        <th>ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="cusObj" items="${CustomerListServlet}" varStatus="loop">
        <tr>
            <td><c:out value="${cusObj.name}"/></td>
            <td><c:out value="${cusObj.birthday}"/></td>
            <td><c:out value="${cusObj.address}"/></td>
            <td><img  src="${cusObj.image}" width="250px" height="auto"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
