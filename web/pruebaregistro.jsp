<%-- 
    Document   : prueba
    Created on : 20/10/2013, 07:33:41 PM
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prueba de salidas</h1>
        <%
            out.print("<br>Usuario: "+request.getSession().getAttribute("registro"));
            out.print("<br>Usuario: "+request.getSession().getAttribute("bd"));
            
        %>
    </body>
</html>
