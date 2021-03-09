<%--
  Created by IntelliJ IDEA.
  User: jimmiemcbride
  Date: 3/8/21
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>pickColor</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

</head>
<body>
<form method="POST" action="viewcolor">

    <label for="color">Pick a color!</label>
    <input id="color" name="color" type="text">
    <br>
    <input type="submit">

</form>

</body>
</html>
