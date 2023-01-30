package vladasustum.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vladasustum.api.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByUsername(String username);
}
