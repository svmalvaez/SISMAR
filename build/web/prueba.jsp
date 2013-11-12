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
            out.print("<br>Usuario: "+request.getSession().getAttribute("usuario"));
            out.print("<br>Contraseña: "+request.getSession().getAttribute("password"));
            out.print("<br>Resultado de validación: "+request.getSession().getAttribute("resultado"));
        %>
    </body>
</html>
