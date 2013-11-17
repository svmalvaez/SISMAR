/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;
import modelo.ManejadorUsuariosBD;
/**
 *
 * @author Sergio
 */
@WebServlet(name = "ServletMenu", urlPatterns = {"/ServletMenu"})
public class ServletMenu extends HttpServlet {
private ManejadorUsuariosBD manejador;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
  /*try {
        List<Producto> productos = manejador.menu();
        request.setAttribute("productos", productos); //  ${productos} en JSP
        request.getRequestDispatcher("/Modal.jsp").forward(request, response);
    } catch (SQLException e) {
        throw new ServletException("No se pueden obtener datos de la BD", e);
    }*/
        request.getRequestDispatcher("/Modal.jsp").forward(request, response);
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
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
