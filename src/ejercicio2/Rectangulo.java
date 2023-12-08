package ejercicio2;

public class Rectangulo {

	// creamos los atributos ancho y alto
	double ancho;
	double alto;

	// creamos el contructor sin parametros
	public Rectangulo() {
	}

	// creamos un constructor con parametros para insertar los valores de la clase
	// main
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	// creamos la funcion perimetro
	double perimetro() {

		// devolvemos el calculo del perimetro segun los datos introducidos
		return ancho * 2 + alto * 2;
	}

	// creamos la funcion area
	double area() {

		// devolvemos el calculo del area segun los datos introducidos
		return alto * alto;
	}

}
