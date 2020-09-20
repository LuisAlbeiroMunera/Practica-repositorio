package parcial1;

import java.util.Scanner;

public class Prueba {
Participante participante;
Participante participante2;

	public void prueba1() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el nombre del profesor");
		String nombreP = entrada.nextLine();
		System.out.println("Ingrese el apellido del profesor");
		String apellidoP = entrada.nextLine();
		System.out.println("Ingrese el asignatura del profesor");
		String asignatura = entrada.nextLine();
		participante = new Profesor(nombreP, apellidoP, asignatura);

		System.out.println("Ingrese el nombre del estudiante");
		String nombreE = entrada.nextLine();
		System.out.println("Ingrese el apellido del estudiante");
		String apellidoE = entrada.nextLine();
		boolean enter = true;

		try {
			String grupo;
			do {
				System.out.println("Ingrese el grupo del estudiante [numero]°[letra]");

				grupo = entrada.nextLine();

				if (Integer.parseInt(grupo.split("°")[0]) < 1 || Integer.parseInt(grupo.split("°")[0]) > 11) {
					System.out.println("El numero ingresado en el grupo no está dentro del rango de 1 a 11");

				} else {

					enter = false;

					if (grupo.split("°")[1].equals("a") || grupo.split("°")[1].equals("b")
							|| grupo.split("°")[1].equals("c") || grupo.split("°")[1].equals("d")) {

						enter = false;
					} else {
						System.out.println("La letra ingresada en el grupo no está dentro del rango de a hasta d");
						enter = true;
					}
				}
			} while (enter);
			participante2 = new Estudiante(nombreE, apellidoE, grupo);
		} catch (NullPointerException e) {

		}
		jugar();
	}

	public void jugar() {
		if (participante2.getNum() > participante.getNum()) {
			System.out.println(participante.toString());
			System.out.println(participante2.toString());
			System.out.println("El estudiante es el ganador:");

		} else {
			if (participante2.getNum() == participante.getNum()) {

				System.out.println(participante2.toString());
				System.out.println(participante.toString());
				System.out.println("Hay un empate");
			} else {

				System.out.println(participante.toString());
				System.out.println(participante2.toString());
				System.out.println("El profesor es el ganador:");

			}
		}
	}
}
