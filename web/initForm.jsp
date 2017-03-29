<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>initFormTitle</title>
</head>

<%!
    public void jspInit() {
        String defaultUser = getServletConfig().getInitParameter("defaultUser");
        ServletContext context = getServletConfig().getServletContext();
        context.setAttribute("defaultUser", defaultUser);
    }
%>

<body>

<h1>This is initForm</h1>
<br>
Default user name from servlet config is: <%=getServletConfig().getInitParameter("defaultUser") %>
<br>
Default value in Servlet config is: <%=application.getAttribute("defaultUser")%>

</body>
</html>
