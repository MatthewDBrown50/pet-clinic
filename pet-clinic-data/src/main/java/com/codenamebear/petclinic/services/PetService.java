package com.codenamebear.petclinic.services;

import com.codenamebear.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById();

    Pet save(Pet pet);

    Set<Pet> findAll();
}
