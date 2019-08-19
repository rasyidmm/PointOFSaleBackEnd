package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.RoleDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.RoleModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoleService implements RoleDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<RoleModel> getAllRole() {
        List<RoleModel>rl = new ArrayList<>();
        repositoryFac.getRoleRepository().findAll().forEach(rl::add);
        return rl;
    }

    @Override
    public RoleModel getRoleById(Long id){
        RoleModel r = repositoryFac.getRoleRepository().findById(id).get();
        return r;
    }

    @Override
    public void SaveOrUpdateRole(RoleModel a) {
        repositoryFac.getRoleRepository().save(a);

    }

    @Override
    public void UpdateRole(RoleModel a) {
        repositoryFac.getRoleRepository().save(a);
    }

    @Override
    public void deleteRoleById(Long id) {
        repositoryFac.getRoleRepository().deleteById(id);
    }

    @Override
    public void deleteRole(RoleModel a) {
        repositoryFac.getRoleRepository().delete(a);
    }
}
