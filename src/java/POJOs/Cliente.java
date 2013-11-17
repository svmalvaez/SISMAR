package POJOs;

import java.util.Date;
/**
 *
 * @author Luis
 */
public class Cliente  implements java.io.Serializable {


     private String numero;
     private String nombre;
     private String paterno;
     private String materno;
     private Date fechaRegistro;
     private String correo;
     private String direccion;
     private String telefono;
     private String numTarjeta;
     private String codSegTarjeta;
     private String tipoTarjeta;
     private String password;


    public Cliente() {}

    public Cliente(String numero, String nombre, String paterno, String materno, Date fechaRegistro, String correo, String direccion, String telefono, String numTarjeta, String codSegTarjeta, String tipoTarjeta, String password) {
        this.numero = numero;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaRegistro = fechaRegistro;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numTarjeta = numTarjeta;
        this.codSegTarjeta = codSegTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getCodSegTarjeta() {
        return codSegTarjeta;
    }

    public void setCodSegTarjeta(String codSegTarjeta) {
        this.codSegTarjeta = codSegTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
}


