package com.api.repositories;


import com.api.bo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<Persona, Long> {

}
