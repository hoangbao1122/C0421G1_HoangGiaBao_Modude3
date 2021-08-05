
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<h1>Search product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name</td>
        <td>Price</td>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>