package POJOs;
/**
 *
 * @author Luis
 */
public class Negocio  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String direccion;
     private String telefono;
     private String cuentaBancaria;
     private String rfc;

    public Negocio() {
    }

    public Negocio(Integer id, String nombre, String direccion, String telefono, String cuentaBancaria, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.rfc = rfc;
    }

    
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCuentaBancaria() {
        return this.cuentaBancaria;
    }
    
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }




}


