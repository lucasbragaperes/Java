<%-- 
    Document   : index
    Created on : 04/12/2018, 20:36:12
    Author     : Gabriel Gregorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <h3>ADS Noturno</h3>
    <h3>Gabriel Gregorio do Couto</h3>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body style="text-align: center">
    
    <form action="ServletFigura" method="post">
        Base: <input type="number" name="base" min="1" required><br>
        Altura: <input type="number" name="altura" min="1" required><br><br>
        <input type="submit" value="Calcular área e perímetro das figuras">
    </form>        
</body>
</html>
