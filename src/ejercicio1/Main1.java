package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double num1, num2, res=0;
		int ops;
		Operaciones oper;
		do {
		ops = menu();
		num1 = pideNumero();
		num2 = pideNumero();
		oper = new Operaciones(num1, num2);
			switch (ops) {
			case 0:
				System.out.println("FIN");
				break;
			case 1:
				res = oper.Suma();
				System.out.println("Resultado: "+res);
				break;
			case 2:
				res = oper.Resta();
				System.out.println("Resultado: "+res);
				break;
			case 3:
				res = oper.Multiplicación();
				System.out.println("Resultado: "+res);
				break;
			case 4:
				res = oper.División();
				System.out.println("Resultado: "+res);
				break;
			case 5:
				res = oper.Máximo();
				System.out.println("Resultado: "+res);
				break;
			case 6:
				res = oper.Mínimo();
				System.out.println("Resultado: "+res);
				break;
			default:
				System.out.println("Solo se admiten los numeros:");
				ops =menu();
			}
		} while (ops != 0);
		sc.close();
	}

	// Menu
	static int menu() {
		int ops;
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.println("Introduzca un numero para realizar su operación");
		ops = sc.nextInt();
		return ops;
	}

	static double pideNumero() {
		double num = 0;
		boolean seguir = true;
		do {
			try {
				System.out.println("Introduzca un numero");
				num = sc.nextDouble();
				sc.nextLine();
				seguir = false;

			} catch (InputMismatchException e) {
				System.out.println("El dato introducido es erroneo");
				sc.nextLine();
			}
		} while (seguir);
		return num;

	}
}
