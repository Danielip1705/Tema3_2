package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int ops;
		double ancho, altura;

		ancho = pideAncho();

	}

	static int menu() {
		int ops;
		System.out.println("1.Perímetro");
		System.out.println("2.Área");
		System.out.println("0.Salir");
		ops = sc.nextInt();
		return ops;
	}

	static double pideAncho() {
		double ancho = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("¿Que operacion quieres elegir?");
				ancho = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar un numero");
			}

		} while (seguir);

		return ancho;
	}

	static double pideAlto() {
		double alto = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("¿Que operacion quieres elegir?");
				alto = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar un numero");
			}

		} while (seguir);

		return alto;

	}
}
