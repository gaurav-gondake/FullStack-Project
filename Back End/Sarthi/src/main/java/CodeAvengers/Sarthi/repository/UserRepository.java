package CodeAvengers.Sarthi.repository;

import CodeAvengers.Sarthi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
