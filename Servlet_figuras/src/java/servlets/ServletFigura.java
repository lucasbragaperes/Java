package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Retangulo;
import negocio.Triangulo;

@WebServlet(name = "ServletFigura", urlPatterns = {"/ServletFigura"})
public class ServletFigura extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                    System.out.println("foooi");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ServletFigura</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ServletFigura</h1>");
            float base, altura;

            base = Float.parseFloat(request.getParameter("base"));
            altura = Float.parseFloat(request.getParameter("altura"));
            
            Retangulo objRet = new Retangulo(base, altura);

            Triangulo objTri = new Triangulo(base, altura);

            request.setAttribute("areaRet", objRet.calcularArea());
            request.setAttribute("perimetroRet", objRet.calcularPerimetro());
            request.setAttribute("areaTri", objTri.calcularArea());
            request.setAttribute("perimetroTri", objTri.calcularPerimetro());

            RequestDispatcher rd = request.getRequestDispatcher("exibeResultado.jsp");

            rd.forward(request, response);
            System.out.println(request);
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