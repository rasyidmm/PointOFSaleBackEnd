package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.KeuanganDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.KeuanganModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class KeuanganService implements KeuanganDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<KeuanganModel> getAllKeuangan() {
        List<KeuanganModel> kml =  new ArrayList<>();
        repositoryFac.getKeuanganRepository().findAll().forEach(kml::add);
        return kml;
            }

    @Override
    public KeuanganModel getKeuanganById(Long id) {

        KeuanganModel km = repositoryFac.getKeuanganRepository().findById(id).get();
        return km;
    }

    @Override
    public void SaveOrUpdateKeuangan(KeuanganModel a) {
        repositoryFac.getKeuanganRepository().save(a);

    }

    @Override
    public void UpdateKeuangan(KeuanganModel a) {
        repositoryFac.getKeuanganRepository().save(a);
    }

    @Override
    public void deleteKeuanganById(Long id) {
        repositoryFac.getKeuanganRepository().deleteById(id);

    }

    @Override
    public void deleteKeuangan(KeuanganModel a) {
        repositoryFac.getKeuanganRepository().delete(a);

    }
}
