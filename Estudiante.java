package parcial1;

import java.util.Random;

public class Estudiante extends Participante {
	protected String grupo;
	

	public Estudiante(String nombre, String apellido, String grupo) {
		super(nombre, apellido);
		this.grupo = grupo;
		
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", grupo =" + grupo + ", numAleatorio=" + num
				+ "]";
	}

}
