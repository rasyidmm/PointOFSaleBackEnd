package pointofsale.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BarangModel extends Additional implements Serializable {

    private String NamaBarang;
    private String hargaBarang;
    private String BiayaBarang;
    private String SKU;
    private String fotoBarang;
    @JsonIgnoreProperties
    @ManyToOne
    private
    KategoryBarangModel kategoryBarangModel;
    @JsonIgnoreProperties
    @ManyToOne
    private
    ProdusenBarangModel produsenBarangModel;
    public String getFotoBarang() {
        return fotoBarang;
    }

    public void setFotoBarang(String fotoBarang) {
        this.fotoBarang = fotoBarang;
    }



    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getBiayaBarang() {
        return BiayaBarang;
    }

    public void setBiayaBarang(String biayaBarang) {
        BiayaBarang = biayaBarang;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
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