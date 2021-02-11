package com.hospital.userManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.userManagement.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
