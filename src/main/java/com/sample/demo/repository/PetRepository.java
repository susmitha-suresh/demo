package com.sample.demo.repository;

import com.sample.demo.domain.Pet;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
}
