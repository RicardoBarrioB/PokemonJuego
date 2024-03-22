package es.proyecto.pokemon.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.pokemon.model.Move;

public interface MoveDao {
	
	void setTypeMoves();
	
	Set<Move> allMovesPoke(int idPoke);
	
	Move findMove(int idMove, int idPoke);
	
	Set<Move> findMoveName(String name, int idPoke);
	
	Set<Move> findMoveType(String type, int idPoke);
	
	void chooseMovs(Pokemon pokemon);
	
	void chooseAbility(Pokemon pokemon);
	
	
	
	
}
