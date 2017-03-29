<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Objects</title>
</head>
<body>

<%
    String userName = request.getParameter("name");
    if (userName != null) {
        session.setAttribute("sessionUserName", userName);
        application.setAttribute("applicationUserName", userName);
        pageContext.setAttribute("pageContextUserName", userName);
        pageContext.setAttribute("pageContextUserName", userName, PageContext.PAGE_SCOPE);
    }
%>
<br>
User name in request object is: <%=userName%>
<br>
User name in session object is: <%=session.getAttribute("sessionUserName")%>
<br>
User name in application object is: <%=application.getAttribute("applicationUserName")%>
<br>
User name in pageContext object is: <%=pageContext.getAttribute("pageContextUserName")%>

</body>
</html>
