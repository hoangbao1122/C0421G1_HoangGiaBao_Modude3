<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student list</title>
</head>
<body>
<%--    <c:set var="x" value="Hello World!"/>--%>
<%--    <c:out value="${x}"/>--%>
    <h2>Student List</h2>
    <table border="1">
        <tr>
            <th>No</th>
            <th>Id</th>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Rank</th>
            <th>Gender</th>
        </tr>
<%--        for (Student studentObj : studentListServlet)--%>
        <c:forEach var="studentObj" items="${studentListServlet}" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}"/></td>
                <td><c:out value="${studentObj.id}"/></td>
                <td><c:out value="${studentObj.name}"/></td>
                <td><c:out value="${studentObj.dateOfBirth}"/></td>
                <td>
                    <c:choose>
                        <c:when test="${studentObj.grade < 5}">
                            Bad
                        </c:when>
                        <c:when test="${studentObj.grade < 8}">
                            Good
                        </c:when>
                        <c:otherwise>
                            Excellent
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:if test="${studentObj.gender == 0}">
                        Female
                    </c:if>
                    <c:if test="${studentObj.gender == 1}">
                        Male
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
