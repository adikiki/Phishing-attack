<%-- 
    Document   : Account
    Created on : 8 Apr, 2018, 5:07:35 PM
    Author     : WELCOME
--%>

<%@page import = "java.sql.DriverManager"  %>
<%@page  import= "java.sql.PreparedStatement" %>
<%@page import =" java.sql.ResultSet"  %>
<%@page import ="java.sql.SQLException"%>
<%@page import ="java.sql.Connection" %>
<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Account</title>
        <style>
        body{
            background: url("20.jpg");
            
        }
        
            h1{
                text-align: center;
                font-size: 4em;   
                color:whitesmoke;
                margin-top: auto;
            }
       
        header{
            margin-top: 3em;
        }
        .container{
              
		margin-top: 4em;
                margin-left: 12em;
                height: auto;
                width: available;
                
                
        }
        nav>ul{
            //width: 60em;
            position: absolute;
                right:auto;
		left:auto;
                height: 70%;
                width: 90%;
                //padding-left: 3em;
                
                
        }
        nav>ul>li{
            
            height: border-box;
            float:left;
            margin-left: 2em;
            padding-left:2em;
            
                
        }
        nav>ul>li>a{
		text-decoration: none;
		font-family: 'Abel', sans-serif;
		color:#fff;
		font-size:14px;
		font-weight:bold;
		padding:12px 30px 12px 30px ;
		background: rgba(0,0,0,0.5);
	}
        #head{
            margin-top: 10em;
            margin-left: 15em;
            
        }
        
        .ftable
        {
            margin-left: 12em;
            
        }
    </style>
        
          
    </head>
    <body>   
        <h1> <a href="http://www.mnnit.ac.in/"/><img src="1.png" align="left" width="150" height="150"></a>
            DETECTION OF PHISHING ATTACK</h1>
        
               <div class="container">          
                  <div class="header">
                            <nav>    
				  <ul>
				         <li><a href="Account.jsp">MY DETAIL</a></li>
					 <!--li><a href="check.jsp">WHITE LIST</a></li-->
					 <li><a href="Blacklist2.jsp"> BLACKLIST</a></li>
					 <li><a href="view.jsp">VIEW FEEDBACK</a></li>
					 <li><a href="index.html">LOGOUT</a></li>
				  </ul>
				</nav>    
                   </div>
            </div>
        
        
        
        <div id="head">
            <div id="row">
                
              <table class="ftable"   width="300" height="150"  align="center" cellpadding="10"  border="0"  cellspacing="0">
                <tr bgcolor="#A52A2A">
                <td><b>UserName</b></td>
                <td><b>Email</b></td>
                <td><b>Mobile</b></td>

</tr>
                
                <%
                    
                   try{                    
                    //String uname = request.getParameter("UNAME");
                    //String upwd = request.getParameter("PSD"); 
                    String userid = session.getAttribute("UNAME").toString(); 
                    //out.println(userid);
                    String qr = "Select UNAME,EMAIL,MOBILE from register where UNAME='"+userid+"' ";
                    //String qr="Select * from register";
                    String dbname=null,dbpsd=null;
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/adiquery","root","root");
                    PreparedStatement ps = con.prepareStatement(qr);
                    
//                    ps.setString(1,uname);
//                    ps.setString(2,upwd);
                    
                    
                    ResultSet rs= ps.executeQuery();
                    while(rs.next())
                    {
//                       %>
                       <tr bgcolor="#C8C8C8">

                       <td><%=rs.getString("UNAME") %></td>
                          <td><%=rs.getString("EMAIL") %></td>
                            <td><%=rs.getString("MOBILE") %></td>

                       </tr>

      <% 
                    }
                   }catch(Exception ex){}
                                
    %>
                  
                    </table>
                </div>
            </div>
    
    <br><br><br><br><br>
        
    </body>
</html>
