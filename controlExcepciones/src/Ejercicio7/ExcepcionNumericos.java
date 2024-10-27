package Ejercicio7;

public class ExcepcionNumericos extends Exception{

	
	private int numero;
	

	public ExcepcionNumericos(int numero) {
		super();
		this.numero = numero;
	} 
	
	
	//metodo personalizado con return
	public int personalizdoNumeros() {
		
		return numero;
	}
	
	
	
}
