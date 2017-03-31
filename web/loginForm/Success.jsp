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

<jsp:useBean id="user" class="com.servletdemo.login.form.User" scope="request">
    <jsp:setProperty name="user" property="username" value="new user"/>
</jsp:useBean>

<h3>Hello,
    <jsp:getProperty name="user" property="username"/>
    !</h3>

</body>
</html>
