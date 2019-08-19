package pointofsale.backend.dto;

public class TambahBarangDTO {

    private String NamaBarang;
    private String hargaBarang;
    private String BiayaBarang;
    private String SKU;
    private Long kategoryBarangModel;
    private Long produsenBarangModel;



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


    public Long getKategoryBarangModel() {
        return kategoryBarangModel;
    }

    public void setKategoryBarangModel(Long kategoryBarangModel) {
        this.kategoryBarangModel = kategoryBarangModel;
    }

    public Long getProdusenBarangModel() {
        return produsenBarangModel;
    }

    public void setProdusenBarangModel(Long produsenBarangModel) {
        this.produsenBarangModel = produsenBarangModel;
    }
}
