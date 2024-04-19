package es.proyecto.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Pokemon;
import es.proyecto.pokemon.model.Type;

public interface MoveDao {
	
	Set<Move> allMovesPoke(int idPoke);
	
	Move findMove(int idMove, int idPoke);
	
	Set<Move> findMoveName(String name, int idPoke);
	
	Set<Move> findMoveType(Type type);
	
}
