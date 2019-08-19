package pointofsale.backend.dao;

import pointofsale.backend.model.DiskonModel;

import java.util.List;

public interface DiskonDao {
    public List<DiskonModel> getAllDiskon();

    public DiskonModel getDiskonById(Long id);

    public void SaveOrUpdateDiskon(DiskonModel a);

    public void UpdateDiskon(DiskonModel a);

    public void deleteDiskonById(Long id);

    public void deleteDiskon(DiskonModel a);
}

