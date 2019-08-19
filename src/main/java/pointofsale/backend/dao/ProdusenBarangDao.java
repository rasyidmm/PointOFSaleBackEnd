package pointofsale.backend.dao;

import pointofsale.backend.model.ProdusenBarangModel;

import java.util.List;

public interface ProdusenBarangDao {
    public List<ProdusenBarangModel> getAllProdusenBarang();

    public ProdusenBarangModel getProdusenBarangById(Long id);

    public void SaveOrUpdateProdusenBarang(ProdusenBarangModel a);

    public void UpdateProdusenBarangMandiri(ProdusenBarangModel a);

    public void deleteProdusenBarangById(Long id);

    public void deleteProdusenBarang(ProdusenBarangModel a);
}

