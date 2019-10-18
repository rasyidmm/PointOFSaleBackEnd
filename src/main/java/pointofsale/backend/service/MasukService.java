package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.MasukDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.MasukModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class MasukService implements MasukDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<MasukModel> getAllMasuk() {
        List<MasukModel>mml =  new ArrayList<>();
        repositoryFac.getMasukRepository().findAll().forEach(mml::add);
        return mml;
    }

    @Override
    public MasukModel getBarangById(Long id) {

        MasukModel mml =  repositoryFac.getMasukRepository().findById(id).get();
        return mml;
    }

    @Override
    public void SaveOrUpdateMasuk(MasukModel a) {
        repositoryFac.getMasukRepository().save(a);
    }

    @Override
    public void UpdateMasuk(MasukModel a) {
        repositoryFac.getMasukRepository().save(a);
    }

    @Override
    public void deleteMasukById(Long id) {
        repositoryFac.getMasukRepository().deleteById(id);
    }

    @Override
    public void deleteMasuk(MasukModel a) {
        repositoryFac.getMasukRepository().delete(a);

    }

    @Override
    public MasukModel findByEmail(String email) {
        return repositoryFac.getMasukRepository().findByEmail(email);
    }

    @Override
    public MasukModel findByLogin(String email, String passowrd) {
        return repositoryFac.getMasukRepository().findByEmailAndPassword(email,passowrd);
    }
}
