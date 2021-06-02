package com.example.codeclan.filesfolders.filesfolders.repositories;

import com.example.codeclan.filesfolders.filesfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
