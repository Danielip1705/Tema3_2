package ejercicio3;

public class Circulo {
	double radio;

	public Circulo() {

	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	double Circunferencia() {
		return radio*Math.PI*2;
	}
	double area() {
		return Math.PI*(radio*radio);
	}
}
