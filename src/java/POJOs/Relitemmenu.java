package POJOs;
/**
 *
 * @author Luis
 */
public class Relitemmenu  implements java.io.Serializable {


     private Integer id;
     private Integer menuId;
     private Integer itemId;

    public Relitemmenu() {}

    public Relitemmenu(Integer id, Integer menuId, Integer itemId) {
        this.id = id;
        this.menuId = menuId;
        this.itemId = itemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    
    

}


