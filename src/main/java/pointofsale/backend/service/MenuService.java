package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.MenuDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.MenuModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class MenuService implements MenuDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<MenuModel> getAllMenu() {
        List<MenuModel> mll = new ArrayList<>();
        repositoryFac.getMenuRepository().findAll().forEach(mll::add);
        return mll;
    }

    @Override
    public MenuModel getMenuById(Long id) {
        MenuModel mm = repositoryFac.getMenuRepository().findById(id).get();
        return mm;
    }

    @Override
    public void SaveOrUpdateMenu(MenuModel a) {
        repositoryFac.getMenuRepository().save(a);
    }

    @Override
    public void UpdateMenu(MenuModel a) {
        repositoryFac.getMenuRepository().save(a);
    }

    @Override
    public void deleteMenuById(Long id) {
        repositoryFac.getMenuRepository().deleteById(id);

    }

    @Override
    public void deleteMenu(MenuModel a) {
        repositoryFac.getMenuRepository().delete(a);
    }
}
