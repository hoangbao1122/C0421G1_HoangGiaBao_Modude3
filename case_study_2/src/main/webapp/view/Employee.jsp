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
        <th colspan="2" style="text-align: center">Active</th>
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
            <td><button class="btn btn-danger" onclick="onDelete('${empObj.idEmp}','${empObj.nameEmp}')" data-bs-toggle="modal" data-bs-target="#modal-delete">Delete</button></td>
        </tr>
    </c:forEach>
</table>
</div>

<div class="modal fade" id="modal-delete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete employee</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/employee">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="empId" value="" id="idListDelete">
                <div class="modal-body">
                    Bạn muốn xóa
                   Employee có tên là <input type="text" id="nameListDelete" readonly style="outline: none">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script>
    function onDelete(id,name) {
        document.getElementById("idListDelete").value = id;
        console.log(id);
        document.getElementById("nameListDelete").value = name;
        console.log(name);
    }
</script>
<!-- JavaScript Bundle with Popper -->
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
</body>
</html>
