<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/11/2021
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<style>
    .btn .btn-success {

    }
</style>
<body>


<div class="container">
    <table border="1" class="table">
        <button class="btn btn-success"><a href="/customer?action=create" style="color: white;text-decoration: none">Thêm
            mới</a></button>
        <tr>
            <th>Id</th>
            <th>Type Id</th>
            <th>Name</th>
            <th>birthday</th>
            <th>Gender</th>
            <th>Id Card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th colspan="2" class="text-center">Action</th>
        </tr>
        <c:forEach var="listObj" items="${listAll}">
            <tr>
                <td><c:out value="${listObj.id}"/></td>
                <td><c:out value="${listObj.type_id}"/></td>
                <td><c:out value="${listObj.name}"/></td>
                <td><c:out value="${listObj.birthday}"/></td>
                <td><c:out value="${listObj.gender}"/></td>
                <td><c:out value="${listObj.id_card}"/></td>
                <td><c:out value="${listObj.phone}"/></td>
                <td><c:out value="${listObj.email}"/></td>
                <td><c:out value="${listObj.address}"/></td>
                <td>
                    <button class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#modal-delete"
                            onclick="onDelete('${listObj.id}','${listObj.name}')" type="button">Delete
                    </button>
                </td>
                <td>
                    <button class="btn btn-warning"><a href="/customer?action=edit&CusId=${listObj.id}"
                                                       style="color: white;text-decoration: none">Edit</a></button>
                </td>
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
            <form action="/customer">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="CusId" value="" id="idListDelete">
                <div class="modal-body">
                    Bạn muốn xóa
                    Customer có tên là <input type="text" id="nameListDelete" readonly style="outline: none">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>


<script>
    function onDelete(id,name) {
        document.getElementById("idListDelete").value = id;
        console.log(id);
        document.getElementById("nameListDelete").value = name;
        console.log(name);
    }
</script>
</body>
</html>
