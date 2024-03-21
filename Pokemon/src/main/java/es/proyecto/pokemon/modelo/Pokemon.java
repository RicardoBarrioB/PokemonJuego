package es.proyecto.pokemon.modelo;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "pokemon")
public class Pokemon {
	
	int idPokemon;
	
	String Species;
	
	@Transient
	String name;
	
	int weigth;
	
	int hp;
	
	int atk;
	
	int def;
	
	int spAtk;
	
	int spDef;
	
	int speed;
	
	String [] types = new String [2];
	
	@Transient
	Set<Move> moves;
	
	@Transient
	int level = 50;
	
	@Transient
	String ability;

	@Id
	@Column(name = "pok_id")
	public int getIdPokemon() {
		return idPokemon;
	}

	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}
	
	@Column(name = "pok_name")
	public String getSpecies() {
		return Species;
	}

	public void setSpecies(String species) {
		Species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Species;
	}

	@Column(name = "pok_weight")
	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	@JoinColumn()
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = 10 + (level / 100) * (hp * 2);
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = 10 + (level / 100) * (atk * 2);
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = 10 + (level / 100) * (def * 2);
	}

	public int getSpAtk() {
		return spAtk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = 10 + (level / 100) * (spAtk * 2);
	}

	public int getSpDef() {
		return spDef;
	}

	public void setSpDef(int spDef) {
		this.spDef = 10 + (level / 100) * (spDef * 2);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = 10 + (level / 100) * (speed * 2);
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public Set<Move> getMoves() {
		return moves;
	}

	public void setMoves(Set<Move> moves) {
		this.moves = moves;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPokemon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return idPokemon == other.idPokemon;
	}

	@Override
	public String toString() {
		return "Pokemon [idPokemon=" + idPokemon + ", Species=" + Species + ", name=" + name + "]";
	}
	
}
