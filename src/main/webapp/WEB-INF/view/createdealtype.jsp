<%--
  Created by IntelliJ IDEA.
  User: Jude's PC
  Date: 11/27/2018
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Deal Type</title>
</head>
<body>
<form action="/createdealtype.do" method="post">
       Type:<br>
        <input type="text" name="type"><br>
        Minimum Age:<br>
        <input type="text" name="minage"><br>
        Maximum Age:<br>
        <input type="text" name="maxage"><br>
        Minimum Date:<br>
        <input type="text" name="mindate"><br>
        Maximum Date:<br>
        <input type="text" name="maxdate"><br>
        Range Type Code:<br>
        <input type="text" name="rangetypecode"><br><br><br>
        <input type="submit"  value="Submit"><br>
</form>
</body>
</html>
