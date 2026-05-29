<%-- 
    Document   : login_page
    Created on : May 29, 2026, 4:12:01 PM
    Author     : LOQ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login Page</title>
        <style>
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: Arial, sans-serif;
            }
            .container{
                width: 100%;
                height: 100vh;
                display: flex;
            }
            .left-side{
                width: 50vw;
                background: linear-gradient(to bottom, #162436 0%, #040914 100%);
                flex-direction: column;
                display: flex;
                justify-content: center;
                align-items: center;
                text-align: center;
                color: white;            
            }
            .left-side p1{
                margin-top: 20px;
            }
            .left-side h1{
                font-size: 40px;
            }
            .right-side{
                width: 50vw;
                background-color: white;
                display: flex;
                justify-content: center;
                align-items: center;
            }
            body{
                height: 100vh;
            }
            .mobile-title{
                display: none;
            }
            .right-side p3{
                display: none;
            }
            .login-box{
                border-style: solid;
                border-radius: 10px;
                border-color: #ccc;
                border-width: 0.8px;
                height: 450px;
                padding: 10px;
            }
            .login-box h2{
                margin: 20px;
                font-size: 24px;
            }
            .login-box p{
                margin: 20px;
                font-size: 15px
            }
            .form-group {
                margin-bottom: 20px;
                text-align: left;
                margin-left: 20px;
            }
            .form-group label{
                font-weight: bold;
                font-size: 15px;
            }
            .form-group input{
                width: 100%;
                padding: 10px;
                border-radius: 10px;
                border-color: #ccc;
                border-width: 0.8px;
                background-color: whitesmoke;
            }
            .submit-area{
                padding: 10px;
            }
            .submit-area button{
                width: 100%;
                margin-left: 10px;
                padding: 10px;
                background-color: #086779;
                font-weight: bold;
                color: whitesmoke;
                border-radius: 10px;
                border-color: #ccc;
                border-width: 0.8px;
            }
            .footer{
                text-align: center;
            }
            @media only screen and (max-width: 768px){
                .left-side{
                    display: none;
                }
                .right-side{
                    width: 100vw;
                    flex-direction: column;
                }
                .login-box{
                    width: 90%;
                }
                .mobile-title{
                    display: block;
                    text-align: center;                   
                }
                .right-side p3{
                    display: block;
                    text-align: center;
                }
            }
        </style>
    </head>
    <body>
        <div class="container">           
            <div class="left-side">
                <h1>AutoWash Pro</h1>
                <p1>Industrial-grade automated hardware manegement.</p1>
                <p2>Secure, systematic, and frictionless operation.</p2>
            </div>
            <div class="right-side">
                <h1 class="mobile-title">AutoWash Pro</h1>
                <p3>Welcome back!Log in to manage your account and rewards.</p3>
                <div class="login-box">
                    <h2>Sign In</h2>
                    <p>Enter your Credentials to access the facility dashboard.</p>
                    <form action="LoginController" method="post">
                        <div class="form-group">
                            <label>Phone Number</label>
                            <input type="text" placeholder="(555)000-0000" name="txtphonenumber" required="">
                        </div>
                        
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" placeholder="********" name="txtpassword" required="">
                        </div>
                        
                        <div class="submit-area">
                            <button type="submit" class="btn btn-primary">LOG IN</button>
                        </div>
                    </form>
                    <div class="footer">
                            New to AutoWash Pro? <a href="#">Create An account</a>
                    </div>
                </div>          
            </div>
        </div>
        <%
           String msg=(String)request.getAttribute("ERROR");
           if(msg!=null){
             out.print(msg);
            }
        %>
    </body>
</html>
