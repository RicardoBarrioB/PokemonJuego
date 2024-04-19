package es.proyecto.pokemon.persistence;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Pokemon;
import es.proyecto.pokemon.model.Type;

@Repository
public class PokemonDaoImpl implements PokemonDao{

	@Autowired
	EntityManagerFactory emf;
	
	EntityManager em;

	private void em() {
		em = emf.createEntityManager();
	}
	
	@Override
	public Set<Pokemon> allPokemon() {
		em();
		TypedQuery<Pokemon> query = em.createQuery("SELECT p FROM Pokemon p", Pokemon.class);
		Set<Pokemon> all = new TreeSet<>(query.getResultList());
		em.close();
		
		return all;
	}

	@Override
	public Pokemon findPokemon(int idPokemon) {
		em();
		Pokemon poke = em.find(Pokemon.class, idPokemon);		
		em.close();
		
		return poke;
	}

	@Override
	public Set<Pokemon> findPokemonName(String name) {
		em();
		String jpql = "SELECT p FROM Pokemon p WHERE p.species LIKE :cadena";
		TypedQuery<Pokemon> query = em.createQuery(jpql, Pokemon.class);
		query.setParameter("cadena", "%" + name + "%");
		Set<Pokemon> result = new TreeSet<>(query.getResultList());
		em.close();
		
		return result;
	}

	@Override
	public Set<Pokemon> findPokType(Type type) {		
		return type.getPokeType();
	}

	@Override
	public Set<Move> allowedMoves(Pokemon pokemon) {
		em();
		String sql = "SELECT * FROM moves m JOIN pokemon_moves pm ON m.move_id = pm.move_id WHERE pok_id = :id";
		Query query = em.createNativeQuery(sql, Move.class);
		query.setParameter("id", pokemon.getIdPokemon());
		Set<Move> result = new TreeSet<>(query.getResultList());
		em.close();
		
		return result;
	}

	@Override
	public Set<String> allowedAbilities(Pokemon pokemon) {
		em();
		String sql = "SELECT a.abil_name FROM abilities a JOIN pokemon_abilities pa ON a.abil_id = pa.abil_id WHERE pok_id = :id";
		Query query = em.createNativeQuery(sql, String.class);
		query.setParameter("id", pokemon.getIdPokemon());
		Set<String> result = new TreeSet<>(query.getResultList());
		em.close();
		
		return result;
	}

}
