package ejercicio3;

public class Circulo {
	// creamos el atributo radio
	double radio;

	// creamos un contructor sin parametros para crear el objeto
	public Circulo() {

	}

	// creamos un constructor con parametros para insertar los valores de la clase
	// main
	public Circulo(double radio) {
		this.radio = radio;
	}

	// creamos la funcion circunferencia
	double Circunferencia() {

		// devolvemos el calculo de la circunferencia segun el dato introducido
		return radio * Math.PI * 2;
	}

	// creamos la funcion area
	double area() {

		// devolvemos el resultado del area segun el dato introducido
		return Math.PI * (radio * radio);
	}
}
