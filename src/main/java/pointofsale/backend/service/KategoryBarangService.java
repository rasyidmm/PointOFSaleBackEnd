package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.KategoryBarangDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.KategoryBarangModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class KategoryBarangService implements KategoryBarangDao {
    @Autowired
    RepositoryFac repositoryFac;
    @Override
    public List<KategoryBarangModel> getAllKategoryBarang() {
        List<KategoryBarangModel> kl = new ArrayList<>();
        repositoryFac.getKategoryBarangRepository().findAll().forEach(kl::add);
        return kl;
    }

    @Override
    public KategoryBarangModel getKategoryBarangById(Long id) {
       KategoryBarangModel kb = repositoryFac.getKategoryBarangRepository().findById(id).get();
       return kb;
    }

    @Override
    public void SaveOrUpdateKategoryBarang(KategoryBarangModel a) {
        repositoryFac.getKategoryBarangRepository().save(a);
    }

    @Override
    public void UpdateKategoryBarang(KategoryBarangModel a) {
        repositoryFac.getKategoryBarangRepository().save(a);
    }

    @Override
    public void deleteKategoryBarangById(Long id) {
        repositoryFac.getKategoryBarangRepository().deleteById(id);

    }

    @Override
    public void deleteKategoryBarang(KategoryBarangModel a) {
        repositoryFac.getKategoryBarangRepository().delete(a);
    }
}
