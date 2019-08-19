package pointofsale.backend.dao;

import pointofsale.backend.model.KeuanganModel;

import java.util.List;

public interface KeuanganDao {
    public List<KeuanganModel> getAllKeuangan();

    public KeuanganModel getKeuanganById(Long id);

    public void SaveOrUpdateKeuangan(KeuanganModel a);

    public void UpdateKeuangan(KeuanganModel a);

    public void deleteKeuanganById(Long id);

    public void deleteKeuangan(KeuanganModel a);
}

