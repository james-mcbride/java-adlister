<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/10/21
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Adds</title>
</head>
<body>
<h1>Here are all the ads</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
