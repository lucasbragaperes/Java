<%-- 
    Document   : exibeResultado
    Created on : 04/12/2018, 20:34:55
    Author     : Gabriel Gregorio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    <h3 style="text-align: center">ADS Noturno</h3>
    <h3 style="text-align: center">Gabriel Gregorio do Couto</h3>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title style="text-align: center">Resultado de área e perímetro das figuras</title>

</head>
<body>
    <h2 style="text-align: center">Resultado de área e perímetro das figuras</h2>
    <br>

    <h3 style="text-align: center">Área do Retângulo: <%= request.getAttribute("areaRet").toString()%></h3>
    <h3 style="text-align: center">Perímetro do Retângulo: <%= request.getAttribute("perimetroRet").toString()%></h3>
    <h3 style="text-align: center"> Área do Triângulo: <%= request.getAttribute("areaTri").toString()%></h3>
    <h3 style="text-align: center">Perímetro do Triângulo: <%= request.getAttribute("perimetroTri").toString()%></h3>

</body>


</html>
