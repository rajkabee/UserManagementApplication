
package com.hospital.userManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.userManagement.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
