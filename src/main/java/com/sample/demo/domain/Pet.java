package com.sample.demo.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pet")
public class Pet extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "pet_age")
    private String petAge;

    @Column(name = "pet_guardian")
    private String petGuardian;

    @Column(name = "phone_number")
    private String phoneNumber;


}
