<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/11/2021
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../asset/css/bootstrap.css">
</head>
<style>
    .container-fluid {
        width: 500px;
    }
</style>
<body>

<button class="btn btn-primary"><a href="/customer" style="color: white;text-decoration: none">Trở về</a></button>
<div class="container-fluid">

    <form action="" method="post">
        <h1 align="center">Thêm mới Customer</h1>
        <div class="mb-3">

            <label for="name" class="form-label">Name</label>

            <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="nameCus"
                   value="${customer.getName()}">
            <c:if test="${nameValidate.get('name')!=null}">  <%-- name   // service--%>
                <span style="color: red">${nameValidate.get('name')}</span>
            </c:if>
        </div>

        <div class="mb-3">
            <select class="form-select" aria-label="Default select example" name="type">
                <c:forEach items="${custype}" var="customerType">
                    <option value="${customerType.getCusTypeId()}">${customerType.getNameType()}</option>
                </c:forEach>
            </select>
        </div>
        <div class="mb-3">
            <label for="birthday" class="form-label">Birthday</label>
            <input type="date" class="form-control" id="birthday" name="birthdayCus">
        </div>
        <div class="mb-3">
            <select class="form-select" aria-label="Default select example" name="genderCus">
                <option value="male">Nam</option>
                <option value="female">Nữ</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="Card" class="form-label">Id Card</label>
            <input type="text" class="form-control" id="Card" aria-describedby="emailHelp" name="card_id">
        </div>
        <div class="mb-3">
            <label for="Phone" class="form-label">Phone</label>
            <input type="text" class="form-control" id="Phone" aria-describedby="emailHelp" name="phoneCus" value="${customer.getPhone()}">
            <c:if test="${phoneValidate.get('phone')!=null}">  <%-- name   // service--%>
                <span style="color: red">${phoneValidate.get('phone')}</span>
            </c:if>
        </div>
        <div class="mb-3">
            <label for="Email" class="form-label">Email</label>
            <input type="text" class="form-control" id="Email" aria-describedby="emailHelp" name="emailCus"value="${customer.getEmail()}">
            <c:if test="${emailValidate.get('email')!=null}">  <%-- name   // service--%>
                <span style="color: red">${nameValidate.get('email')}</span>
            </c:if>
        </div>
        <div class="mb-3">
            <label for="Address" class="form-label">Address</label>
            <input type="text" class="form-control" id="Address" aria-describedby="emailHelp" name="addressCus">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>
</div>
<script src="../../asset/js/bootstrap.js"></script>
</body>
</html>
