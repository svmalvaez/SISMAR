package POJOs;

import java.util.Date;
/**
 *
 * @author Luis
 */
public class Promocion  implements java.io.Serializable {


     private String id;
     private String naturalezaDescuento;
     private String tipoDescuento;
     private long descuento;
     private String descripcion;
     private Date fechaAlta;
     private Date fechaBaja;
    
    public Promocion() {
    }

    public Promocion(String id, String naturalezaDescuento, String tipoDescuento, long descuento, String descripcion, Date fechaAlta, Date fechaBaja) {
        this.id = id;
        this.naturalezaDescuento = naturalezaDescuento;
        this.tipoDescuento = tipoDescuento;
        this.descuento = descuento;
        this.descripcion = descripcion;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }


   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getNaturalezaDescuento() {
        return this.naturalezaDescuento;
    }
    
    public void setNaturalezaDescuento(String naturalezaDescuento) {
        this.naturalezaDescuento = naturalezaDescuento;
    }
    public String getTipoDescuento() {
        return this.tipoDescuento;
    }
    
    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
    public long getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(long descuento) {
        this.descuento = descuento;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

}


