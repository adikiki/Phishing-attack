<%-- 
    Document   : UserRegister
    Created on : 9 Apr, 2018, 7:59:46 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>registration</title>
	<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>
<script type="text/javascript" src='https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.3.min.js'></script>
<script type="text/javascript" src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js'></script>
<link rel="stylesheet" href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css' media="screen" />
<a href="user.jsp" ><h2 style="none">BACK</h2></a>
	<div class="login-box">
	<!--img src="grid-img1.png" class="avatar"-->
	      <h1><b>User Registration</b></h1>
    <form action="accountuser" method="POST" >
<!--<div style="max-width: 400px;">
    <h2 class="form-signin-heading">
        Registration</h2>-->
        <label for="Name">
        <b>Name</b></label>
    <input name="Uname" type="text" id="txtUsername" class="form-control" placeholder="Enter Name"
        required />
    <br />
    
    <label for="Address">
        <b>Address</b></label>
    <input name="UserAddress" type="text" id="txtUsername" class="form-control" placeholder="Enter Address"
        required />
    <br />

    <label for="Username">
        <b>Username</b></label>
    <input name="Username" type="text" id="txtUsername" class="form-control" placeholder="Enter Username"
        required />
    <br />
    <label for="Password">
        <b>Password</b></label>
    <input name="Password" type="password" id="txtPassword" title="Password must contain: Minimum 8 characters atleast 1 Alphabet and 1 Number"
        class="form-control" placeholder="Enter Password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" />
    <br />
    <label for="ConfirmPassword">
        Confirm Password</label>
    <input name="ConfirmPassword" type="password" id="txtConfirmPassword" class="form-control"
        placeholder="Confirm Password" />
    <br />
    
    <label for="Email">
        Email</label>
    <input name="Email" type="text" id="txtEmail" class="form-control" placeholder="Enter Email"
        required pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"/>
    <br />
    
    <label for="Mobile">
        Contact</label>
    <input name="contact" type="text" id="txtEmail" class="form-control" placeholder="Enter Mobileno"
         maxlength="10" required pattern="(7|8|9)\d{9}" />
    <br />
	
	
    
    
	
    <input type="submit" name="Signup" value="Sign up" id="btnSignup" class="btn btn-primary" />
</div>
</form>
</div>

<script type="text/javascript">
    window.onload = function () {
        var Password = document.getElementById("Password");
        var ConfirmPassword = document.getElementById("ConfirmPassword");
        Password.onchange = ConfirmPassword;
        ConfirmPassword.onkeyup = ConfirmPassword;
        function ConfirmPassword() {
            ConfirmPassword.setCustomValidity("");
            if (Password.value !== ConfirmPassword.value) {
                ConfirmPassword.setCustomValidity("Passwords do not match.");
            }
        }
    };
</script>
</body>
</html>

