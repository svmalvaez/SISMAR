package POJOs;
/**
 *
 * @author Luis
 */
public class Tipopersonal  implements java.io.Serializable {


     private Integer id;
     private String tipo;
     private String funciones;

    public Tipopersonal() {}

    public Tipopersonal(Integer id, String tipo, String funciones) {
        this.id = id;
        this.tipo = tipo;
        this.funciones = funciones;
    }


   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getFunciones() {
        return this.funciones;
    }
    
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

}


