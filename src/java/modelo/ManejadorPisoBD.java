/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import POJOs.*;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class ManejadorPisoBD {
    
    DAOjdbc bd;
    
    public ManejadorPisoBD(String usuarioMySQL, String passwordMySQL, String bdNombre) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        	this.bd=new DAOjdbc();
        	this.bd.conectar(usuarioMySQL,passwordMySQL,bdNombre);
                System.out.println("Conexión realizada con éxito con usuario "+usuarioMySQL+" y base de datos accedida "+bdNombre);
    } 
   
    public ManejadorPisoBD() 
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
    
    public boolean agregarItem(Item x)
    {
        try 
        {
            String query="insert into item (nombre,descripcion,costo,tipoItem_id) values ('"+x.getNombre()+"'"+"','"+x.getDescripcion()+"'"+","+x.getCosto()+","+x.getTipoItemId()+")";
            System.out.println("QUERY agregarItem(Item x):"+query);
            this.bd.ejecutarUpdate(query);
            return true;
        } 
        catch (SQLException ex) 
        {
            //Logger.getLogger(ManejadorPisoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean agregarMesa(Mesa x)
    {
        try 
        {
            String query="insert into mesa (nombre,descripcion,personas,comentarios) values ('"+x.getNombre()+"','"+x.getDescripcion()+"',"+x.getPersonas()+",'"+x.getComentarios()+"')";
            System.out.println("QUERY agregarMesa(Mesa x):"+query);
            this.bd.ejecutarUpdate(query);
            return true;
        } 
        catch (SQLException ex) 
        {
            //Logger.getLogger(ManejadorPisoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public String obtenerIDTipoItem(String tipo)
    {
        try 
        {
            String query="select id from tipoitem where tipo='"+tipo+"'";
            System.out.println("QUERY obtenerIDTipoItem(String tipo):"+query);
            ResultSet cdr = this.bd.obtenerSelect(query);
            if(cdr.first())
                return cdr.getString(1);
            else 
                return null;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ManejadorPisoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String obtenerIDMesa(String nombre)
    {
        try 
        {
            String query="select id from mesa where nombre='"+nombre+"'";
            System.out.println("QUERY obtenerIDMesa(String nombre):"+query);
            ResultSet cdr = this.bd.obtenerSelect(query);
            if(cdr.first())
                return cdr.getString(1);
            else 
                return null;
        } 
        catch (SQLException ex) {
            Logger.getLogger(ManejadorPisoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
