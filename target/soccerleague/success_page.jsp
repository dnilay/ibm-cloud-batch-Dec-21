<%@ page import="org.example.League" %><%--
  Created by IntelliJ IDEA.
  User: nilay
  Date: 14/02/22
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%
    League league=(League) request.getAttribute("LEAGUE");
    out.println("League Title: "+league.getLeagueName()+"<br/>");
    out.println("League Season: "+league.getLeagueSeason()+"<br/>");
    out.println("League Year: "+league.getLeagueYear());

%>
</body>
</html>
