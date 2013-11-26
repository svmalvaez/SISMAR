/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class ManejadorAdministrativoBD {
   DAOjdbc bd;

    public ManejadorAdministrativoBD(String usuarioMySQL, String passwordMySQL, String bdNombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        	this.bd=new DAOjdbc();
        	this.bd.conectar(usuarioMySQL,passwordMySQL,bdNombre);
                System.out.println("Conexión realizada con éxito con usuario "+usuarioMySQL+" y base de datos accedida "+bdNombre);
    } 
   
    public ManejadorAdministrativoBD() 
    {
        try 
            {
                this.bd=new DAOjdbc();
                this.bd.conectar("root","joshimar","sismar");
                System.out.println("Conexión realizada con éxito con usuario root y base de datos accedida sismar"); 
            } 
            catch (SQLException ex) {
                Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
   
   
}
