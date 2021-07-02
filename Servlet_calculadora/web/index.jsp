<%-- 
    Document   : index.jsp
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P2</title>
    </head>
    <body>
        <h2>ADS Noturno</h2>
        <h2>Gabriel Gregorio</h2>
        
        <h1 style="text-align: center;  margin-top: 85px ">Calcular</h1>
        <form style="text-align: center; margin-top:10px" action="ServletCalculo">
            Valor 1: <input  type="text" name="valor1"><br>
            Valor 2: <input type="text" name="valor2"><br><br>
            <input type="submit" name="btnCalcular" value="+">
            <input type="submit" name="btnCalcular" value="-">
            <input type="submit" name="btnCalcular" value="x">
            <input type="submit" name="btnCalcular" value="/">
        </form>
        
    </body>
</html>
