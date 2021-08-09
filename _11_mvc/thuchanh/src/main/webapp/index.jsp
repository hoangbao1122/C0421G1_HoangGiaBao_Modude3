<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/4/2021
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Customer</h1>
  <p>
    <a href="/customer?action=create">Create new customer</a>
  </p>

  <table border="1">
      <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
    <c:forEach items='${requestScope["customers"]}' var="customer" >
      <tr>
        <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td>
        <td><a href="/customers?action=edit&id=${customer.getId}">Edit</a></td>
        <td><a href="/customers?action=delete=${customer.getId}">delete</a></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
