package POJOs;
/**
 *
 * @author Luis
 */
public class Item  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String descripcion;
     private double costo;
     private Integer tipoItemId;
     
    public Item() {}

    public Item(Integer id, String nombre, String descripcion, double costo, Integer tipoItemId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.tipoItemId = tipoItemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Integer getTipoItemId() {
        return tipoItemId;
    }

    public void setTipoItemId(Integer tipoItemId) {
        this.tipoItemId = tipoItemId;
    }


   
}