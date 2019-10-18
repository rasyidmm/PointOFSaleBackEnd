package pointofsale.backend.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class PenjualanModel extends Additional implements Serializable {
    @ManyToMany
    private
    List<DiskonModel> diskonModel;
    @ManyToMany
    private
    List<BarangModel> barangModels;
    @ManyToOne
    private
    MemberModel memberModel;

    public List<DiskonModel> getDiskonModel() {
        return diskonModel;
    }

    public void setDiskonModel(List<DiskonModel> diskonModel) {
        this.diskonModel = diskonModel;
    }

    public List<BarangModel> getBarangModels() {
        return barangModels;
    }

    public void setBarangModels(List<BarangModel> barangModels) {
        this.barangModels = barangModels;
    }

    public MemberModel getMemberModel() {
        return memberModel;
    }

    public void setMemberModel(MemberModel memberModel) {
        this.memberModel = memberModel;
    }
}
