package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.DiskonModel;
import org.springframework.stereotype.Repository;
@Repository
public interface DiskonRepository extends JpaRepository<DiskonModel , Long> {
}
