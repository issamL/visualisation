package com.api;

import com.api.bo.Persona;
import com.api.repositories.personaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VisualisationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisualisationApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(VisualisationApplication.class);

	@Bean
	CommandLineRunner initDatabase(personaRepository repository) {

		return args -> {
			Persona personaIss = new Persona();
			personaIss.setId(1L);
			personaIss.setNom("test");
			personaIss.setPrenom("john");
			personaIss.setAdresse("rue solferino");
			personaIss.setDiplome("miage");
			personaIss.setIntituleDiplome("MIAGE");
			log.info("Preloading " + repository.save(personaIss));
		};
	}

}
