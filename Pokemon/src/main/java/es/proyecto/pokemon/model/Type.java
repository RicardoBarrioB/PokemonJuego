package es.proyecto.pokemon.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class Type implements Serializable {

	private static final long serialVersionUID = 1L;

	int idType;
	
	String type;
	
	Map<Integer, String> typeEfficacy;
	
	Set<Pokemon> pokeType;
	
	Set<Move> movType;

	@Id
	@Column(name = "type_id")
	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Column(name = "type_name")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@ElementCollection
	@CollectionTable(name = "type_efficacy", joinColumns = @JoinColumn(name = "damage_type_id"))
	@MapKeyColumn(name = "target_type_id")
	@Column(name = "damage")
	public Map<Integer, String> getTypeEfficacy() {
		return typeEfficacy;
	}

	public void setTypeEfficacy(Map<Integer, String> typeEfficacy) {
		this.typeEfficacy = typeEfficacy;
	}

	@ManyToMany(mappedBy = "types")
	public Set<Pokemon> getPokeType() {
		return pokeType;
	}

	public void setPokeType(Set<Pokemon> pokeType) {
		this.pokeType = pokeType;
	}

	@OneToMany(mappedBy = "type")
	public Set<Move> getMovType() {
		return movType;
	}

	public void setMovType(Set<Move> movType) {
		this.movType = movType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		return idType == other.idType;
	}

	@Override
	public String toString() {
		return "Type [idType=" + idType + ", type=" + type + "]";
	}
}
