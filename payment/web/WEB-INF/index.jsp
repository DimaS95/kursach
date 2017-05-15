<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Дима
  Date: 14.01.2017
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Students</title>
  </head>
  <body>

<table border="1">
  <c:forEach items = "${requestScope.students}" var="student">
    <tr>
      <td>${student.name}</td>
      <td>${student.surname}</td>
      <td>${student.price}</td>
      <td>${student.isPay}</td>
      <td><a href="<c:url value='/delete?id=${student.id}'/>">Delete</a></td>
    </tr>
  </c:forEach>
</table>
</br>
</br>

<form action="/add" method = "post">
<p>Enter name</p>
  <input name = 'name' type="text">
  <p>Enter surname</p>
  <input name = 'surname' type="text">
  <p>Enter price</p>
  <input name = 'price' type="text">
  <p>Is pay?</p>
  <input name = 'isPay' type="text">
<input type="submit">
</form>
  </body>
</html>

