<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration info</title>
</head>
<body>

<jsp:useBean id="user" class="com.servletdemo.login.form.User" scope="request">
    <jsp:setProperty name="user" property="username"/>
</jsp:useBean>

<h3>Username:
    <jsp:getProperty name="user" property="username"/>
</h3>
<h3>Password:
    <jsp:getProperty name="user" property="password"/>
</h3>
<h3>Address:
    <jsp:getProperty name="user" property="address"/>
</h3>
<h3>Company:
    <jsp:getProperty name="user" property="company"/>
</h3>
<h3>Phone:
    <jsp:getProperty name="user" property="phone"/>
</h3>

</body>
</html>
