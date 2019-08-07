package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class MasukModel implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @OneToOne
    MemberModel memberModel;
}