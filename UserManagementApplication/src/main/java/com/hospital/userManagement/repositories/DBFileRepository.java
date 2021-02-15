package com.hospital.userManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.userManagement.entities.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, Long> {

}
