package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class DiskonModel extends Additional implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String besaranDiskon;
    @ManyToOne
    private
    BarangModel barangModel;
    @ManyToOne
    private
    KategoryBarangModel kategoryBarangModel;
    @ManyToOne
    private
    ProdusenBarangModel produsenBarangModel;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        DiskonModel.serialVersionUID = serialVersionUID;
    }


    public String getBesaranDiskon() {
        return besaranDiskon;
    }

    public void setBesaranDiskon(String besaranDiskon) {
        this.besaranDiskon = besaranDiskon;
    }

    public BarangModel getBarangModel() {
        return barangModel;
    }

    public void setBarangModel(BarangModel barangModel) {
        this.barangModel = barangModel;
    }

    public KategoryBarangModel getKategoryBarangModel() {
        return kategoryBarangModel;
    }

    public void setKategoryBarangModel(KategoryBarangModel kategoryBarangModel) {
        this.kategoryBarangModel = kategoryBarangModel;
    }

    public ProdusenBarangModel getProdusenBarangModel() {
        return produsenBarangModel;
    }

    public void setProdusenBarangModel(ProdusenBarangModel produsenBarangModel) {
        this.produsenBarangModel = produsenBarangModel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}