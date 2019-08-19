package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class KategoryBarangModel extends Additional implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String namaKatagory;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        KategoryBarangModel.serialVersionUID = serialVersionUID;
    }


    public String getNamaKatagory() {
        return namaKatagory;
    }

    public void setNamaKatagory(String namaKatagory) {
        this.namaKatagory = namaKatagory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}