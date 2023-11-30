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
	
	 double Suma() {
		return num1+num2;
	}
	 double Resta() {
		return num1-num2;
	}
	 double Multiplicación() {
		return num1*num2;
	}
	 double División() {
		 
		return num1/num2;
	}
	 double Máximo() {
		return num1>=num2 ? num1 : num2;
	}
	 double Mínimo() {
			return num1<num2 ? num1 : num2;
	}
	
}
