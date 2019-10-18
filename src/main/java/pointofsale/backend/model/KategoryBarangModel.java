package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class KategoryBarangModel extends Additional implements Serializable {


    private String namaKatagory;

    public String getNamaKatagory() {
        return namaKatagory;
    }

    public void setNamaKatagory(String namaKatagory) {
        this.namaKatagory = namaKatagory;
    }


}