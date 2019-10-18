package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class RoleModel extends Additional implements Serializable {

    @ManyToMany
    private
    List <MenuModel> menuModel;


    public List<MenuModel> getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(List<MenuModel> menuModel) {
        this.menuModel = menuModel;
    }
}