/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import POJOs.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
                System.out.println("Conexión realizada con éxito con usuario "+usuarioMySQL+" y base de datos accedida "+bdNombre);
        } 
        
        public ManejadorUsuariosBD()
        {
            try 
            {
                this.bd=new DAOjdbc();
                this.bd.conectar("root","pass","sismar");
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
        
        
        private void agregarBitacoraPersonal(String numero, String entrada)
        {
            try 
            {
                String query="insert into bitacora (entrada,fecha,hora,personal_numero) values('"+entrada+"','"+Auxiliares.fechaActual()+"','"+Auxiliares.horaActual()+"','"+numero+"')";
                this.bd.ejecutarUpdate(query);
            } 
            catch (SQLException ex) 
            {
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        private void agregarBitacoraCliente(String numero, String entrada)
        {
            try 
            {
                String query="insert into bitacora (entrada,fecha,hora,cliente_numero) values('"+entrada+"','"+Auxiliares.fechaActual()+"','"+Auxiliares.horaActual()+"','"+numero+"')";
                this.bd.ejecutarUpdate(query);
            } 
            catch (SQLException ex) 
            {
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        public boolean validarUsuarioCliente(String numero, String pwd)
        {
             String query = "SELECT * FROM cliente WHERE numero='"+numero+"' AND password='"+pwd+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr.next())
                    return true;
                
                else
                {
                     return false;
                }
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public boolean existeUsuarioCliente(String numero)
        {
            String query = "select * from cliente where numero='"+numero+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return false;
                
                else
                {
                    if(cdr.first() && cdr.getString("numero").equals(numero))
                        return true;
                    else
                        return false;
                }
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public boolean agregarUsuarioCliente(Cliente u)
        {
            u.setNumero(this.generarNuevoNumero("cliente"));
            String query = "insert into cliente (numero,nombre,paterno,materno,fechaRegistro,correo,direccion,telefono,numTarjeta,codSegTarjeta,tipoTarjeta,password) ";
            query+="values ('"+u.getNumero()+"','"+u.getNombre()+"','"+u.getPaterno()+"','"+u.getMaterno()+"','"+Auxiliares.formatearFecha(u.getFechaRegistro())+"','"+u.getCorreo()+"','"+u.getDireccion()+"','"+u.getTelefono()+"','"+u.getNumTarjeta()+"','"+u.getCodSegTarjeta()+"','"+u.getTipoTarjeta()+"','"+u.getPassword()+"');";
            try 
            {
                this.bd.ejecutarUpdate(query);
                return true;
            }
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public Cliente obtenerUsuarioCliente(String numero)
        {
            
            Cliente c = new Cliente();
            String query = "select * from cliente where numero ='"+numero+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                return null;
                else if( cdr.first() )
                {
                  c.setCodSegTarjeta(cdr.getString("codSegTarjeta"));
                  c.setCorreo(cdr.getString("correo"));
                  c.setDireccion(cdr.getString("direccion"));
                  c.setFechaRegistro(Auxiliares.formatearFecha(cdr.getString("fechaRegistro")));
                  c.setMaterno(cdr.getString("materno"));
                  c.setNombre(cdr.getString("nombre"));
                  c.setNumTarjeta(cdr.getString("numTarjeta"));
                  c.setNumero(cdr.getString("numero"));
                  c.setPassword(cdr.getString("password"));
                  c.setPaterno(cdr.getString("paterno"));
                  c.setTelefono(cdr.getString("telefono"));
                  c.setTipoTarjeta(cdr.getString("tipoTarjeta"));

                  return c;
                }
                else 
                return null;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        public boolean actualizarUsuarioCliente(Cliente u) 
        {
            
            String query="update cliente set nombre='"+u.getNombre()+"', paterno='"+u.getPaterno()+"', materno='"+u.getMaterno()+"', fechaRegistro='"+Auxiliares.formatearFecha(u.getFechaRegistro())+"', correo='"+u.getCorreo()+"', direccion='"+u.getDireccion()+"', telefono='"+u.getTelefono()+"', numTarjeta='"+u.getNumTarjeta()+"', codSegTarjeta='"+u.getCodSegTarjeta()+"', tipoTarjeta='"+u.getTipoTarjeta()+"', password='"+u.getPassword()+"' where numero='"+u.getNumero()+"'";
			
	    try
            {
		this.bd.ejecutarUpdate(query);
		return true;
            } 
            catch (SQLException e) 
            {
                return false;
                //e.printStackTrace();
            }
			
	}
        
        
        
        
        public boolean validarUsuarioPersonal(String numero, String pwd)
        {
            String query = "select password from personal where numero='"+numero+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return false;
                
                else
                {
                    if(cdr.first() && cdr.getString("password").equals(pwd))
                        return true;
                    else
                        return false;
                }
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public boolean existeUsuarioPersonal(String numero)
        {
             String query = "select * from personal where numero='"+numero+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return false;
                
                else
                {
                    if(cdr.first() && cdr.getString("numero").equals(numero))
                        return true;
                    else
                        return false;
                }
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public boolean agregarUsuarioPersonal(Personal u)
        {
            u.setNumero(this.generarNuevoNumero("personal"));
            String query="insert into personal (numero,nombre,paterno,materno,estatus,correo,fechaAlta,curp,direccion,telefono,fechaBaja,comentarios,tipoPersonal_id,password) ";
            query+="values ('"+u.getNumero()+"','"+u.getNombre()+"','"+u.getPaterno()+"','"+u.getMaterno()+"','"+u.getEstatus()+"','"+u.getCorreo()+"','"+Auxiliares.formatearFecha(u.getFechaAlta())+"','"+u.getCurp()+"','"+u.getDireccion()+"','"+u.getTelefono()+"','"+Auxiliares.formatearFecha(u.getFechaBaja())+"','"+u.getComentarios()+"','"+u.getTipopersonal()+"','"+u.getPassword()+"');";
            
            try 
            {
                this.bd.ejecutarUpdate(query);
                return true;
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public Tipopersonal obtenerTipoPersonal(String numeroPersonal)
        {
            
            Tipopersonal tipo = new Tipopersonal();
            String query = "select tipopersonal.id, tipopersonal.tipo, tipopersonal.funciones from tipopersonal, personal where tipopersonal.id=personal.tipoPersonal_id and personal.numero='"+numeroPersonal+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return null;
                else if(cdr.first())
                {
                    tipo.setFunciones(cdr.getString(3)); 
                    tipo.setId(Integer.parseInt(cdr.getString(1)));
                    tipo.setTipo(cdr.getString(2));
                    return tipo;
                }
                else return null;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
        public boolean existeTipoPersonal(String tipo)     
        {
            String query="select * from tipopersonal where tipo='"+tipo+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return false;
                
                if(cdr.first())       
                    return true;
                else 
                    return false;
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public String obtenerIDTipoPersonal(String tipo)
        {
            String query = "select id from tipopersonal where tipo='"+tipo+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr == null)
                    return null;
                if(cdr.first())
                    return cdr.getString(1);
                else
                    return null;
                           
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public boolean actualizarUsuarioPersonal(Personal u)
        {
            
            String query="update personal set nombre='"+u.getNombre()+"', paterno='"+u.getPaterno()+"', materno='"+u.getMaterno()+"', estatus='"+u.getEstatus()+"', correo='"+u.getCorreo()+"', direccion='"+u.getDireccion()+"', telefono='"+u.getTelefono()+"', fechaAlta='"+Auxiliares.formatearFecha(u.getFechaAlta())+"', curp='"+u.getCurp()+"', gechaBaja='"+Auxiliares.formatearFecha(u.getFechaBaja())+"', password='"+u.getPassword()+"', comentarios='"+u.getComentarios()+"' where numero='"+u.getNumero()+"'";
			
	    try
            {
		this.bd.ejecutarUpdate(query);
		return true;
            } 
            catch (SQLException e) 
            {
                return false;
                //e.printStackTrace();
            }
        }
        
        public boolean existeTipoItem(String tipo)     
        {
            String query="select * from tipopersonal where tipo='"+tipo+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr==null)
                    return false;
                
                if(cdr.first())       
                    return true;
                else 
                    return false;
            } 
            catch (SQLException ex) 
            {
                return false;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public String obtenerIDTipoItem(String tipo)
        {
            String query = "select id from tipoitem where tipo='"+tipo+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                if(cdr == null)
                    return null;
                if(cdr.first())
                    return cdr.getString(1);
                else
                    return null;
                           
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                
        public Personal obtenerElementoPersonal(String numero)
        {
            Personal u = new Personal();
            String query="Select * from personal where numero='"+numero+"'";
            ResultSet cdr;
            try 
            {
                cdr = this.bd.obtenerSelect(query);
                 if(cdr.first())
                {
                    u.setComentarios(cdr.getString("comentarios"));
                    u.setCorreo(cdr.getString("correo"));
                    u.setCurp(cdr.getString("curp"));
                    u.setDireccion(cdr.getString("direccion"));
                    u.setEstatus(cdr.getString("estatus"));
                    u.setFechaAlta(Auxiliares.formatearFecha(cdr.getString("fechaAlta")));
                    u.setFechaBaja(Auxiliares.formatearFecha(cdr.getString("fechaBaja")));
                    u.setMaterno(cdr.getString("materno"));
                    u.setNombre(cdr.getString("nombre"));
                    u.setNumero(cdr.getString("numero"));
                    u.setPassword(cdr.getString("password"));
                    u.setPaterno(cdr.getString("paterno"));
                    u.setTelefono(cdr.getString("telefono"));
                    u.setTipopersonal(Integer.parseInt(cdr.getString("tipoPersonal_id")));
                    return u;
                }
                 else return null;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
       
        public Bitacora[] obtenerBitacoras(Personal u)
        {
            Bitacora[] lista = null;
            
            String query="select * from bitacora where personal_numero='"+u.getNumero()+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                lista = new Bitacora[this.bd.cuantosRegistros(cdr)];
                Bitacora aux;
                int i=0;
                cdr.beforeFirst();
                while(cdr.next())
                {
                    aux=new Bitacora();
                    aux.setClienteNumero(cdr.getString("cliente_numero"));
                    aux.setEntrada(cdr.getString("entrada"));
                    aux.setFecha(Auxiliares.formatearFecha(cdr.getString("fecha")));
                    aux.setHora(cdr.getString("hora"));
                    lista[i++]=aux;
                }
                return lista;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        public Bitacora[] obtenerBitacoras(Cliente u)
        {
             Bitacora[] lista = null;
            
            String query="select * from bitacora where cliente_numero='"+u.getNumero()+"'";
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                lista = new Bitacora[this.bd.cuantosRegistros(cdr)];
                Bitacora aux;
                int i=0;
                cdr.beforeFirst();
                while(cdr.next())
                {
                    aux=new Bitacora();
                    aux.setClienteNumero(cdr.getString("cliente_numero"));
                    aux.setEntrada(cdr.getString("entrada"));
                    aux.setFecha(Auxiliares.formatearFecha(cdr.getString("fecha")));
                    aux.setHora(cdr.getString("hora"));
                    lista[i++]=aux;
                }
                return lista;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
        public Cliente[] obtenerUsuariosCliente() 
        { 
            try {
                String query="select numero from cliente";
                ResultSet cdr = this.bd.obtenerSelect(query);
                
                int cuantos=this.bd.cuantosRegistros(cdr);
                Cliente todos[] = new Cliente[cuantos], actual;
                int i=0;
                cdr.beforeFirst();
                while(cdr.next())
                {
                    actual = this.obtenerUsuarioCliente(cdr.getString("numero"));
                    todos[i++] = actual;
                }
               
             return todos;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
        public String obtenerTipoPersonal(Personal u)
        {
            String query="select tipo from tipopersonal where id="+u.getTipopersonal();
            try 
            {
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr.first())
                    return cdr.getString(1);
                else 
                    return null;
            } 
            catch (SQLException ex) 
            {
                return null;
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public String generarNuevoNumero(String tabla)
        {
        int n;
        String w;
        do
        {
            w="";
		for(int i=0; i<8 ;i++)
		{
                    n=Integer.parseInt(((Math.random()*10)+"").charAt(0)+"");	
                    w+=n;
		}
        }while(existeNumero(tabla, w));
        
        return w;
    }

        private boolean existeNumero(String tabla, String generado) 
        {
            try 
            {
                String query ="select * from "+tabla+" where numero='"+generado+"'";
                ResultSet cdr = this.bd.obtenerSelect(query);
                if(cdr.first() && cdr.getString("numero").equals(generado))
                    return true;
                else
                    return false;
            } 
            catch (SQLException ex) {
                //Logger.getLogger(ManejadorUsuariosBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;

    }
    
        

   /* public List<Producto> menu () throws SQLException{
        List<Producto> productos = new ArrayList<Producto>();
        ResultSet cdr =null;
        try{
            cdr=bd.conexion().prepareStatement("")
        }
        
    }*/

  
}   


