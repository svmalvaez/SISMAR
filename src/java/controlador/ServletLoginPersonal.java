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

@WebServlet(name = "ServletLoginPersonal", urlPatterns = {"/ServletLoginPersonal"})

public class ServletLoginPersonal extends HttpServlet {
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
    		if(this.getServletContext().getAttribute("manejadorUsuariosBD") == null) // Si aún no se ha creado el manejador en el contexto
    		{
    			this.getServletContext().setAttribute("manejadorUsuariosBD",new ManejadorUsuariosBD("root","pass","sismar")); // entonces se crea
    			System.out.println("Se ha creado un manejador de usuarios para la BD desde el servlet ServletLoginPersonal.");
    		}
    		
    		this.manejador = (ManejadorUsuariosBD)this.getServletContext().getAttribute("manejadorUsuariosBD");
	} 
    	catch (Exception e) {e.printStackTrace();}
		
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String usr = request.getParameter("usuarioPersonal");
        String pwd = request.getParameter("password");
     
        request.getSession().setAttribute("usuarioPersonal",usr);
        request.getSession().setAttribute("password",pwd);
    }

}
