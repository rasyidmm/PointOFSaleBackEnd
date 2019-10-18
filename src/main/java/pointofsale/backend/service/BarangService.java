package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.BarangDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.BarangModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class BarangService implements BarangDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<BarangModel> getAllBarang()  {

        List<BarangModel> bl = new ArrayList<>();
        repositoryFac.getBarangRepository().findAll().forEach(bl::add);
        return bl;
    }

    @Override
    public BarangModel getBarangById(Long id) {

        BarangModel bm = repositoryFac.getBarangRepository().findById(id).get();
        return bm;
    }

    @Override
    public void SaveOrUpdateBarang(BarangModel a) {
      repositoryFac.getBarangRepository().save(a);
    }

    @Override
    public void UpdateBarang(BarangModel a) {
        repositoryFac.getBarangRepository().save(a);
    }

    @Override
    public void deleteBarangById(Long id) {
        repositoryFac.getBarangRepository().deleteById(id);
    }

    @Override
    public void deleteBarang(BarangModel a) {
        repositoryFac.getBarangRepository().delete(a);
    }

    @Override
    public List<BarangModel> getBarangByStatus(String Status) {
        return repositoryFac.getBarangRepository().getAllByStatus(Status);

    }

    @Override
    public List<BarangModel> getBarangByKategory(Long id) {
        return repositoryFac.getBarangRepository().getAllByKategoryBarangModelOrderById(id);
    }

    @Override
    public List<BarangModel> getBarangByProdusen(Long id) {
        return repositoryFac.getBarangRepository().getAllByProdusenBarangModelId(id);
    }

    @Override
    public List<BarangModel> ExisId(Long id) {
        return repositoryFac.getBarangRepository().getById(id);
    }
}
