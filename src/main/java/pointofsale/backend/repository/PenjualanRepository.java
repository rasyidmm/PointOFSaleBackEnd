package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.PenjualanModel;
import org.springframework.stereotype.Repository;
@Repository
public interface PenjualanRepository extends JpaRepository<PenjualanModel, Long> {
}
