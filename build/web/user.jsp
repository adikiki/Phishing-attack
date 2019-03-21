<%-- 
    Document   : user
    Created on : 7 Apr, 2018, 6:13:13 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</html>
    <head>
	<title> User Login</title>
	<link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
       <h2> <a href="index.html">BACK</a></h2>
	   <div class="login-box">
	   <img src="grid-img1.png" class="avatar">
	      <h1>User Login</h1>
         <form role="form" method="POST" action="USER">
             <p>Username</p>
		     <input type="text" name="Username" placeholder="username">
		     <p>Password</p>
		     <input type="password" name="Password" placeholder="password">
             <input type="submit" name="submit" value="Login">
             <a href="#">  &emsp;  Forget Password &emsp; </a>
			 <a href="UserRegister.jsp"> &emsp; Resistration</a>
          </form>           	
			
	   </div>
	   
	   
    </body>
</html>
