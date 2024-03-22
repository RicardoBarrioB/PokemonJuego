package es.proyecto.pokemon.pokemon.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "pokemon")
@SecondaryTable(name = "base_stats", pkJoinColumns = @PrimaryKeyJoinColumn(name = "poke_id"))
public class Pokemon implements Serializable{

	private static final long serialVersionUID = 1L;

	int idPokemon;
	
	String Species;
	
	String name;
	
	int weigth;
	
	int hp;
	
	int atk;
	
	int def;
	
	int spAtk;
	
	int spDef;
	
	int speed;
	
	List<String> types;
	
	Set<Move> moves;
	
	int level = 50;
	
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

	@Transient
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

	@Column(name = "b_hp", table = "base_stats")
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = 10 + (level / 100) * (hp * 2);
	}
	
	@Column(name = "b_atk", table = "base_stats")
	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = 10 + (level / 100) * (atk * 2);
	}

	@Column(name = "b_def", table = "base_stats")
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = 10 + (level / 100) * (def * 2);
	}

	@Column(name = "b_sp_atk", table = "base_stats")
	public int getSpAtk() {
		return spAtk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = 10 + (level / 100) * (spAtk * 2);
	}

	@Column(name = "b_sp_def", table = "base_stats")
	public int getSpDef() {
		return spDef;
	}

	public void setSpDef(int spDef) {
		this.spDef = 10 + (level / 100) * (spDef * 2);
	}

	@Column(name = "b_speed", table = "base_stats")
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = 10 + (level / 100) * (speed * 2);
	}

	@Transient
	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	@Transient
	public Set<Move> getMoves() {
		return moves;
	}

	public void setMoves(Set<Move> moves) {
		this.moves = moves;
	}

	@Transient
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Transient
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
