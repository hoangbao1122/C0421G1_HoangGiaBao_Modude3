
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <table border="1">
      <tr>
          <th>id</th>
          <th>name</th>
          <th>phone</th>
          <th>email</th>
          <th>address</th>
          <th colspan="2">Action</th>
      </tr>
<%--      Hiện tại nó đang ko nhận cái biến list All này nên nó ko hiển thị ra được--%>
      <c:forEach var="userObj" items="${listAll}">
          <tr>
              <td><c:out value="${userObj.getId()}"/></td>
              <td><c:out value="${userObj.getName()}"/></td>
              <td><c:out value="${userObj.getPhone()}"/></td>
              <td><c:out value="${userObj.getEmail()}"/></td>
              <td><c:out value="${userObj.getAddress()}"/></td>
              <td><a href="/users?action=delete">Delete</a></td>
              <td><a href="/users?action=edit">Edit</a></td>
          </tr>
      </c:forEach>
  </table>
  </body>
</html>

<%-- h test nó gửi request dến controll mà nó lại bị 404 tức là chắc chắn conttroler có lỗi phiên bản --%>