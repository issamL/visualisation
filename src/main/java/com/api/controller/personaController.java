package com.api.controller;

import com.api.service.personaService;
import org.api.PersonaApi;
import org.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class personaController implements PersonaApi {

    @Autowired
    personaService personaService;

    @Override
    public ResponseEntity<List<Persona>> getPersonas() {
        List<Persona> personaList = personaService.getPersonas();
        return ResponseEntity.ok(personaList);
    }
}
