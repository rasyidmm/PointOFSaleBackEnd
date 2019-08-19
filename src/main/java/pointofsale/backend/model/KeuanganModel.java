package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class KeuanganModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private
    PenjualanModel penjualanModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        KeuanganModel.serialVersionUID = serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PenjualanModel getPenjualanModel() {
        return penjualanModel;
    }

    public void setPenjualanModel(PenjualanModel penjualanModel) {
        this.penjualanModel = penjualanModel;
    }
}
