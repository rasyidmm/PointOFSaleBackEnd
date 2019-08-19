package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class RoleModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @ManyToMany
    private
    List <MenuModel> menuModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        RoleModel.serialVersionUID = serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MenuModel> getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(List<MenuModel> menuModel) {
        this.menuModel = menuModel;
    }
}