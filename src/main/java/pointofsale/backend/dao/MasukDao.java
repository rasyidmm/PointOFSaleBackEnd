package pointofsale.backend.dao;

import pointofsale.backend.model.MasukModel;

import java.util.List;

public interface MasukDao {
    public List<MasukModel> getAllMasuk();

    public MasukModel getBarangById(Long id);

    public void SaveOrUpdateMasuk(MasukModel a);

    public void UpdateMasuk(MasukModel a);

    public void deleteMasukById(Long id);

    public void deleteMasuk(MasukModel a);

}
