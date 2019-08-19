package pointofsale.backend.dao;

import pointofsale.backend.model.RoleModel;

import java.util.List;

public interface RoleDao {
    public List<RoleModel> getAllRole();

    public RoleModel getRoleById(Long id);

    public void SaveOrUpdateRole(RoleModel a);

    public void UpdateRole(RoleModel a);

    public void deleteRoleById(Long id);

    public void deleteRole(RoleModel a);
}

