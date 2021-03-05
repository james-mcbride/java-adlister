<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/5/21
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<p>--%>
<%--    <%=request.getParameter("username")%>--%>
<%--</p>--%>
<%--<p>--%>
<%--    <%=request.getAttribute("username")%>--%>
<%--</p>--%>
<%--<c:if test="${username.equalsIgnoreCase(\"admin\")}">--%>
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
