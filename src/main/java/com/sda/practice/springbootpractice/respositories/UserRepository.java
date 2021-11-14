package com.sda.practice.springbootpractice.respositories;

import com.sda.practice.springbootpractice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository to handle DB related operations for User
 *
 * @author Vinod John
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);

  Optional<User> findByUsernameAndPassword(String username, String password);
}
