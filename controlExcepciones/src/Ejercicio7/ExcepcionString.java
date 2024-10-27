package Ejercicio7;

public class ExcepcionString extends Exception{
	
	
	private String msj_eror;
	private int codigo_error;
	
	
	//Constructor para matricula
	public ExcepcionString(int codigo_error) {
		super();
		this.codigo_error = codigo_error;
	}


	
	public ExcepcionString (String msj_eror) {
		super(msj_eror);
		
		this.msj_eror = msj_eror;
	} 
	
	
	//exclusivo para matricula
	public void personalizadoMatricula() {
		
		System.out.println("La matricula introducida debe contener 4 numeros y tres letras Mayusculas");
	}
	
	
	public void personalizadoString() {
		
		if(codigo_error == 1)System.out.println("El string contiene caracteres que no son letras");
		if(codigo_error == 2)System.err.print("dni no valido");
		if(codigo_error == 3)System.err.print("nombre introducido contiene caracteres no permitidos");
		
	}

}
