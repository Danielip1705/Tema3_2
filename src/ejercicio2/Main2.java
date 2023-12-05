package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) { //main
		int ops;
		double ancho, alto,res=0;
		Rectangulo rec;

		do {
			ancho = pideAncho();
			alto = pideAlto();
			ops= menu();
			rec = new Rectangulo(ancho, alto);
			
			switch (ops) {
			case 0:
				break;
			case 1:
			res = rec.perimetro();
			break;
			case 2:
			res = rec.area();
			break;
			default:
			System.out.println("Solo se adimite permite los numeros 1[Perímetro] y 2 [Área]");	
			}
			System.out.println("FIN");
		}while(ops !=0);
		
	}

	static int menu() { // Funcion Menu
		int ops;
		System.out.println("1.Perímetro");
		System.out.println("2.Área");
		System.out.println("0.Salir");
		System.out.println("Introduzca el numero de la operacion que quieras realizar");
		ops = sc.nextInt();
		return ops;
	}

	static double pideAncho() { // Funcion para pedir el ancho
		double ancho = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Inserta que ancho del rectangulo");
				ancho = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar un numero");
			}

		} while (seguir);

		return ancho;
	}

	static double pideAlto() { // Funcion para pedir el alto
		double alto = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Inserta el alto del rectangulo");
				alto = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar un numero");
			}

		} while (seguir);

		return alto;

	}
}
