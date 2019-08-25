package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.MasukModel;
import org.springframework.stereotype.Repository;
@Repository
public interface MasukRepository extends JpaRepository<MasukModel, Long> {
    MasukModel findByEmail(String email);
}
