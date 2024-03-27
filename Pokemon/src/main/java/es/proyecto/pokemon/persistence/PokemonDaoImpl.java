package es.proyecto.pokemon.persistence;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.proyecto.pokemon.model.Pokemon;

@Repository
public class PokemonDaoImpl implements PokemonDao{

	@Autowired
	EntityManagerFactory emf;
	
	EntityManager em;

	@Override
	public Set<Pokemon> allPokemon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon findPokemon(int idPokemon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pokemon> findPokemonName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Pokemon> findPokType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void namedPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chooseMovs(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chooseAbility(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}

}
