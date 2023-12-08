package ejercicio1;

public class Operaciones {
	// creamos dos atributos para realizar las operaciones de las siguientes
	// funciones
	double num1, num2;

	// creamos un constructor sin parametros para crear el objeto
	public Operaciones() {
	}

	// creamos un constructor con parametros para insertar los valores de la clase
	// main
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Creamos funcion suma para realizar la operación
	public double Suma() {
		
		// devolvemos la suma de los atributos
		return num1 + num2;
	}

	// Creamos funcion suma para realizar la operación
	double Resta() {
		
		// devolvemos la resta de los atributos
		return num1 - num2;
	}

	// Creamos funcion suma para realizar la operación
	double Multiplicación() {
		
		// devolvemos la multiplicación de los atributos
		return num1 * num2;
	}

	// Creamos funcion suma para realizar la operación
	double División() {
		
		// devolvemos la division de los atributos
		return num1 / num2;
	}

	// Creamos funcion suma para realizar la operación
	double Máximo() {
		
		// devolvemos el máximo de los atributos
		return num1 >= num2 ? num1 : num2;
	}

	// Creamos funcion suma para realizar la operación
	double Mínimo() {
		
		// devolvemos el minimo de los atributos
		return num1 < num2 ? num1 : num2;
	}

}
