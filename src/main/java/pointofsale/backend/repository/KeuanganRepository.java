package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.KeuanganModel;
import org.springframework.stereotype.Repository;
@Repository
public interface KeuanganRepository extends JpaRepository<KeuanganModel, Long> {
}
