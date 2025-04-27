<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
    <h1>Bonjour, serveur JSP fonctionne ! 🎉</h1>
    <%
        out.println("La date/heure actuelle est : " + new java.util.Date());
    %>
</body>
</html>