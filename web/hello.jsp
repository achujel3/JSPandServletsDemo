<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>This is hello.jsp</h1>
<!-- declaring a global method-->
<%!
    public int add(int a, int b) {
        return a + b;
    }
%>

<!-- using Java in Html -->
<%
    int a = 3;
    int b = 4;
    int c = a + b;
    out.println("c=" + c);
%>

<!-- using Java global method in Html -->
<h1>1816 + 16846 is <%=add(1816, 16846)%>
</h1>

<!-- testing Java/Html mix -->
<% for(int i = 0; i < 5; i++) {%>
    <br><h1>The value is <%=i%></h1>
<%}%>

</body>
</html>
