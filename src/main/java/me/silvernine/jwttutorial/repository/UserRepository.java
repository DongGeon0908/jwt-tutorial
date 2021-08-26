package me.silvernine.jwttutorial.repository;

import me.silvernine.jwttutorial.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}