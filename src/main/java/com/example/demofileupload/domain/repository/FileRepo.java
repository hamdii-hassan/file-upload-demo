package com.example.demofileupload.domain.repository;

import com.example.demofileupload.domain.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileRepo extends JpaRepository<File, Long> {

}
