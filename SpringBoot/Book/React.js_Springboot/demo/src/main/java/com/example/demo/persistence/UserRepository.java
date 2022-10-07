package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findByEmail(String email);

	Boolean existsByEmail(String email);

	UserEntity findByEmailAndPassword(String email, String password);
}
