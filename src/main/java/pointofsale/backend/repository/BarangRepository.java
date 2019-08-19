package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pointofsale.backend.model.BarangModel;
import org.springframework.stereotype.Repository;
@Repository
public interface BarangRepository extends JpaRepository<BarangModel, Long> {
}
