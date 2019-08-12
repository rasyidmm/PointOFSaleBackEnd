package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class BarangModel implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    String NamaBarang;
    String hargaBarang;
    @ManyToOne
    KategoryBarangModel kategoryBarangModel;
    @ManyToOne
    ProdusenBarangModel produsenBarangModel;

}