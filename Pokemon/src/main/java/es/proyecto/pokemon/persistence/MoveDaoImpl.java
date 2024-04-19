package es.proyecto.pokemon.persistence;

import java.util.Set;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Type;

public class MoveDaoImpl implements MoveDao{

	@Override
	public Set<Move> allMovesPoke(int idPoke) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Move findMove(int idMove, int idPoke) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Move> findMoveName(String name, int idPoke) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Move> findMoveType(Type type) {
		return type.getMovType();
	}

}
