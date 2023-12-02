package ejercicio2;

public class Rectangulo {
	double ancho;
	double alto;

	public Rectangulo() {
	}

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	double perimetro() {

		return ancho * 2 + alto * 2;
	}

	double area() {
		return alto * alto;
	}

}
