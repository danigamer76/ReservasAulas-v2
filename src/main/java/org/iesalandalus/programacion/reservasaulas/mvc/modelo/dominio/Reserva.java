package org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio;

import java.util.Objects;

public class Reserva {

	Profesor profesor;
	Aula aula;
	Permanencia permanencia;
	public Reserva(Profesor profesor, Aula aula, Permanencia permanencia) {
		setProfesor(profesor);
		setAula(aula);
		setPermanencia(permanencia);
	}

	public Reserva(Reserva reserva) {
		if(reserva == null) {
			throw new IllegalArgumentException("No se puede copiar una reserva nula.");
		}else {
		setProfesor(reserva.getProfesor());
		setAula(reserva.getAula());
		setPermanencia(reserva.getPermanencia());
		}
	}

	private void setProfesor(Profesor profesor) {
		if(profesor == null) {
			throw new IllegalArgumentException("La reserva debe estar a nombre de un profesor.");
		}else {
			this.profesor = profesor;
		}
	}

	public Profesor getProfesor() {
		return profesor;
	}

	private void setAula(Aula aula) {
		if(aula == null) {
			throw new IllegalArgumentException("La reserva debe ser para un aula concreta.");
		}else {
			this.aula = aula;
		}
	}

	public Aula getAula() {
		return aula;
	}

	private void setPermanencia(Permanencia permanencia) {
		if(permanencia == null) {
			throw new IllegalArgumentException("La reserva se debe hacer para una permanencia concreta.");
		}else {
			this.permanencia = permanencia;
		}
	}

	public Permanencia getPermanencia() {
		return permanencia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aula, permanencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(permanencia, other.permanencia);
	}

	@Override
	public String toString() {
		return "[profesor=" + profesor + ", aula=" + aula + ", permanencia=" + permanencia + "]";
	}








}
