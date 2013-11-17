/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ManejadorUsuariosBD;
import POJOs.*;

/**
 *
 * @author Sergio
 */
@WebServlet(name = "ServletLoginCliente", urlPatterns = {"/ServletLoginCliente"})
public class ServletLoginCliente extends HttpServlet {

    private ManejadorUsuariosBD manejador;

   
     public void init()
    {
    	try 
    	{
    		if(this.getServletContext().getAttribute("manejadorUsuariosBD") == null) // Si aún no se ha creado el manejador en el contexto
    		{
    			this.getServletContext().setAttribute("manejadorUsuariosBD",new ManejadorUsuariosBD("root","pass","sismar")); // entonces se crea
    			System.out.println("Se ha creado un manejador de usuarios para la BD desde el servlet ServletLoginCliente.");
    		}
    		
    		this.manejador = (ManejadorUsuariosBD)this.getServletContext().getAttribute("manejadorUsuariosBD");
	} 
    	catch (Exception e) {e.printStackTrace();}
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usr = request.getParameter("usuario");
        String password = request.getParameter("password");
        request.getSession().setAttribute("usuario",usr);
        request.getSession().setAttribute("password",password);
        //request.getSession().setAttribute("resultado",this.manejador.validarUsuario(usr, password));
        
        if(this.manejador.validarUsuarioCliente(usr, password))
        {
        response.sendRedirect("indexUser.jsp");
        }
        else
        {
        request.getSession().setAttribute("cliente",null);
        request.getSession().setAttribute("password",null);
        response.sendRedirect("index.jsp");
        }
       
    }
  
}
