package POJOs;

import java.util.Date;
/**
 *
 * @author Luis
 */
public class Notas  implements java.io.Serializable {


     private Integer id;
     private String personalNumero;
     private String entrada;
     private Date fecha;
     private String hora;

    public Notas() {}

    public Notas(Integer id, String personalNumero, String entrada, Date fecha, String hora) {
        this.id = id;
        this.personalNumero = personalNumero;
        this.entrada = entrada;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonalNumero() {
        return personalNumero;
    }

    public void setPersonalNumero(String personalNumero) {
        this.personalNumero = personalNumero;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}

   


