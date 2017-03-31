<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>

<h3>Login successful!</h3>
<br>
<%
    String username = String.valueOf(session.getAttribute("username"));
%>
<h3>Hello, <%=username%>!</h3>

</body>
</html>
