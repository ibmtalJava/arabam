package ibmtal.arabam.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.arabam.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
