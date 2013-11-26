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
import POJOs.*;
import java.util.Date;
import modelo.Auxiliares;

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
            
    		if(this.getServletContext().getAttribute("manejadorUsuariosBD") == null) // Si aún no se ha creado el manejador en el contexto
    		{
    			this.getServletContext().setAttribute("manejadorUsuariosBD",new ManejadorUsuariosBD("root","pass","sismar")); // entonces se crea
    			System.out.println("Se ha creado un manejador de usuarios para la BD desde el servlet ServletRegistroUsuario.");
    		}
    		
    		this.manejador = (ManejadorUsuariosBD)this.getServletContext().getAttribute("manejadorUsuariosBD");
	} 
    	catch (Exception e) {e.printStackTrace();}
		
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String numero = this.manejador.generarNuevoNumero("cliente");
       String nombre = request.getParameter("nombre");
       String paterno = request.getParameter("paterno");
       String materno = request.getParameter("materno");
       String fechaRegistro = Auxiliares.fechaActual();
       String password = request.getParameter("password");
       String correo = request.getParameter("correo");
       String direccion = request.getParameter("direccion");
       String telefono = request.getParameter("telefono");
       String numTarjeta = request.getParameter("numTarjeta");
       String codSegTarjeta = request.getParameter("codSeguridad");
       String tipoTarjeta = request.getParameter("tipoTarjeta");
       
      Cliente nuevo = new Cliente(numero,nombre,paterno,materno,Auxiliares.formatearFecha(fechaRegistro),correo,direccion,telefono,numTarjeta,codSegTarjeta,tipoTarjeta,password);
      if(this.manejador.agregarUsuarioCliente(nuevo))
         System.out.println("Usuario "+nuevo.getNombre()+": "+nuevo.getNumero()+" ha sido agregado satisfactoriamente."); 
      else
         System.out.println("ERROR: fallo al intentar agregar usuario "+nuevo.getNombre()+": "+nuevo.getNumero()+"."); 
      
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
