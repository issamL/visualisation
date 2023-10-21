package com.api.service;

import com.api.bo.Persona;
import com.api.repositories.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class personnaServiceImpl implements personaService{

    @Autowired
    personaRepository personaRepository;

    @Override
    public Persona getPersonna(long id) {
        Optional<Persona> persona = personaRepository.findById(id);
        return persona.orElse(null);
    }
}
