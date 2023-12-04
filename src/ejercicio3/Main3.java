package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double radio,res;
		int ops;
		Circulo cir;
			do {
				radio=pideRadio();
				ops=menu();				
				cir= new Circulo(radio);
			switch(ops) {
			case 0:
				System.out.println("FIN");
				break;
			case 1:
				res = cir.Circunferencia();
				System.out.println("Resultado del circunferencia: "+res);
				break;
			case 2:
				res = cir.area();
				System.out.println("Resultado del área: "+res);
				break;
				default:
					System.out.println("Solo se puede insertar las opciones 1[Circunferencia] 2[Área] y 0[Salir]");
					ops=menu();
			}
		}while(ops!=0);

	}

	static int menu() {
		int ops;
		System.out.println("1.Circunferencia");
		System.out.println("2.Area");
		System.out.println("0. Salir");
		System.out.println("Introduzca que operacion quieres hacer");
		ops = sc.nextInt();
		return ops;
	}

	static double pideRadio() {
		boolean seguir=true;
		double num1=0;
		do {
			try {
				System.out.println("Introduzca el numero de su radio");
				num1 = sc.nextDouble();
				seguir = false;
			}catch (InputMismatchException e) {
				System.out.println("Solo se puede insertar numeros");
				sc.nextLine();
			}
		}while(seguir);
		return num1;
	

}
}
