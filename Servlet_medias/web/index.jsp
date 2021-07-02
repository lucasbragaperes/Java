<%-- 
    Document   : index
    Created on : 1 de jun. de 2021, 21:40:49
    Author     : Davi Reis <davi@davi.pro.br>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP | Servlet | Média</title>
    </head>
    <body>
        <h2>Cálculo de média</h2>
        <h3>Informe as notas das avaliações:</h3>
        <form action="ServletMedia">
            P1: <input type="text" name="notaP1" size="6"><br>
            P2: <input type="text" name="notaP2" size="6"><br>
            TP: <input type="text" name="notaTP" size="6"><br><br>
            <input type="submit" name="btnCalcularMedia" value="Calcular média">
        </form>
    </body>
</html>
