/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Sergio
 */
@WebServlet(name = "ServletRegistroUsuario", urlPatterns = {"/ServletRegistroUsuario"})
public class ServletRegistroUsuario extends HttpServlet {

    private ManejadorUsuariosBD manejador;

   
    @Override
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
       String numero = request.getParameter("numero");
       String nombre = request.getParameter("nombre");
       String paterno = request.getParameter("paterno");
       String materno = request.getParameter("materno");
       String password = request.getParameter("password");
       String correo = request.getParameter("correo");
       String direccion = request.getParameter("direccion");
       String telefono = request.getParameter("telefono");
       String numTarjeta = request.getParameter("numTarjeta");
       String codSegTarjeta = request.getParameter("codSeguridad");
       String tipoTarjeta = request.getParameter("tipoTarjeta");
  
       request.getSession().setAttribute("registro", numero + nombre + paterno + materno + correo + tipoTarjeta);
       request.getSession().setAttribute("bd",this.manejador.insertar(numero, nombre, paterno, materno, password, correo, direccion, telefono, numTarjeta, codSegTarjeta, tipoTarjeta));
       response.sendRedirect("index.jsp");
       
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
