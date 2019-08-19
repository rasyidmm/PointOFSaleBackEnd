package pointofsale.backend.dao;

import pointofsale.backend.model.MenuModel;

import java.util.List;

public interface MenuDao {
    public List<MenuModel> getAllMenu();

    public MenuModel getMenuById(Long id);

    public void SaveOrUpdateMenu(MenuModel a);

    public void UpdateMenu(MenuModel a);

    public void deleteMenuById(Long id);

    public void deleteMenu(MenuModel a);

}
