package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.MenuModel;
import org.springframework.stereotype.Repository;
@Repository
public interface MenuRepository extends JpaRepository<MenuModel, Long> {
}
