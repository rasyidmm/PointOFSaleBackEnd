package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.DiskonDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.DiskonModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class DiskonService implements DiskonDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<DiskonModel> getAllDiskon() {
        List<DiskonModel> dl = new ArrayList<>();
        repositoryFac.getDiskonRepository().findAll().forEach(dl::add);
        return dl;

    }

    @Override
    public DiskonModel getDiskonById(Long id) {
        DiskonModel dm = repositoryFac.getDiskonRepository().findById(id).get();
        return dm;
    }

    @Override
    public void SaveOrUpdateDiskon(DiskonModel a) {
        repositoryFac.getDiskonRepository().save(a);

    }

    @Override
    public void UpdateDiskon(DiskonModel a) {
        repositoryFac.getDiskonRepository().save(a);
    }

    @Override
    public void deleteDiskonById(Long id) {
        repositoryFac.getDiskonRepository().deleteById(id);
    }

    @Override
    public void deleteDiskon(DiskonModel a) {
        repositoryFac.getDiskonRepository().delete(a);

    }
}
