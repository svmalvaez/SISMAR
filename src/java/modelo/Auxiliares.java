/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis
 */
import java.util.Calendar;
import java.util.Date;

public class Auxiliares {

    public static String horaActual()
    {
            String hora = "";
            Calendar t = Calendar.getInstance();
            hora += t.get(Calendar.HOUR_OF_DAY)+":"+t.get(Calendar.MINUTE)+":"+t.get(Calendar.SECOND);
            return hora; 
        }
    
    public static String fechaActual()
    {
        String fecha = "", año, mes, día;
        Calendar t = Calendar.getInstance();
        año = t.get(Calendar.YEAR)+"";
        mes = (t.get(Calendar.MONTH)+1)+"";
        día = t.get(Calendar.DATE)+"";
        fecha += año+"-"+mes+"-"+día;
        return fecha;
    }

    public static String formatearFecha(Date fecha)
    {
        String formatoAMD="";
        formatoAMD+=fecha.getYear()+"-"+fecha.getMonth()+"-"+fecha.getDate();
        return formatoAMD;
    }
    
    public static Date formatearFecha(String amd)
    {
        Date r = new Date();
        
        String a="";
        String m="";
        String d="";
        
        int w = amd.length();
        
        int guiones = 0;
        
        for(int i=0 ; i<w ; i++)
        {
            if(amd.charAt(i)=='-')
                guiones++;
            
            if(guiones==0 && amd.charAt(i)!='-')
                a+=amd.charAt(i);
            else if(guiones==1 && amd.charAt(i)!='-')
                m+=amd.charAt(i);
            else if(guiones==2 && amd.charAt(i)!='-')
                d+=amd.charAt(i);
            else if(guiones>2 && guiones<0)
                return new Date(0,0,0); 
        }
        
        try
        {
            r.setDate(Integer.parseInt(d));
            r.setMonth(Integer.parseInt(m));
            r.setYear(Integer.parseInt(a));
            return r;
        }
        catch(Exception e)
        {
           return new Date(0,0,0);  
        }
        
    }
    
    
}
