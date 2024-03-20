package es.proyecto.pokemon.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigPoke {
	
	@Bean
	public EntityManagerFactory EMF() {
		
		return Persistence.createEntityManagerFactory("pokemon");
		
	}
	
	
}
