package pointofsale.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class PenjualanModel extends Additional implements Serializable {
    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private
    List<DiskonModel> diskonModel;
    @ManyToMany
    private
    List<BarangModel> barangModels;
    @ManyToOne
    private
    MemberModel memberModel;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        PenjualanModel.serialVersionUID = serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
