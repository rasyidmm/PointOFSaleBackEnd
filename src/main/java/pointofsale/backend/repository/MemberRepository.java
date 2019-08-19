package pointofsale.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pointofsale.backend.model.MemberModel;
import org.springframework.stereotype.Repository;
@Repository
public interface MemberRepository extends JpaRepository<MemberModel, Long> {
}
