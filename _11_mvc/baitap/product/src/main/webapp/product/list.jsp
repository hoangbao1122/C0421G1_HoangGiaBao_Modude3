<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<form action="/products?action=search" method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Search"></td>
        </tr>
    </table>
</form>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>