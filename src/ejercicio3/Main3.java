package ejercicio3;

import java.util.InputMismatchException;

import java.util.Scanner;
/*/ENTRADA: 10,1| RES.ESPERADO: Resultado del circunferencia: 62.83185307179586 | RES.OBTENIDO: Resultado del circunferencia: 62.83185307179586
 * ENTRADA:10,2 | RES.ESPERADO: Resultado del área: 314.1592653589793 | RES.OBTENIDO:Resultado del área: 314.1592653589793
 * ENTRADA10,0: | RES.ESPERADO: FIN| RES.OBTENIDO: FIN
 * ENTRADA: hola| RES.ESPERADO: Solo se puede insertar numeros| RES.OBTENIDO:Solo se puede insertar numeros
 * ENTRADA: 10,10| RES.ESPERADO:Solo se puede insertar las opciones 1[Circunferencia] 2[Área] y 0[Salir] | RES.OBTENIDO:Solo se puede insertar las opciones 1[Circunferencia] 2[Área] y 0[Salir]
 */
public class Main3 {
	// declaramos la funcion scanner como estatica para que se utilize en toda la
	// clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// declaramos con la varible double el radio y res(donde se va a
		// inicializar a 0)
		double radio, res = 0;

		// declaramos con la variable int la ops
		int ops;

		// creamos cir con el contructor sin parametros
		Circulo cir;

		// iniciamos bucle do-while
		do {
			// declaramos con radio la funcion pideRadio(para realizar las operaciones que
			// contiene dicha funcion)
			radio = pideRadio();

			// declaramos con ops la funcion menu(para realizar las operaciones que contiene
			// dicha funcion)
			ops = menu();

			// Con el objeto, llamamos al constructor con parametros para declarar los
			// valores
			cir = new Circulo(radio);

			// iniciamos switch con ops
			switch (ops) {

			// El caso 0 nos indicara el final del programa
			case 0:
				System.out.println("FIN");
				break;

			// El caso 1 nos calculara la circunferencia y lo imprimira en consola
			case 1:
				res = cir.Circunferencia();

				// imprimimos resultado
				System.out.println("Resultado del circunferencia: " + res);

				// rompemos la condicion
				break;

			// El caso 2 nos calculara la area y lo imprimira en consola
			case 2:
				res = cir.area();

				// imprimimos resultado
				System.out.println("Resultado del área: " + res);

				// rompemos la condicion
				break;

			// Default nos indicara que si ops no es 1,2 o 0, nos indique los numeros que se
			// aceptan para que funcione el programa
			default:

				// imprimimos numeros validos
				System.out.println("Solo se puede insertar las opciones 1[Circunferencia] 2[Área] y 0[Salir]");

				// iniciamos la funcion menu de nuevo
				ops = menu();

			}// fin switch

			// finalizamos el bucle si el usuario marca 0 en ops
		} while (ops != 0);

	}

	// Iniciamos la funcion menu como estatica e int
	static int menu() {

		// declaramos con la varible int ops
		int ops;

		// imprimimos el menu y el numero que quiere elegir
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0. Salir");
		System.out.println("Introduzca que operacion quieres hacer");

		// escribimos ops
		ops = sc.nextInt();

		// devolvemos el resultado que contenga ops
		return ops;
	}

	// Iniciamos la funcion pideRadio como estatica y double
	static double pideRadio() {
		// declaramos con la variable boolean seguir e inicializamos a true
		boolean seguir = true;

		// declaramos con la variable int radio e inicializamos a 0
		double radio = 0;

		// iniciamos bucle do-while
		do {

			// iniciamos try
			try {

				// imprimimos en pantalla que nos escriba el radio
				System.out.println("Introduzca el numero de su radio");

				// escrible radio
				radio = sc.nextDouble();

				// limpiamos el salto de pagina
				sc.nextLine();

				// inicializamos a false seguir para romper el bucle
				seguir = false;

				// Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {

				// imprimimos error
				System.out.println("Solo se puede insertar numeros");

				// limpiamos la variable
				sc.nextLine();

			} // fin catch

			// se termina el bucle si seguir es falso
		} while (seguir);

		// devolvemos el resultado de radio
		return radio;

	}
}
