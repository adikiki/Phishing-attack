<%-- 
    Document   : feedback
    Created on : 10 Apr, 2018, 3:12:54 AM
    Author     : WELCOME
--%>

<
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Account</title>
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
                margin-left: 2em;
                margin-top: 2em;                
                background: rgba(0,0,0,0);
                font-size: 2em;
                 top:30%;
                 left:25%;
                position:absolute;
                font-style: inherit;
                
                
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
            
        </style>
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
           
            <form action="feed" method="POST">
                
                <textarea  name="message"  cols="50" rows="20"  >
                Write something.....
              </textarea><br>
              
              <input name="submit" type="submit"  value="Feedback" required/>
              
              
                
                </form>
            </div>
                    
   
        
        
        
    </body>
</html>
