package pointofsale.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class BarangModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String NamaBarang;
    private String hargaBarang;
    private String BiayaBarang;
    private String SKU;
    @JsonIgnoreProperties
    @ManyToOne
    private
    KategoryBarangModel kategoryBarangModel;
    @JsonIgnoreProperties
    @ManyToOne
    private
    ProdusenBarangModel produsenBarangModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        BarangModel.serialVersionUID = serialVersionUID;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}