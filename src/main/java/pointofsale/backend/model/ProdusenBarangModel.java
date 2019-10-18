package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ProdusenBarangModel extends Additional implements Serializable {


    private String namaProdusen;

    public String getNamaProdusen() {
        return namaProdusen;
    }

    public void setNamaProdusen(String namaProdusen) {
        this.namaProdusen = namaProdusen;
    }


}
