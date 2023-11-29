package ejercicio1;

public class Operaciones {
	double num1, num2;
	
	public Operaciones() {
		
	}

	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	static double Suma() {
		Operaciones op = new Operaciones();
		return op.num1+op.num2;
	}
	static double Resta() {
		Operaciones op = new Operaciones();
		return op.num1-op.num2;
	}
	static double Multiplicación() {
		Operaciones op = new Operaciones();
		return op.num1*op.num2;
	}
	static double División() {
		Operaciones op = new Operaciones();
		return op.num1/op.num2;
	}
	static double Máximo() {
		Operaciones op = new Operaciones();
		double max= op.num1>op.num2 ? op.num1 : op.num2;
		return max;
	}
	static double Mínimo() {
		Operaciones op = new Operaciones();
		double min= op.num1<op.num2 ? op.num1 : op.num2;
		return min;
	}
	
}
