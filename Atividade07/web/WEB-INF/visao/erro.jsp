<%-- 
    Document   : erro.jsp
    Created on : 25/03/2020, 19:56:13
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Deu Ruim!</h1>
        <p>Mensagem do erro: <%=exception.getMessage()%></p>
    </body>
</html>
