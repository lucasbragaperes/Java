
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Massa;

/**
 *
 * @author Davi Reis <davi@davi.pro.br>
 */
@WebServlet(name = "ServletConversaoDeMassa", urlPatterns = {"/ServletConversaoDeMassa"})
public class ServletConversaoDeMassa extends HttpServlet {

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
            out.println("<title>Conversão de Massa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>JSP com Servlet | Conversão de massa</h2>");
            
            // valida se os valores foram corretamente preenchidos
            if (request.getParameter("massaOriginal") != null &&
                request.getParameter("massaOriginal").length() > 0){
                // recebe o valor informado pelo usuário
                float massaOriginal = Float.parseFloat(request.getParameter("massaOriginal"));
                float massaConvertida = 0;
                if (request.getParameter("btnConverter").equals("kg para lbs")){
                    // com objeto anônimo, faz a conversão da massa
                    massaConvertida = new Massa().converterQuiloParaLibra(massaOriginal);
                    out.println(String.format("%.2f kg = %.2f lbs.", massaOriginal, massaConvertida));
                }
                else{
                    massaConvertida = new Massa().converterLibraParaQuilo(massaOriginal);
                    out.println(String.format("%.2f lbs = %.2f kg.", massaOriginal, massaConvertida));
                }
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
