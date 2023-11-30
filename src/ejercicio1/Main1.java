package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
	double num1, num2;
	int ops;
	Operaciones oper;
	ops = menu();
	
	num1 = pideNumero();
	num2 = pideNumero();
	oper = new Operaciones(num1,num2);
	
	switch() {
	
	}

	}

	// Menu
	static int menu() {
		int ops;
		Scanner sc = new Scanner(System.in);
		ops = sc.nextInt();
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		sc.close();
		return ops;
	}

	static double pideNumero() {
		double num=0;
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introduzca un numero");
				num = sc.nextDouble();
				sc.nextLine();
				seguir=false;
				
			}catch (InputMismatchException e) {
				System.out.println("El dato introducido es erroneo");
				sc.nextLine();
			} 
		}while(seguir);
		sc.close();
		return num;
		
	}
}
