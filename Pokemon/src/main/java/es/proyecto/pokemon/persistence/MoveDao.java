package es.proyecto.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Pokemon;

public interface MoveDao {
	
	Set<Move> allMovesPoke(int idPoke);
	
	Move findMove(int idMove, int idPoke);
	
	Set<Move> findMoveName(String name, int idPoke);
	
	Set<Move> findMoveType(String type, int idPoke);
	
}
