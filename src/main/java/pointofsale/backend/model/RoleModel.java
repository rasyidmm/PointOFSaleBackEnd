package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RoleModel implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @ManyToMany
    MenuModel menuModel;
}