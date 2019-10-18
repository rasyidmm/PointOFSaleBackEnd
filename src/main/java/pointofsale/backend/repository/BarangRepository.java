package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import pointofsale.backend.model.BarangModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarangRepository extends JpaRepository<BarangModel, Long> {
    List<BarangModel>getAllByStatus(String Status);
    @Query(value = "select * from barang_model a JOIN produsen_barang_model c on a.produsen_barang_model_id = c.id WHERE c.id=:id ", nativeQuery = true)
    List<BarangModel>getAllByProdusenBarangModelId(Long id);
    @Query(value = " select * from barang_model a JOIN kategory_barang_model c on a.kategory_barang_model_id = c.id WHERE c.id=:id", nativeQuery = true)
    List<BarangModel>getAllByKategoryBarangModelOrderById(Long id);
    List<BarangModel>getById(Long id);
}
