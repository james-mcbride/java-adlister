<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/5/21
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%request.setAttribute("username", request.getParameter("username")); %>
<%request.setAttribute("password", request.getParameter("password")); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login Page</h1>

<%--<c:if test="${username.equalsIgnoreCase(\"admin\") && username.equalsIgnoreCase(\"password\")}">--%>
<%--    <p>Welcome admin</p>--%>
<%--    <% response.sendRedirect("/profile.jsp"); %>--%>
<%--</c:if>--%>



<%--<p>Response: <%= response.getOutputStream() %></p>--%>

<%--<p>Response: <%= ${par}%></p>--%>


<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
<c:choose>
    <c:when test="${username.equalsIgnoreCase(\"admin\") && password.equalsIgnoreCase(\"password\")}">
        <p>Welcome admin</p>
        <% response.sendRedirect("/profile.jsp"); %>
    </c:when>

    <c:otherwise>
        <p>Please submit admin info.</p>
    </c:otherwise>
</c:choose>
<p>${username}</p>
<p>${password}</p>

</body>
</html>
