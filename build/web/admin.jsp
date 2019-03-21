<%-- 
    Document   : admin
    Created on : 7 Apr, 2018, 6:12:07 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</html>
    <head>
	<title> Admin Login</title>
	<link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
	  <div class="login-box">
	   <img src="25.jpeg" class="avatar">
	      <h1>Admin Login</h1>
         <form role="form" method="post" action="welcome">
             <p>Username</p>
		     <input type="text" name="username" placeholder="username">
		     <p>Password</p>
		     <input type="password" name="password" placeholder="password">
             <input type="submit" name="submit" value="Login">
             <a href="#">&emsp;&emsp; Forget Password &nbsp;</a>
			 <a href="index.html">&emsp; back</a>
          </form>           	
			
	   </div>
	 </body>
</html>
