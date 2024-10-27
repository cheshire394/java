package Ejercicio8;

public class ExcepcionNota extends Exception {

	



	private String msj;
	private double num; 
	
	
	
	
	public ExcepcionNota(double nota, String msj) {
	
		this.msj = msj;
		this.num = nota;
	}


	public void  mostrarExcepcionNota(double nota) {
		
			
	System.out.println(this.num + " error: nota: " + nota + " no valida, debe estar comprendida entre 0 y 10");
		
		
	}


}
