<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/3/2021
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="discount" method="get">
    <label for="">Mô tả sản phẩm</label>
    <input type="text" name="description">
    <label for="">Giá niêm yết</label>
    <input type="text" name="price">
    <label for="">Tỉ lệ chiết khấu</label>
    <input type="text" name="percent">
    <input type="submit" value="Tính">
  </form>
  </body>
</html>
