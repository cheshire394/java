package Ejercicio8;

public class ExcepcionEdad extends Exception{
	


	private String msj;
	private int num = -3; 
	
	
	
	public ExcepcionEdad(String mensaje) {
		
		//super(mensaje);//hereda el mensaje de exception
		this.msj = msj;
		this.num = num; 
	}
	
	
	public ExcepcionEdad(int num, String msj) {

		this.msj = msj;
		this.num = num;
	}
	
	public void miExcepcionPersonalizada() {
		System.out.println(this.num+"La edad no puede ser negativa");
	}
	
	
	
}
