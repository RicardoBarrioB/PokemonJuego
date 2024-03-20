package es.proyecto.pokemon.modelo;

import java.util.Map;

import javax.persistence.Entity;

@Entity
public class Pokemon {
		
	int idPokemon;
	
	String nombrePokemon;
	
	int pesoPokemon;
	
	int hp;
	
	int atk;
	
	int def;
	
	int atkEsp;
	
	int defEsp;
	
	int velocidad;
	
	Map<Integer, String> tipos;
	
	Map<Integer, Movimiento> movPosibles;
	
	Map<Integer, String> habPosibles;
	
}
