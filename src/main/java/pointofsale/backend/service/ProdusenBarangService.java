package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.ProdusenBarangDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.ProdusenBarangModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProdusenBarangService implements ProdusenBarangDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<ProdusenBarangModel> getAllProdusenBarang() {
        List<ProdusenBarangModel> pbl = new ArrayList<>();
        repositoryFac.getProdusenBarangRepository().findAll().forEach(pbl::add);
        return pbl;
    }

    @Override
    public ProdusenBarangModel getProdusenBarangById(Long id) {
        ProdusenBarangModel pb = repositoryFac.getProdusenBarangRepository().findById(id).get();
        return  pb;
    }

    @Override
    public void SaveOrUpdateProdusenBarang(ProdusenBarangModel a) {
        repositoryFac.getProdusenBarangRepository().save(a);

    }

    @Override
    public void UpdateProdusenBarangMandiri(ProdusenBarangModel a) {
        repositoryFac.getProdusenBarangRepository().save(a);
    }

    @Override
    public void deleteProdusenBarangById(Long id) {
        repositoryFac.getProdusenBarangRepository().deleteById(id);
    }

    @Override
    public void deleteProdusenBarang(ProdusenBarangModel a) {
        repositoryFac.getProdusenBarangRepository().delete(a);
    }
}
