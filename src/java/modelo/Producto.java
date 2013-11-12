/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Sergio
 */
public class Producto implements Serializable {
    
   private int id;
   private String nombre;
   private String descripcion;
   private float costo;
   private int tipo;

    public int getId() {
        return id;
    }

    public float getCosto() {
        return costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
   
   
   
   
}
