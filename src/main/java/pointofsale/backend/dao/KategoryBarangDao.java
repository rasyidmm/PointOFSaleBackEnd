package pointofsale.backend.dao;

import pointofsale.backend.model.KategoryBarangModel;

import java.util.List;

public interface KategoryBarangDao {
    public List<KategoryBarangModel> getAllKategoryBarang();

    public KategoryBarangModel getKategoryBarangById(Long id);

    public void SaveOrUpdateKategoryBarang(KategoryBarangModel a);

    public void UpdateKategoryBarang(KategoryBarangModel a);

    public void deleteKategoryBarangById(Long id);

    public void deleteKategoryBarang(KategoryBarangModel a);

}
