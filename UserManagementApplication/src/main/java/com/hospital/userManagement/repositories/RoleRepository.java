
package com.hospital.userManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.userManagement.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
