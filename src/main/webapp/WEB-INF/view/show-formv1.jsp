<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 15/02/22
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    Student Name:<form:input path="studentName"/><br/>
    Student Address:<form:input path="studentAddress"/><br/>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
