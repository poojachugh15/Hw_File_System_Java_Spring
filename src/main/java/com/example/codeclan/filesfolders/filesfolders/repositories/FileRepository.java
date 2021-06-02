package com.example.codeclan.filesfolders.filesfolders.repositories;

import com.example.codeclan.filesfolders.filesfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
