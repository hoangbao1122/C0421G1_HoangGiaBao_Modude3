<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/12/2021
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<div class="container">
<a href="/employee?action=create">Them </a>

<table border="1" class="table">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Id card</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Positinon</th>
        <th>Education</th>
        <th>Division</th>
        <th>UserName</th>
        <th colspan="2">Active</th>
    </tr>
    <c:forEach var="empObj" items="${listEmp}">
        <tr>
            <td><c:out value="${empObj.idEmp}"/></td>
            <td><c:out value="${empObj.nameEmp}"/></td>
            <td><c:out value="${empObj.birthdayEmp}"/></td>
            <td><c:out value="${empObj.idCardEmp}"/></td>
            <td><c:out value="${empObj.salaryEmp}"/></td>
            <td><c:out value="${empObj.phoneEmp}"/></td>
            <td><c:out value="${empObj.emailEmp}"/></td>
            <td><c:out value="${empObj.addressEmp}"/></td>
            <td><c:out value="${empObj.positionEmp}"/></td>
            <td><c:out value="${empObj.educationEmp}"/></td>
            <td><c:out value="${empObj.divisionEmp}"/></td>
            <td><c:out value="${empObj.userNameEmp}"/></td>
            <td><button class="btn btn-warning"><a href="/employee?action=edit&empId=${empObj.idEmp}" style="text-decoration: none;color: white">Edit</a></button></td>
            <td><button class="btn btn-danger"><a href="/employee?action=delete&empId=${empObj.idEmp}" style="text-decoration: none;color: white">Delete</a></button></td>
        </tr>
    </c:forEach>
</table>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>
