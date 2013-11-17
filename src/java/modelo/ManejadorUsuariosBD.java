/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Auxiliares;

/**
 *
 * @author Luis
 */
public class ManejadorUsuariosBD {
   
	DAOjdbc bd;
        
    
        public ManejadorUsuariosBD(String usuarioMySQL, String passwordMySQL, String bdNombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
        {
        	this.bd=new DAOjdbc();
        	this.bd.conectar(usuarioMySQL,passwordMySQL,bdNombre);
                System.out.println("Conexión realizada con éxito.");
        } 
        
        public boolean validarUsuarioAdmin(String u, String pwd)
        {
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect("SELECT numero, password FROM personal WHERE numero='"+u+"' AND password='"+pwd+"'");
                if(cdr==null)return false;
                if(cdr!=null && !cdr.first())return false;
           
                return true;
            } 
            catch (SQLException ex) {Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);return false;}
        }

            public boolean validarUsuario(String u, String password)
        {
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect("SELECT numero, password FROM cliente WHERE numero='"+u+"' AND password='"+password+"'");
                if(cdr==null)return false;
                if(cdr!=null && !cdr.first())return false;
           
                return true;
            } 
            catch (SQLException ex) {Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);return false;}
        }
            
         public String insertar(String numero, String nombre, String paterno, String materno, String password, String correo, String direccion, String telefono, String numTarjeta, String codSeguridad, String tipoTarjeta)
         {
             String fecha = Auxiliares.fechaActual();
             
             PreparedStatement stm; 
             try{
                 stm= this.bd.conexion().prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
                 stm.setString(1, numero);
                 stm.setString(2, nombre);
                 stm.setString(3, paterno);
                 stm.setString(4, materno);
                 stm.setString(5, fecha);
                 stm.setString(6, correo);
                 stm.setString(7, direccion);
                 stm.setString(8, telefono);
                 stm.setString(9, numTarjeta);
                 stm.setString(10, codSeguridad);
                 stm.setString(11, tipoTarjeta);
                 stm.setString(12, password);
                
                 stm.executeUpdate();
                 return "exito";
             }
              catch(SQLException ex){
                  ex.printStackTrace();
                  String error = ex.getMessage().toString();
                  System.out.println(ex);
                  return error;
              }
         }
         
         public List<Producto> menu() throws SQLException {
             PreparedStatement stm=null;
             ResultSet res=null;
             List<Producto> productos = new ArrayList<Producto>();
             try{
                stm= this.bd.conexion().prepareStatement("select nombre, paterno from cliente");
                stm.executeQuery();
                
                //res.beforeFirst();
                
                while(res.next())
                {
                    Producto product= new Producto();
                    product.setNombre(res.getString("nombre"));
                    product.setDescripcion(res.getString("paterno"));
                    productos.add(product);
                }
             }
             finally{
             if (productos.equals(null)){}    
             if (res != null) try { res.close(); } catch (SQLException sql) {sql.getMessage().toString();}
             if (stm != null) try { stm.close(); } catch (SQLException sql) {sql.getMessage().toString();}
          
             }
             return productos;
        }   
}
