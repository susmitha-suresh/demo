package com.sample.demo.resources;

import com.sample.demo.domain.Pet;
import com.sample.demo.services.PetService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/public/")
public class PetResource {
    private final Logger log = LoggerFactory.getLogger(PetResource.class);

    private final PetService petService;

    // To get All Pets

    @GetMapping("/pet")
    public ResponseEntity<List<Pet>> findAllPet() {
        log.info("Find all Pet");
        return new ResponseEntity<>(petService.findAllPets(), HttpStatus.OK);
    }
}
