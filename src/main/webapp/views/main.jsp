<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/9/2023
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
<h1>Main page</h1>
<h1> Username : <%= request.getSession().getAttribute("username")%></h1>
<h1> Password : <%= request.getSession().getAttribute("password")%></h1>
</body>
</html>
