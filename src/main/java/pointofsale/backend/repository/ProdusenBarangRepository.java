package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.ProdusenBarangModel;
import org.springframework.stereotype.Repository;
@Repository
public interface ProdusenBarangRepository extends JpaRepository<ProdusenBarangModel, Long> {
}
