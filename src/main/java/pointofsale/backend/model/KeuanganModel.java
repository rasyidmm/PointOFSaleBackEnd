package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class KeuanganModel extends Additional implements Serializable {

    @ManyToOne
    private
    PenjualanModel penjualanModel;


    public PenjualanModel getPenjualanModel() {
        return penjualanModel;
    }

    public void setPenjualanModel(PenjualanModel penjualanModel) {
        this.penjualanModel = penjualanModel;
    }
}
