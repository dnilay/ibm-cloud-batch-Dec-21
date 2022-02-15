<%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 15/02/22
  Time: 12:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show-form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form class="row g-3" action="processForm" method="post">
    <div class="container">
        <label for="t1" class="form-label" >Student Name</label>
        <input type="text"  class="form-control" id="t1" name="name">
    </div>
    <div class="container">
        <label for="t2" class="form-label">Student Address </label>
        <input type="text" class="form-control" id="t2" name="address">
    </div>
    <div class="container">
        <button type="submit" class="btn btn-primary mb-3">Confirm identity</button>
    </div>
</form>
</body>
</html>
