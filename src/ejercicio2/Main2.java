package ejercicio2;

import java.util.InputMismatchException;

import java.util.Scanner;
/*/ ENTRADA:10,15,1 | RES.ESPERADO:Resultado: 50.0 | RES.OBTENIDO:Resultado: 50.0
 *  ENTRADA: 10,15,2| RES.ESPERADO:Resultado: 225.0 | RES.OBTENIDO:Resultado: 225.0
 *  ENTRADA:10,10,0 | RES.ESPERADO:FIN | RES.OBTENIDO: FIN
 *   ENTRADA: hola| RES.ESPERADO: Solo se puede insertar un numero| RES.OBTENIDO: Solo se puede insertar un numero
 *   ENTRADA: 10,10,10| RES.ESPERADO: Solo se adimite permite los numeros 1[Perímetro] y 2 [Área] y 0[Salir]| RES.OBTENIDO:Solo se adimite permite los numeros 1[Perímetro] y 2 [Área] y 0[Salir]
 *   
 */
public class Main2 {
	// declaramos la funcion scanner como estatica para que se utilize en toda la
	// clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) { // main
		// Declaramos con la variable int ops
		int ops;

		// Declaramos con la varible double el ancho, alto y resultado (donde se va a
		// inicializar a 0)
		double ancho, alto, res = 0;

		// Creamos el objeto rec con el contructor sin parametros
		Rectangulo rec;

		// Iniciamos bucle do-while
		do {

			// Declaramos con ancho la funcion pideAncho(que realize las operacion que
			// contiene la funcion)
			ancho = pideAncho();

			// Declaramos con alto la funcion pideAlto(que realize las operacion que
			// contiene la funcion)
			alto = pideAlto();

			// Declaramos con ops la funcion menu(que realize las operacion que contiene la
			// funcion)
			ops = menu();

			// Con el objeto, llamamos al constructor con parametros para declarar los
			// valores
			rec = new Rectangulo(ancho, alto);

			// iniciamos switch con ops
			switch (ops) {

			// El caso 0 se indicara que es el FIN del programa
			case 0:
				System.out.println("FIN");

				// rompemos la condicion
				break;

			// El caso 1 nos hara la operacion perimetro y nos la indicara en pantalla
			case 1:

				// declaramos con res el resultado de la funcion perimetro
				res = rec.perimetro();

				// imprimimos resultado
				System.out.println("Resultado: " + res);

				// rompemos la condicion
				break;

			// El caso 2 nos hara la operacion perimetro y nos la indicara en pantalla
			case 2:

				// declaramos con res el resultado de la funcion area
				res = rec.area();

				// imprimimos resultado
				System.out.println("Resultado: " + res);

				// rompemos la condicion
				break;

			// Default nos indicara que si ops no es 1 o 2, nos indique los numeros que se
			// aceptan para que funcione el programa
			// y iniciamos la funcion menu de nuevo
			default:
				System.out.println("Solo se adimite permite los numeros 1[Perímetro] y 2 [Área] y 0[Salir]");
				ops = menu();
			}// fin switch
			// finalizamos el bucle si el usuario marca 0 en ops
		} while (ops != 0);

	}

	// Iniciamos la funcion menu como estatica
	static int menu() {

		// Declaramos con la variable int ops
		int ops;

		// imprimimos en pantalla el menu
		System.out.println("1.Perímetro");
		System.out.println("2.Área");
		System.out.println("0.Salir");
		System.out.println("Introduzca el numero de la operacion que quieras realizar");

		// escribimos ops
		ops = sc.nextInt();

		// devolvemos el resultado ops
		return ops;
	}

	// Funcion para pedir el ancho
	static double pideAncho() {

		// declaramos con la variable double ancho e inicializamos a 0
		double ancho = 0;

		// Declaramos con la variable boolean seguir e inizializamos a true
		boolean seguir = true;

		// Iniciamos bucle do-while
		do {
			// Iniciamos try
			try {
				// imprimimos en pantalla que inserte un ancho
				System.out.println("Inserta que ancho del rectangulo");

				// escribimos acho
				ancho = sc.nextDouble();

				// limpiamos el salto de linea
				sc.nextLine();

				// inicializamos a false seguir para romper el bucle
				seguir = false;

				// Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {
				// imprimimos error
				System.out.println("Solo se puede insertar un numero");

				// limpiamos la variable
				sc.nextLine();

			} // fin catch
			// se termina el bucle si seguir es falso
		} while (seguir);

		// devolvemos el resultado de ancho
		return ancho;
	}

	// Funcion para pedir el alto
	static double pideAlto() {

		// Declaramos con la variable double alto e inicializamos a 0
		double alto = 0;

		// Declaramos con la variable boolean seguir e inizializamos a true
		boolean seguir = true;

		// Iniciamos bucle do-while
		do {
			// Iniciamos try
			try {
				// imprimimos en pantalla que inserte un alto
				System.out.println("Inserta el alto del rectangulo");

				// escribimos alto
				alto = sc.nextDouble();

				// limpiamos el salto de linea
				sc.nextLine();

				// inicializamos a false el seguir para que se rompa el bucle
				seguir = false;

				// Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {

				// imprimimos error
				System.out.println("Solo se puede insertar un numero");

				// limpiamos la variable
				sc.nextLine();

			} // fin catch
				// se termina el bucle si seguir es falso
		} while (seguir);

		// devolvemos el resultado de alto
		return alto;

	}
}
