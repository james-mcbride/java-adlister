<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/10/21
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create An Ad</h1>
<form action="/ads/create" method="post">
    <label for="title">Title</label>
    <input name="title" id="title" type="text">
    <br />
    <label for="description">Description</label>
    <input name="description" id="description" type="text">
    <br />
    <input type="submit">
</form>
</body>
</html>
