package com.desarrollo.complexivo_app.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.complexivo_app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional <User> findByUsername(String username);
}
