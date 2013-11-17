/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Cuenta implements java.io.Serializable{

    private Integer id;
    private Date fecha;
    private String comentarios;
    private double total;
    private String formaPago;
    private String clienteNumero;
    private Integer mesaId;
    private String hora;
    private String estado;

   public Cuenta(){}

    public Cuenta(Integer id, Date fecha, String comentarios, double total, String formaPago, String clienteNumero, Integer mesaId, String hora, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.comentarios = comentarios;
        this.total = total;
        this.formaPago = formaPago;
        this.clienteNumero = clienteNumero;
        this.mesaId = mesaId;
        this.hora = hora;
        this.estado=estado;
    }

   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getClienteNumero() {
        return clienteNumero;
    }

    public void setClienteNumero(String clienteNumero) {
        this.clienteNumero = clienteNumero;
    }

    public Integer getMesaId() {
        return mesaId;
    }

    public void setMesaId(Integer mesaId) {
        this.mesaId = mesaId;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   
   
}
