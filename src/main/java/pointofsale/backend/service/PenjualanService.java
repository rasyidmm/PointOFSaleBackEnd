package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.PenjualanDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.PenjualanModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class PenjualanService implements PenjualanDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<PenjualanModel> getAllPenjualan() {
        List<PenjualanModel> pk= new ArrayList<>();
        repositoryFac.getPenjualanRepository().findAll().forEach(pk::add);
        return pk;
    }

    @Override
    public PenjualanModel getPenjualanById(Long id) {
        PenjualanModel pm = repositoryFac.getPenjualanRepository().findById(id).get();
        return pm;
    }

    @Override
    public void SaveOrUpdatePenjualan(PenjualanModel a) {
        repositoryFac.getPenjualanRepository().save(a);
    }

    @Override
    public void UpdatePenjualan(PenjualanModel a) {
        repositoryFac.getPenjualanRepository().save(a);
    }

    @Override
    public void deletePenjualanById(Long id) {
        repositoryFac.getPenjualanRepository().deleteById(id);
    }

    @Override
    public void deletePenjualan(PenjualanModel a) {
        repositoryFac.getPenjualanRepository().save(a);

    }
}
