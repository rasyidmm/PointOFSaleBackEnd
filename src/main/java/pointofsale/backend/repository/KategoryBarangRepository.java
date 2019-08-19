package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pointofsale.backend.model.KategoryBarangModel;
import org.springframework.stereotype.Repository;
@Repository
public interface KategoryBarangRepository extends CrudRepository<KategoryBarangModel, Long> {
}
