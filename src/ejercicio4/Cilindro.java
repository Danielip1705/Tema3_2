package ejercicio4;

public class Cilindro {
	
	//creamos los atributos radiobase y Altura
	double radioBase;
	double altura;

	//creamos constructor sin parametros para crear el objeto
	public Cilindro() {

	}

	// creamos un constructor con parametros para insertar los valores de la clase
	// main
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	//creamos funcion volumen 
	double volumen() {
		
		//devolvemos el calculo del volumen del cilindro segun los datos introducidos
		return Math.PI*(radioBase*radioBase)*altura;
	}
	
	//creamos la funcion area 
	double area() {
		
		//devolvemos el calculo del area del cilintro segundlos datos introducidos
		return 2*radioBase*(altura+radioBase);
	}

}
