package es.proyecto.pokemon.persistence;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.proyecto.pokemon.model.Move;
import es.proyecto.pokemon.model.Type;

@Repository
public class MoveDaoImpl implements MoveDao{
	
	@Autowired
	EntityManagerFactory emf;
	
	EntityManager em;
	
	private EntityManager em() {
		return em = emf.createEntityManager();
	}

	@Override
	public Move findMove(int idMove) {
		em();	
		Move move = em.find(Move.class, idMove);
		em.close();
		
		return move;
	}

	@Override
	public Set<Move> findMoveName(String name) {
		em();
		String jpql = "SELECT m FROM Move m WHERE m.mov LIKE :cadena";
		TypedQuery<Move> query = em.createQuery(jpql, Move.class);
		query.setParameter("cadena", "%" + name + "%");
		Set<Move> moves = new TreeSet<>(query.getResultList());
		em.close();
		
		return moves;
	}
	
	@Override
	public Set<Move> findMoveType(Type type) {
		return type.getMovType();
	}

}
