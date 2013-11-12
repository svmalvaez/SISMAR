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
	
}
