<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2017/8/18
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="border: solid 1px" >
    <thead>
        <td>姓名</td>
        <td>年龄</td>
    </thead>
    <tbody style="border: solid 1px">
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.name}</td>
            <td>${student.age}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>


</body>
</html>
