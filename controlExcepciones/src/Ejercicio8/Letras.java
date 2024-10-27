package Ejercicio8;

public class Letras extends Exception {

	private String msj; 
	private int cod;
	//private String nombre; 


	public Letras () {

	}

	

	public Letras(String msj) {
		//super(msj);
		this.msj = msj;
		
	}
	
	public Letras(String msj, int cod) {
		//super(msj);
		this.msj = msj;
		this.cod = cod;
		
	}

	public void  metodoPersonalizadoVoid() {
		
	System.out.println(this.msj + " "+ "SOY EL METODO PERSONALIZADO--> INTRODUCE AL MENOS 3 CARACTERES");
		
		
			
			
		}
	
	public String metodoPersonalizadoReturn() {
		return "Code: "+this.cod+", Mensaje del constructor en metodo personalizado: "+this.msj;
	}
	


}
