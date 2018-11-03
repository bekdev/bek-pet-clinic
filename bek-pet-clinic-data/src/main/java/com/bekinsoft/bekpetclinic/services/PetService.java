package com.bekinsoft.bekpetclinic.services;

import com.bekinsoft.bekpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
