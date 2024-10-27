package Ejercicio7;

public class ExcepcionesEmpleados extends Exception {
	
	
	

	private int codigo; 
	
	private String mensaje = "Error Excepciones empleado: ";

	
	

	public ExcepcionesEmpleados() {
		super();
	} 
	

	
	public ExcepcionesEmpleados(int codigo, String mensaje) {
		super(mensaje);
		this.codigo = codigo;
		this.mensaje = mensaje;
	}




	
	
	public ExcepcionesEmpleados(int codigo) {
		super();
		this.codigo = codigo;
	}



	public void metodoPersonalizadoEmpleadosNumericos() {
		
		//en este metodo estamos usando el constructor, concretamente el que esta inmediatamente arriba
		
		if(codigo == 1) System.out.println("Error...se ha introducido una letra");
		if(codigo == 2) System.out.println("Error el empleado debe de ser mayor de edad");
		if(codigo == 3) System.out.println("Error el empleado no puede ser mayor de 65 años");
		
		
	}

	
	
	
	//ES MUCHISIMO MAS PRACTICO DAR CODIGOS CON EL CONSTRUCTOR.... PORQUE ES MAS ESPECIFICO..SI UTILIZAS ESTE FORMATO TE IMPRIME LOS METODOS
	//QUE INTRODUZCAS EN EL CATCH...PERO TODOS LOS QUE HAYA INDEPENDIENTEMENTE DE LA ESCEPCION QUE LA LANZO...
	//POR LO TANTO RECOMIENDO USAR EL SISTEMA QUE UTILIZA CODIGO CON CONTRUCTOR. Y QUE SE LANZA EN ESA EXCEPCION CONCRETA.
	public void metodoPersonalizadoEmpleadosString(int numero) {
		
	
		if(numero == 3) System.out.println(this.mensaje + "El dni introducido no es valido...intentalo de nuevo");
	}


	public void metodoPersonalizadoEmpleadosString() {
		
		if(codigo == 1 )System.out.println(this.mensaje + " El nombre introducido no puede ser menor a tres caracteres");
		if(codigo == 2)System.out.println(this.mensaje  + " El nombre introducido no puede ser mayor a 10 caracteres.");
		if(codigo == 3) System.out.println("El nombre introducido solo puede contener letras...intentalo de nuevo..");
	}

	
	
	
	
	
	
	
	
	
	

}
