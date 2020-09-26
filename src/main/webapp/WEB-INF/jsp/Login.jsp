<%--
  Created by IntelliJ IDEA.
  User: Manuja
  Date: 9/26/2020
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
 <h1>${ErrorMessage}</h1>
<form action="/login" method="POST" >
<input name="username">Username</input>

    <input name="Password" type="password">Password</input>
    <button type="submit">Login</button>

</form>

</body>
</html>
