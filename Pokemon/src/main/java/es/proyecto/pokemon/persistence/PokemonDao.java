package es.proyecto.pokemon.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.pokemon.model.Pokemon;

public interface PokemonDao {
	
	void setTypes();
	
	Set<Pokemon> allPokemon();
	
	Pokemon findPokemon(int idPokemon);
	
	Set<Pokemon> findPokemonName(String name);
	
	Set<Pokemon> findPokType(String type);
		
	void namedPokemon(Pokemon pokemon);
	
	void chooseMovs(Pokemon pokemon);
	
	void chooseAbility(Pokemon pokemon);
	
}
