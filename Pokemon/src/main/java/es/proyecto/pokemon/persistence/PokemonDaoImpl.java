package es.proyecto.pokemon.pokemon.persistence;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.proyecto.pokemon.pokemon.model.Pokemon;

@Repository
public class PokemonDaoImpl implements PokemonDao{

	@Autowired
	EntityManagerFactory emf;
	
	EntityManager em;
	
	
	@PostConstruct
	@Override
	public void setTypes() {
		em = emf.createEntityManager();
		
		allPokemon().forEach(poke -> {
		
		String sql = "SELECT t.type_name " +
                "FROM types t " +
                "JOIN pokemon_types pt ON t.type_id = pt.type_id " +
                "WHERE pt.pok_id = :idPokemon";
		
		Query query = em.createNativeQuery(sql);
		
		query.setParameter("idPokemon", poke.getIdPokemon());
		
		poke.setTypes(query.getResultList());});
		
		em.close();
	}

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
