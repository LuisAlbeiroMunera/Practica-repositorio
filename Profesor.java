package parcial1;

public class Profesor extends Participante {
	protected String asignatura;

	public Profesor(String nombre,String apellido,String asignatura) {
		super(nombre,apellido);
		this.asignatura = asignatura;
		
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido +", asignatura ="+ asignatura+", numAleatorio=" + num+ "]";
	}

	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
