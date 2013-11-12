/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ManejadorUsuariosBD;

/**
 *
 * @author Luis
 */
@WebServlet(name = "ServletLoginAdmin", urlPatterns = {"/ServletLoginAdmin"})

public class ServletLoginAdmin extends HttpServlet {
private ManejadorUsuariosBD manejador;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
  

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

     public void init()
    {
    	try 
    	{
    		if(this.getServletContext().getAttribute("manejadorUsuarios") == null) // Si aún no se ha creado el manejador en el contexto
    		{
    			this.getServletContext().setAttribute("manejadorUsuarios",new ManejadorUsuariosBD("root","root","sismar")); // entonces se crea
    			System.out.println("Se ha creado un manejador de usuarios para la BD.");
    		}
    		
    		this.manejador = (ManejadorUsuariosBD)this.getServletContext().getAttribute("manejadorUsuarios");
	} 
    	catch (Exception e) {e.printStackTrace();}
		
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usr = request.getParameter("usuarioAdmin");
        String pwd = request.getParameter("password");
     
        request.getSession().setAttribute("usuarioAdmin",usr);
        request.getSession().setAttribute("password",pwd);
        request.getSession().setAttribute("resultado",this.manejador.validarUsuarioAdmin(usr, pwd));
        response.sendRedirect("prueba.jsp");
       
    }

}
