package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.RoleModel;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
}
