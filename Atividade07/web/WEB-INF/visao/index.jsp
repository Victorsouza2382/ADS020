<%-- 
    Document   : index
    Created on : 25/03/2020, 19:31:26
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date;"%>
<%@include file="cabecalho.jsp"%>
<%@include file="rodape.jsp"%>
 <jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
      
        <%String msg="Olá Mundo!";%>
        <h1><%=msg%></h1>
        <p>Hoje são <%= new Date() %></p>
        
        <%int x = 12/0;%>
    
</html>
