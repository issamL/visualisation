package com.api.service;

import com.api.repositories.personaRepository;
import org.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class personnaServiceImpl implements personaService{

    @Autowired
    personaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<com.api.bo.Persona> personas = personaRepository.findAll();
        return mapListPersona(personas);
    }

    private List<Persona> mapListPersona(List<com.api.bo.Persona> personaList) {
        List<Persona> personaListModel = new ArrayList<>();
        personaList.forEach(persona -> {
            Persona personaModel = new Persona();
            personaModel.setNom(persona.getNom());
            personaModel.setPrenom(persona.getPrenom());
            personaModel.setAdresse(persona.getAdresse());
            personaModel.setNumTel(persona.getNumTel());
            personaModel.setDiplome(persona.getDiplome());
            personaModel.setIntituleDiplome(persona.getIntituleDiplome());
            personaListModel.add(personaModel);
        });
        return personaListModel;
    }
}
