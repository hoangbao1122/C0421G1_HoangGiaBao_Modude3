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
<a href="/customer">trở về</a>
<form action="" method="post">
    <div class="container-fluid">
        <h1 align="center">Update Customer</h1>


        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" aria-describedby="emailHelp" name="nameCus" value="${cusEdit.name}">
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
            <input type="date" class="form-control" id="birthday" name="birthdayCus" value="${cusEdit.birthday}">
        </div>
        <div class="mb-3">
            <label for="Gender" class="form-label">Gender</label>
            <input type="text" class="form-control" id="Gender" name="genderCus" value="${cusEdit.gender}">
        </div>
        <div class="mb-3">
            <label for="Card" class="form-label">Id Card</label>
            <input type="text" class="form-control" id="Card" aria-describedby="emailHelp" name="card_id" value="${cusEdit.id_card}">
        </div>
        <div class="mb-3">
            <label for="Phone" class="form-label">Phone</label>
            <input type="text" class="form-control" id="Phone" aria-describedby="emailHelp" name="phoneCus" value="${cusEdit.phone}">
        </div>
        <div class="mb-3">
            <label for="Email" class="form-label">Email</label>
            <input type="text" class="form-control" id="Email" aria-describedby="emailHelp" name="emailCus" value="${cusEdit.email}">
        </div>
        <div class="mb-3">
            <label for="Address" class="form-label">Address</label>
            <input type="text" class="form-control" id="Address" aria-describedby="emailHelp" name="addressCus" value="${cusEdit.address}">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
<script src="../../asset/js/bootstrap.js"></script>
</body>
</html>
