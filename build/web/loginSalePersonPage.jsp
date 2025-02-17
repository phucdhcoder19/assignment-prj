<%-- 
    Document   : loginSalePersonPage
    Created on : Feb 17, 2025, 6:49:54 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="./mystyle.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <div class="login-container">
            <div class="container2">
                <div class="login-item">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mercedes-Logo.svg/2048px-Mercedes-Logo.svg.png" alt="Logo" style="height: 50px;width: 50px;">
                </div>

                <div class="login-item">
                    <h2>Enter your name to join</h2>
                </div>

                <form class="login-item">
                    <input class="input-login" placeholder="Name*" required="" type="text" name="txtname"><!-- comment -->
                </form>

                <div class="login-item login-policy">
                    By continuing, I agree to HP's Privacy Policy and Terms of Use.
                </div>

                <div class="login-item login-submit">
                    <input class="btn-submit" type="submit" value="Login"><!-- comment -->
                </div>
            </div>
        </div>


    </body>
</html>
