package pointofsale.backend.dao;

import pointofsale.backend.model.BarangModel;

import java.util.List;

public interface BarangDao {
    public List<BarangModel> getAllBarang();

    public BarangModel getBarangById(Long id);

    public void SaveOrUpdateBarang(BarangModel a);

    public void UpdateBarang(BarangModel a);

    public void deleteBarangById(Long id);

    public void deleteBarang(BarangModel a);

    public List<BarangModel> getBarangByStatus(String Status);

    public List<BarangModel> getBarangByKategory(Long id);

    public List<BarangModel> getBarangByProdusen(Long id);

}
