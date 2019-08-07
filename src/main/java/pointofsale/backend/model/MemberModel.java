package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MemberModel implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @ManyToOne
    RoleModel roleModel;
}
