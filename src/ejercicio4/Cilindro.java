package ejercicio4;

public class Cilindro {
	double radioBase;
	double altura;

	public Cilindro() {

	}

	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	double volumen() {
		return (radioBase*radioBase)*altura;
	}
	double area() {
		return 2*radioBase*(altura+radioBase);
	}

}
