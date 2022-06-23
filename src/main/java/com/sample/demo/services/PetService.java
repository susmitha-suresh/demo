package com.sample.demo.services;

import com.sample.demo.DTO.PetDTO;
import com.sample.demo.domain.Pet;
import com.sample.demo.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List <Pet>  findAllPets(){
        try {
            return petRepository.findAll(); // already defined method call for find all rows from employees table
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
