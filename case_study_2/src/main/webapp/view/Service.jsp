
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/12/2021
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/service?action=create">Thêm mới</a>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Area</th>
        <th>Cost</th>
        <th>Max people</th>
        <th>Rent type</th>
        <th>Service Type</th>
        <th>Standand Room</th>
        <th>Description </th>
        <th>poolArea</th>
        <th>numberOfFloor</th>
    </tr>
    <c:forEach var="ServiceObj" items="${listAllService}">
        <tr>
            <td><c:out value="${ServiceObj.id}"/></td>
            <td><c:out value="${ServiceObj.name}"/></td>
            <td><c:out value="${ServiceObj.are}"/></td>
            <td><c:out value="${ServiceObj.cost}"/></td>
            <td><c:out value="${ServiceObj.maxPeople}"/></td>
            <td><c:out value="${ServiceObj.rendType}"/></td>
            <td><c:out value="${ServiceObj.serviceType}"/></td>
            <td><c:out value="${ServiceObj.standandRoom}"/></td>
            <td><c:out value="${ServiceObj.descriptionOtherConvenience}"/></td>
            <td><c:out value="${ServiceObj.poolArea}"/></td>
            <td><c:out value="${ServiceObj.numberOfFloor}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
