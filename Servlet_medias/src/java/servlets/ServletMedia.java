/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Media;

/**
 *
 * @author Davi Reis <davi@davi.pro.br>
 */
@WebServlet(name = "ServletMedia", urlPatterns = {"/ServletMedia"})
public class ServletMedia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>JSP | Servlet | Média</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Servlet para cálculo de média</h2>");
            
            // valida se os valores foram devidamente preenchidos
            if (request.getParameter("notaP1") != null &&
                request.getParameter("notaP1").length() > 0 &&
                request.getParameter("notaP2") != null &&
                request.getParameter("notaP2").length() > 0){
                
                // recupera os valores informados como parâmetros
                float p1 = Float.parseFloat(request.getParameter("notaP1"));
                float p2 = Float.parseFloat(request.getParameter("notaP2"));
                
                // instancia objeto do tipo média
                Media objMedia = new Media();
                // se há nota de TP, faz o cálculo com 3 notas; do contrário, somente com 2
                if (request.getParameter("notaTP") != null &&
                    request.getParameter("notaTP").length() > 0){
                    // recupera o 3º. valor
                    float tp = Float.parseFloat(request.getParameter("notaTP"));
                    // calcula a média com 3 valores
                    objMedia.calcularMedia(p1, p2, tp);
                }
                else {
                    objMedia.calcularMedia(p1, p2);
                }
                // exibe o resultado da média
                out.println(String.format("<h3>Média final: %.2f</h3>", objMedia.getMedia()));
            }
            else{
                out.println("<h3>Valores insuficientes para cálculo da nota.</h3>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
