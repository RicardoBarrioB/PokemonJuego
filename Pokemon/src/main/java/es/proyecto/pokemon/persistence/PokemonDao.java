package es.proyecto.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Pokemon;
import es.proyecto.pokemon.model.Type;

public interface PokemonDao {
	
	Set<Pokemon> allPokemon();
	
	Pokemon findPokemon(int idPokemon);
	
	Set<Pokemon> findPokemonName(String name);
	
	Set<Pokemon> findPokType(Type type);
	
	Set<Move> allowedMoves(Pokemon pokemon);
	
	Set<String> allowedAbilities(Pokemon pokemon);
	
}
