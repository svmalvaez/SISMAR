package POJOs;
/**
 *
 * @author Luis
 */
public class Itemsbase  implements java.io.Serializable {


     private Integer id;
     private int cantidad;
     private Integer promocionId;
     private Integer itemId;
     

    public Itemsbase() {}

    public Itemsbase(Integer id, int cantidad, Integer promocionId, Integer itemId) {
        this.id = id;
        this.cantidad = cantidad;
        this.promocionId = promocionId;
        this.itemId = itemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPromocionId() {
        return promocionId;
    }

    public void setPromocionId(Integer promocionId) {
        this.promocionId = promocionId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    

   
}


