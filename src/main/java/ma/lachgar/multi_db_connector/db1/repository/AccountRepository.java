package ma.lachgar.multi_db_connector.db1.repository;

import ma.lachgar.multi_db_connector.db1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
