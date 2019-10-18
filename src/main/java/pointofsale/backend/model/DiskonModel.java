package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DiskonModel extends Additional implements Serializable {


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

}