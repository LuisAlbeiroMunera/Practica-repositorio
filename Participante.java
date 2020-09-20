package parcial1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Participante {
	protected String nombre;
	protected String apellido;
	protected int num;
	public Participante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.num = generarnum();
	}

	public String getNombre() {
		return nombre;
	}

	public int getNum() {
		return num;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String toString() {
		return "Participante [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public int generarnum() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 6);

		return randomNum;
	}

}
