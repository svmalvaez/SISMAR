/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

/**
 *
 * @author Luis
 */
public class Tipoitem implements java.io.Serializable{
    
    private Integer id;
    private String tipo;

    public Tipoitem(){
        
    }
    
    public Tipoitem(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
