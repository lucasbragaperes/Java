<%-- 
    Document   : exibeResultado.jsp
    Author     : Gabriel
--%>

<%@page import="negocio.Adicao"%>
<%@page import="negocio.Subtracao"%>
<%@page import="negocio.Divisao"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="negocio.Multiplicacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P2</title>
    </head>
    <body>
        <h3>ADS Noturno</h3>
        <h3>Gabriel Gregorio</h3>

        <%
            float v1 = Float.parseFloat(request.getParameter("valor1"));
            float v2 = Float.parseFloat(request.getParameter("valor2"));
            
            String op = request.getParameter("btnCalcular");
            if (op.equals("+")){
                Adicao add = new Adicao();
                
                out.println("<h1>Resultado: </h1>");
                out.println(add.somar(v1, v2));
                
            } else if (op.equals("-")){
                Subtracao sub = new Subtracao();
                
                out.println("<h1>Resultado: </h1>");
                out.println(sub.subtrair(v1, v2));
                
            } else if (op.equals("/")){
                Divisao div = new Divisao();
                
                if (v2 == 0) {
                    out.println("Impossível dividir por 0");
                } else {
                    out.println("<h1>Resultado: </h1>");
                    out.println(div.dividir(v1, v2));
                }
            } else if (op.equals("x")){
                Multiplicacao mult = new Multiplicacao();
                
                out.println("<h1>Resultado: </h1>");
                out.println(mult.multiplicar(v1, v2));
            }
            %><br>
        <a href=index.jsp"><button style="background-color: blueviolet; height: 100%; width: 30%; border: none">
                    retornar </button></a>
    </body>
</html>
