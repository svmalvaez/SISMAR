    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

/**
 *
 * @author Luis
 */
public class Mesa implements java.io.Serializable{

    private Integer id;
    private String estado;
    private Integer personas;
    private String comentarios;
    private String descripcion;
    private String nombre;
    private String personalNumero; //numero de empleado que corresponda a un mesero
    
 
    public Mesa(){}

    public Mesa(Integer id, String estado, Integer personas, String comentarios, String descripcion, String personalNumero, String nombre) {
        this.id = id;
        this.estado = estado;
        this.personas = personas;
        this.comentarios = comentarios;
        this.descripcion = descripcion;
        this.personalNumero = personalNumero;
        this.nombre=nombre;
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
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonalNumero() {
        return personalNumero;
    }

    public void setPersonalNumero(String personalNumero) {
        this.personalNumero = personalNumero;
    }
    
    
    
}
