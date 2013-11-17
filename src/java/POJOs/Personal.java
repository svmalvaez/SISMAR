package POJOs;
/**
 *
 * @author Luis
 */

import java.util.Date;


public class Personal  implements java.io.Serializable {


     private String numero;
     private Integer tipopersonal;
     private String nombre;
     private String paterno;
     private String materno;
     private String estatus;
     private String correo;
     private Date fechaAlta;
     private String curp;
     private String direccion;
     private String telefono;
     private Date fechaBaja;
     private String comentarios;
     private String password;

    public Personal() {}

    public Personal(String numero, Integer tipopersonal, String nombre, String paterno, String materno, String estatus, String correo, Date fechaAlta, String curp, String direccion, String telefono, Date fechaBaja, String comentarios, String password) {
        this.numero = numero;
        this.tipopersonal = tipopersonal;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.estatus = estatus;
        this.correo = correo;
        this.fechaAlta = fechaAlta;
        this.curp = curp;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaBaja = fechaBaja;
        this.comentarios = comentarios;
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getTipopersonal() {
        return tipopersonal;
    }

    public void setTipopersonal(Integer tipopersonal) {
        this.tipopersonal = tipopersonal;
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

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
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

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}


