package POJOs;

import java.util.Date;
/**
 *
 * @author Luis
 */
public class Comanda  implements java.io.Serializable {


     private Integer id;
     private String horaSolicitud;
     private String horaEntrega;
     private Date fecha;
     private Integer cuentaId;
     private Integer itemId;
     private String anotaciones;

    public Comanda() {}

    public Comanda(Integer id, String horaSolicitud, String horaEntrega, Date fecha, Integer cuentaId, Integer itemId, String anotaciones) {
        this.id = id;
        this.horaSolicitud = horaSolicitud;
        this.horaEntrega = horaEntrega;
        this.fecha = fecha;
        this.cuentaId = cuentaId;
        this.itemId = itemId;
        this.anotaciones = anotaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraSolicitud() {
        return horaSolicitud;
    }

    public void setHoraSolicitud(String horaSolicitud) {
        this.horaSolicitud = horaSolicitud;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
    
    
    
}


