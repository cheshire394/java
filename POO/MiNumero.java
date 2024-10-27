package Tema3_Orientado_a_Objetos;

public class MiNumero {

	//Atributos
	public double numero;

	//****************************************************************
	
	//Getter y Setter
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	//****************************************************************
	
	//Constructor que le pedimos el dato
	public MiNumero( double p_numero) {
		this.numero = p_numero;
	}

	//****************************************************************
	//Método doble
	public double doble() {
		return this.numero *2;
	}

	//Método triple 
	public double triple() {
		return this.numero *3;
	}

	//Método cuadrúple
	public double cuadruple() {
		return this.numero *4;
	}

	//Los métodos no llevan entre paréntesis ningun dato por que, quiero usar el que le doy al objeto
	//****************************************************************
	
	//Método main (principal)
	public static void main(String[] args) {

		//Creo el objeto con un valor
		MiNumero num = new MiNumero(20);

		//Imprimo por pantalla el resultado usando los métodos
		System.out.println("El doble es: " + num.doble());
		System.out.println("El triple es: " + num.triple());
		System.out.println("El cuadruple es: " + num.cuadruple());
	}

}
