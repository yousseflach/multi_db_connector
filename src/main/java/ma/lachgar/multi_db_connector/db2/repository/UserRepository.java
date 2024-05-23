package ma.lachgar.multi_db_connector.db2.repository;

import ma.lachgar.multi_db_connector.db2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
