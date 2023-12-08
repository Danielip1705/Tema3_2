package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
	// declaramos la funcion scanner como estatica para que se utilize en toda la
	// clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// declaramos con la variable double la base,altura y res (donde lo
		// inicializamos a 0)
		double base, altura, res;

		// declaramos con la varible int ops
		int ops;

		// creamos objeto con el contructor sin parametros
		Cilindro cil;

		// iniciamos bucle do-while
		do {

			// declaramos con base la funcion pideRadioBase(Donde se va a realizar las
			// operaciones que contiene le funcion)
			base = pideRadioBase();

			// declaramos con altura la funcion altura(Donde se va a realizar las
			// operaciones que contiene le funcion)
			altura = altura();

			// declaramos con ops la funcion menu (Donde se va a ralizar las operacion que
			// contiene la funcion)
			ops = menu();

			// Con el objeto, llamamos al constructor con parametros para declarar los
			// valores
			cil = new Cilindro(base, altura);

			// iniciamos switch con ops
			switch (ops) {

			// El caso 0 nos indicara el fin del programa
			case 0:
				System.out.println("FIN");
				break;
			// El caso 1 nos hara el calculo del volumen e imprimira la respuesta
			case 1:

				// declaramos con res el resultado de la funcion volumen
				res = cil.volumen();

				// imprimimos resultado
				System.out.println("Resultado del volumen: " + res);
				// rompemos la condicion
				break;
			// El caso 2 nos hara el calculo de la altura e imprimira la respuesta
			case 2:

				// declaramos con res el resultado de la funcion altura
				res = cil.altura;

				// imprimimos resultado
				System.out.println("Resultado de la altura: " + res);

				// rompemos la condicion
				break;

			// Default nos indicara que si ops no es 1,2 o 0, nos indique los numeros que se
			// aceptan para que funcione el programa
			default:
				// imprimimos numeros validos
				System.out.println("Solo se puede insertar las opciones 1[Volumen] 2[Área] y 0[Salir]");

				// iniciamos la funcion menu de nuevo
				ops = menu();
			} // fin switch

			// finalizamos el bucle si el usuario marca 0 en ops
		} while (ops != 0);

	}

	// Iniciamos la funcion menu como estatica e int
	static int menu() {

		// declaramos con la variable int ops
		int ops;

		// imprimimos el menu
		System.out.println("1.Volumen");
		System.out.println("2.Área");
		System.out.println("0. Salir");
		System.out.println("Introduzca que operacion quieres hacer");

		// escribimos ops
		ops = sc.nextInt();

		// devolvemos el resultado de ops
		return ops;
	}

	// Iniciamos la funcion pideRadio como estatica y double
	static double pideRadioBase() {

		// declaramos con la varible boolean seguir e inicializamos a true
		boolean seguir = true;

		// declaramos con la variable double radio e inicializamos a 0
		double radio = 0;

		// iniciamos bucle do-while
		do {

			// iniciamos try
			try {

				// imprimimos en consola que nos escriba el radio
				System.out.println("Introduzca el numero de su radio");

				// escribimos radio
				radio = sc.nextDouble();

				// limpiamos salto de pagina
				sc.nextLine();

				// inicializamos a false seguir para romper el bucle
				seguir = false;

				// Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {

				// imprimimos error
				System.out.println("Solo se puede insertar numeros");

				// limpiamos la varible
				sc.nextLine();
			} // fin catch

			// se termina el bucle si seguir es falso
		} while (seguir);

		// devolvemos el resultado de radio
		return radio;
	}

	// Iniciamos la funcion pideRadio como estatica y double
	static double altura() {

		// declaramos con la variable boolean seguir e inicializamos a true
		boolean seguir = true;

		// declaramos con la variable double altura e inicializamos a 0
		double altura = 0;

		// iniciamos bucle do-while
		do {

			// iniciamos try
			try {

				// imprimimos en consola que nos introduzca la altura
				System.out.println("Introduzca el numero de la altura");

				// escribimos altura
				altura = sc.nextDouble();

				// limpiamos salto de pagina
				sc.nextLine();

				// inicializamos a false seguir para romper el bucle
				seguir = false;

				// Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {

				// imprimimos error
				System.out.println("Solo se puede insertar numeros");

				// limpiamos variable
				sc.nextLine();

			} // fin catch

			// se termina el bucle si seguir es falso
		} while (seguir);

		// devolvemos el resultado de altura
		return altura;
	}
}