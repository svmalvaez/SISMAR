/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOjdbc {
	
    private Connection conexion;
    private Statement sentenciaSQL;

        public DAOjdbc()throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
        {		
            try{
            		Class.forName("com.mysql.jdbc.Driver").newInstance();
            		
            	}
            catch(Exception e)
            {
            	System.out.println("No se pudo cargar el puente!"+e.getMessage());
            }
        }
    
        public void conectar(String usuario, String contraseña, String bd)throws SQLException
        {
        	String URL_bd = "jdbc:mysql://127.0.0.1:3306/"+bd;
        	conexion = DriverManager.getConnection(URL_bd,usuario,contraseña);
        	sentenciaSQL = conexion.createStatement(  ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );	
        }

        public void cerrarConexion()throws SQLException
        {
        	if(sentenciaSQL != null) sentenciaSQL.close();
        	if(conexion != null) conexion.close();
        }

        public ResultSet obtenerTabla(String tabla)throws SQLException
        {
        	return sentenciaSQL.executeQuery("SELECT * FROM "+tabla);
        }
 
        public ResultSet obtenerSelect(String query)throws SQLException
        {
        	return sentenciaSQL.executeQuery(query);
        }

        public int cuantosRegistros(String tabla)
        {     
        int n=0;
            try {
                    ResultSet cdr = obtenerSelect("SELECT * FROM "+tabla);
                    n=nReenglones(cdr);
            } 
            catch (SQLException ex) 
            { }
        
       return n;     
    }

        public int nReenglones(ResultSet r)
        {
            ResultSet t = r;
            int i=0;          
            try 
            {  
            	while(t.next())i++;
            	t.beforeFirst();          
            	return i;            
            } 
            catch (SQLException ex) 
            {}
            return 0;
        }

        public String[] obtenerTablas()throws SQLException
        {
        	ResultSet cdr = sentenciaSQL.executeQuery("SHOW TABLES");
        	cdr.last();  
        	String t[] = new String[cdr.getRow()];
        	cdr.beforeFirst();
        	int i=0;
        	
        	while(cdr.next())
        		t[i++] = cdr.getString(1);
		
		return t;
        }
                    
        public Object[][] obtenerMatriz(ResultSet t)
        {
         Object objeto[][] = null;
            try {
                     
                        int c =0, col = t.getMetaData().getColumnCount();
                        objeto = new Object[nReenglones(t)][col];
            
                        t.beforeFirst();
                        while(t.next())
                        {
                            for(int i = 1; i<=col ; i++)
                            objeto[c][i-1]=t.getString(i);
                            c++;   
                        }
            
                }catch (SQLException ex) {Logger.getLogger(DAOjdbc.class.getName()).log(Level.SEVERE, null, ex);}
           
            return objeto; 
            
        }
               
        public String[] obtenerEncabezados(ResultSet t) throws SQLException
        { 
            int col = t.getMetaData().getColumnCount();   
            String[] cadenas = new String[col]; 
            ResultSetMetaData titulos = t.getMetaData();
            
            for (int i =1; i<=col ; i++)
             cadenas[i-1]= titulos.getColumnName(i);
            
          return cadenas;
        }
        
        public void ejecutarUpdate(String query) throws SQLException
        {
            sentenciaSQL.executeUpdate(query);
        }
        
        public boolean hayConexion()
        {
        	try 
        	{
				if(this.conexion.isClosed())
					return false;
				
			} catch (SQLException e) 
			{
				return false;
			}
        	return true;
        }
        
        public int generarID(String tabla, int col) throws SQLException // col es la columna en donde se encuentra la PK
        {
        
        Object[][] o = obtenerMatriz(obtenerTabla(tabla));
        
        int mayor = 0 , actual = 0; 
        
        for(int i = 0 ; i< o.length ; i++)
        {   
            actual = Integer.parseInt(o[i][col].toString());
            if(actual > mayor ) 
                mayor = actual;
        }                   
          mayor++; 
          
        return mayor;
    }

        public Connection conexion()
        {
        	return this.conexion;
        }
        
        public void renobarStatement()
        {
        	try 
        	{
				sentenciaSQL =  this.conexion.createStatement(  ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
			} 
        	catch (SQLException e) 
			{
				System.out.println("No se pudo renovar el objeto Statement");
				e.printStackTrace();
			}
        }
        
        public int cuantosRegistros(ResultSet c)
        {
            int i=0;
            ResultSet cdr=c;
        try 
        {
            cdr.beforeFirst();
            
            while(cdr.next())
                i++;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(DAOjdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
            return i;
        }
}
