package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double base, altura, res;
		int ops;
		Cilindro cil;
		
		do {
		base = pideRadioBase();
		altura = altura();
		ops =menu();
		cil = new Cilindro(base, altura);
		switch(ops) {
		case 0:
			System.out.println("FIN");
			break;
		case 1: 
			res = cil.volumen();
			System.out.println("Resultado del volumen: "+res);
			break;
		case 2:
			res= cil.altura;
			System.out.println("Resultado de la altura: "+res);
			break;
		default: 
			System.out.println("Solo se puede insertar las opciones 1[Volumen] 2[Área] y 0[Salir]");
			ops=menu();
		}
		}while(ops !=0);
		
		

	}

	static int menu() {
		int ops;
		System.out.println("1.Volumen");
		System.out.println("2.Área");
		System.out.println("0. Salir");
		System.out.println("Introduzca que operacion quieres hacer");
		ops = sc.nextInt();
		return ops;
	}

	static double pideRadioBase() {
		boolean seguir = true;
		double num1 = 0;
		do {
			try {
				System.out.println("Introduzca el numero de su radio");
				num1 = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar numeros");
				sc.nextLine();
			}
		} while (seguir);
		return num1;
	}

	static double altura() {
		boolean seguir = true;
		double num2 = 0;
		do {
			try {
				System.out.println("Introduzca el numero de la altura");
				num2 = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar numeros");
				sc.nextLine();
			}
		} while (seguir);
		return num2;
	}
}