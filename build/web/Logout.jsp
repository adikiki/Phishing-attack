<%-- 
    Document   : Logout
    Created on : 9 Apr, 2018, 1:51:44 AM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log Out</title> 
    </head>
    <body>
        <body data-spy="scroll" data-target=".navbar" style="background-color: #e0e0e0;" >
 
<% 
    String n =(String)session.getAttribute("UNAME");
    session.invalidate();
     %>
       <%
             response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
             response.setHeader("Progma", "no-cache");
             response.setHeader("Expires", "0");
             response.sendRedirect("index.html");
        %>
    </body>
</html>
