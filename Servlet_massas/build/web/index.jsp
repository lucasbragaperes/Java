<%-- 
    Document   : index
    Created on : 1 de jun. de 2021, 20:35:57
    Author     : Davi Reis <davi@davi.pro.br>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP com Servlet</title>
    </head>
    <body>
        <h2>JSP com Servlet | Conversão de massa</h2>
        
        <form action="ServletConversaoDeMassa">
            Massa original: <input type="text" name="massaOriginal"><br><br>
            <input type="submit" name="btnConverter" value="kg para lbs">
            <input type="submit" name="btnConverter" value="lbs para kg">
        </form>
    </body>
</html>
