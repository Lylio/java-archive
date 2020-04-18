
<%--Run Tomcat server then go to http://localhost:9090/jsp-practice.jsp to view--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Practice</title>
</head>
<body>
<%
    int a = 5;
    int b = 6;
    int c = a + b;
    out.print("c = " + c);
%>
</body>
</html>
