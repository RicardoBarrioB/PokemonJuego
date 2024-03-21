package es.proyecto.pokemon.modelo;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moves")
public class Move {
	
	int idMov;
	
	String mov;
	
	String type;
	
	int power;
	
	int pp;
	
	int accuracy;
	
	Map<String, Integer> type_efficacy;
	
}
