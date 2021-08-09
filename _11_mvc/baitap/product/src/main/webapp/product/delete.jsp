
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <c:if test="${message != null}">
        <span style="color: red">${message}</span>
    </c:if>
</p>
<p>
    <a href="">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure</h3>
    <fiedset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fiedset>
</form>
</body>
</html>