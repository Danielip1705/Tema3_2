package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	//declaramos la funcion scanner como estatica para que se utilize en toda la clase
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable double e inicializamos num1, num2 y res(inicializado a 0)
		double num1, num2, res = 0;

		// Creamos la variable int e inicializamos ops
		int ops;

		// Creamos el objeto oper con el constructor sin parametros
		Operaciones oper;

		// iniciamos bucle do-while
		do {
			// llamamos a la funcion menu
			ops = menu();
			// llamamos a la funcion pideNumero
			num1 = pideNumero();
			num2 = pideNumero();

			// Con el objeto, llamamos a el constructor con parametros para declarar los valores
			oper = new Operaciones(num1, num2);
			
			// iniciamos switch con ops
			switch (ops) {
			
			// El caso 0 se indicara que es el FIN del programa
			case 0:
				System.out.println("FIN");
				break;
			// El caso 1 nos hara la operacion suma
			case 1:
				
				// declaramos con res el resultado de la suma con la funcion suma
				res = oper.Suma();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
				
			// El caso 2 nos hara la operacion resta
			case 2:
				
				// declaramos con res el resultado de la resta con la funcion resta
				res = oper.Resta();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
			// El caso 3 nos hara la operacion multiplicacion
			case 3:
				
				// declaramos con res el resultado de la multiplicacion con la funcion
				// multiplicación
				res = oper.Multiplicación();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
				
			// El caso 4 nos hara la operacion division
			case 4:
				
				// declaramos con res el resultado de la division con la funcion división
				res = oper.División();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
				
			// El caso 5 nos hara la operacion maximo
			case 5:
				
				// declaramos con res el resultado del numero maximo con la funcion máximo
				res = oper.Máximo();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
				
			// El caso 6 nos hara la operacion minimo
			case 6:
				
				//declaramos con res el resultado del numero minimo con la funcin minimo
				res = oper.Mínimo();
				
				// imprimimos en consola el resultado
				System.out.println("Resultado: " + res);
				
				// rompemos la condicion
				break;
				
			//default nos indicara que si el numero no esta entre el 1-6 que elija otra opcion
			default:
				
				//imprimimos en pantalla los numeros que se admiten
				System.out.println("Solo se admiten los numeros:");
				
				//llamamos con ops la funcion menu
				ops = menu();
				
			}//Fin switch
			//finalizamos el bucle si el usuario marca 0 en ops
		} while (ops != 0); 
		
		//cerramos scanner
		sc.close();
	}

	//Iniciamos funcion menu
	static int menu() {
		
		//Declaramos con la variable int ops
		int ops;
		
		//imprimimos menu en la consola y que introduzca una opcion
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.println("Introduzca un numero para realizar su operación");
		
		//escribe la opcion
		ops = sc.nextInt();
		
		//devolvemos opcinoes
		return ops;
	}
	//Declaramos la funcion pideNumero
	static double pideNumero() {
		
		//Declaramos con la variable double num e inizializamos a 0
		double num = 0;
		
		//Declaramos con la variable boolean seguir e inizializamos a true
		boolean seguir = true;
		
		
		//Iniciamos bucle do-while
		do {
			
			//Iniciamos try
			try {
				
				//imprimimos en pantalla que inserte un numero
				System.out.println("Introduzca un numero");
				
				//escribimos num
				num = sc.nextDouble();
				
				//Limpiamos el salto de linea
				sc.nextLine();
				
				//inicializamos false en seguir
				seguir = false;
				
				
			//Inicamos catch y que detecte si se escribe letras en vez de numero
			} catch (InputMismatchException e) {
				
				//imprimimos en consola el error
				System.out.println("El dato introducido es erroneo");
				
				//limpiamos la variable
				sc.nextLine();
				
			}//fin catch
			//se termina el bucle si seguir es falso
		} while (seguir);
		
		//devolvemos num
		return num;

	}
}
