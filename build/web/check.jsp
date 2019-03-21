<%-- 
    Document   : check
    Created on : 8 Apr, 2018, 10:45:58 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>check</title>
        <style>
            body{
                background: url("6.jpg");
            }
            h1{
                text-align: center;
                font-size: 4em;   
                //color:greenyellow;
                margin-top: auto;
            }
            
            .container{
              
		margin-top: 4em;
                margin-left: 4em;
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
            #login-box{
                width: 700px;
                border:  0;
                padding-top: 4em;
                text-align: center;
                margin-left: 4em;
                margin-top: 2em;                
                background: rgba(0,0,0,0.1);
                font-size: 2em;
                 top:30%;
                 left:25%;
                position:absolute;
                font-style: inherit;
                
                
            }
            #login-box input[name ="Actual"]
            {          
                border: none;
             width :400px; 
             opacity: 2;
              
  
            }
            #login-box input[name ="Visual"]
            {     
                border: none;
                width: 400px;             
             }
             #login-box input[name="submit"]
             {
                 border :none;
	       background:#1c8adb;
	      outline:none;
	       height:40px;
	      color:inherit;
	       font-size:18px;
	      border-radius:20px;
             }
        </style>
        
        
        <script>
            function myFunction(){
                var a_link = document.getElementById("a_link").value;
                var v_link = document.getElementById("v_link").value; 
                var ans="";
                for(var i=0;i<a_link.length;i++)
                {
                    if(a_link[i]!='#'&&a_link[i]!='&'&&a_link[i]!='='&&a_link[i]!='?'&&a_link[i]!='_')
                    {
                        ans=ans+a_link[i];
                    //alert(a_link[i]);
                    }
                    else
                        ans+='a';
                }
                //alert(ans);
                a_link=ans;
                //alert(a_link);
                if(v_link.length<1)
                {
                    v_link="empty";
                }
                
                a_link += "0000000000"+v_link;
                //alert(a_link);
                window.location.href = "link.jsp?a_link="+a_link;
            }
        </script>
    </head>
    <body>
        <h1> <a href="http://www.mnnit.ac.in/"/><img src="1.png" align="left" width="150" height="150"></a>
            DETECTION OF PHISHING ATTACK</h1>
        
        
        
        <div class="container">          
                  <div class="header">
                            <nav>    
				  <ul>
				         <li><a href="UseraDetail.jsp">MY DETAIL</a></li>
					 <li><a href="check.jsp">CHECK BLACKLIST</a></li>
					 <li><a href="blacklist.jsp">BLACKLIST</a></li>
					 <li><a href="feedback.jsp">GIVE FEEDBACK</a></li>
					 <li><a href="index.html">LOGOUT</a></li>				  </ul>
				</nav>    
                   </div>
            </div>
        
        <div id="login-box">
        <form action="" method="POST">
            
           <label for="ACTUAL LINK">
        <b>Actual</b></label>
    <input name="Actual" type="email" 
           id="a_link" class="form-control" placeholder="Enter Actual Link"
        required style="height:40px;"/>
    <br><br>
    <label for="VISUAL LINK">
        <b>Visual</b></label>
    <input name="Visual" type="email" id="v_link"
           class="form-control" placeholder="Enter Visual Link" style="height:40px;"/>
    <br><br>
           
           <input type="button"   onclick="myFunction()" id="submit" name="submit" value="Check">
            </form>
            </div>
    </body>
</html>
