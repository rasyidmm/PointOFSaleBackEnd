package pointofsale.backend.dao;

import pointofsale.backend.model.PenjualanModel;

import java.util.List;

public interface PenjualanDao {
    public List<PenjualanModel> getAllPenjualan();

    public PenjualanModel getPenjualanById(Long id);

    public void SaveOrUpdatePenjualan(PenjualanModel a);

    public void UpdatePenjualan(PenjualanModel a);

    public void deletePenjualanById(Long id);

    public void deletePenjualan(PenjualanModel a);
}

