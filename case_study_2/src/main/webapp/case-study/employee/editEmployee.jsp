<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<a href="/employee">trở về</a>
<form action="" method="post">
    <div class="container-fluid">
        <h1 align="center">Thêm mới Employee</h1>
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="nameEmp" value="${empEdit.nameEmp}">
        </div>

        <div class="mb-3">
            <label for="birthday" class="form-label">Birthday</label>
            <input type="date" class="form-control" id="birthday" aria-describedby="emailHelp" name="birthdayEmp" value="${empEdit.birthdayEmp}">
        </div>
        <div class="mb-3">
            <label for="card" class="form-label">id card</label>
            <input type="text" class="form-control" id="card" name="idCardEmp" value="${empEdit.idCardEmp}">
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">salary</label>
            <input type="text" class="form-control" id="salary" name="salaryEmp" value="${empEdit.salaryEmp}">
        </div>
        <div class="mb-3">
            <label for="phone" class="form-label">phone</label>
            <input type="text" class="form-control" id="phone" aria-describedby="emailHelp" name="phoneEmp" value="${empEdit.phoneEmp}">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">email</label>
            <input type="text" class="form-control" id="email" aria-describedby="emailHelp" name="emailEmp" value="${empEdit.emailEmp}">
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">address</label>
            <input type="text" class="form-control" id="address" aria-describedby="emailHelp" name="addressEmp" value="${empEdit.addressEmp}">
        </div>
        <div class="mb-3">
            <label for="position" class="form-label">position</label>
            <input type="text" class="form-control" id="position" aria-describedby="emailHelp" name="positionEmp" value="${empEdit.positionEmp}">
        </div>
        <div class="mb-3">
            <label for="aducation" class="form-label">aducation</label>
            <input type="text" class="form-control" id="aducation" aria-describedby="emailHelp" name="educationEmp" value="${empEdit.educationEmp}">
        </div>
        <div class="mb-3">
            <label for="division" class="form-label">division</label>
            <input type="text" class="form-control" id="division" aria-describedby="emailHelp" name="divisionEmp" value="${empEdit.divisionEmp}">
        </div>
        <div class="mb-3">
            <label for="userName" class="form-label">userName</label>
            <input type="text" class="form-control" id="userName" aria-describedby="emailHelp" name="userNameEmp" value="${empEdit.userNameEmp}">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>


<script src="../../asset/js/bootstrap.js"></script>
</body>
</html>
