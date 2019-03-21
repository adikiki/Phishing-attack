<%-- 
    Document   : link
    Created on : 9 Apr, 2018, 1:59:51 AM
    Author     : WELCOME
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="phishing.org.link"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<%
    String a_link = request.getParameter("a_link");
    //a_link=a_link.replace('#','a');
//    a_link=a_link.replace('&','a');
    //out.print(a_link);
    String a[] = a_link.split("0000000000");
    
    
    //out.print(a[0]+" "+a[1]);
    link obj = new link();
//    out.println(a[0]);
//    out.println(a.length);
      //out.println(a[1]);
    int flag =obj.linkguard1(a[0], a[1]);
   if(flag==0)
    {    
        //out.print("Not Phishing");
        
        out.println("<script type =\"text/javascript\">");
                out.println("alert('This is safe site.')");
                
                 out.println("location='check.jsp';");
              out.println("</script>"); 
        
    }
    else if(flag==-1)
    {
       // out.print("Possible Phishing");
        out.println("<script type =\"text/javascript\">");
                out.println("alert('Not sure for this site.')");
                
                 out.println("location='check.jsp';");
              out.println("</script>"); 
    }
    else if(flag==1)
    {
        //out.print("Phishing");
        
        out.println("<script type =\"text/javascript\">");
                out.println("alert('This is unsafe site.Dont Visit')");
                
                 out.println("location='check.jsp';");
              out.println("</script>"); 
    }
%>
    