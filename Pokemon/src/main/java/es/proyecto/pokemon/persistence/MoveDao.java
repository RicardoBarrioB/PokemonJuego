package es.proyecto.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Pokemon;
import es.proyecto.pokemon.model.Type;

public interface MoveDao {
	
	Move findMove(int idMove);
	
	Set<Move> findMoveName(String name);
	
	Set<Move> findMoveType(Type type);
	
}
