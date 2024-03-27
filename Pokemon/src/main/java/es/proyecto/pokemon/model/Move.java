package es.proyecto.pokemon.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "moves")
public class Move implements Serializable, Comparable<Move>{
	
	private static final long serialVersionUID = 1L;

	int idMov;
	
	String mov;
	
	Type type;
	
	int power;
	
	int pp;
	
	int accuracy;

	@Id
	@Column(name = "move_id")
	public int getIdMov() {
		return idMov;
	}

	public void setIdMov(int idMov) {
		this.idMov = idMov;
	}
	
	@Column(name = "move_name")
	public String getMov() {
		return mov;
	}

	public void setMov(String mov) {
		this.mov = mov;
	}
	
	@OneToOne
	@JoinColumn(name = "type_id")
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Column(name = "move_power")
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Column(name = "move_pp")
	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	@Column(name = "move_accuracy")
	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idMov);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Move other = (Move) obj;
		return idMov == other.idMov;
	}

	@Override
	public String toString() {
		return "Move [idMov=" + idMov + ", mov=" + mov + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Move m) {
		if(this.equals(m)) return 0;
		return this.idMov - m.idMov;
	}
	
}
