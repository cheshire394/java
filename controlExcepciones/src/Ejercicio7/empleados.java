package Ejercicio7;

import java.util.Scanner;

public final class empleados extends Personas{ //no tiene hijos

	public empleados(int codigo, String dni, String nombreCompleto, int edad) {
		super(codigo, dni, nombreCompleto, edad);

	}

	public empleados() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "empleados [toString()=" + super.toString() + "]";
	}


	public int requisitosCodigoEmpleado(String Scodigo) throws ExcepcionesEmpleados {


		if(!Scodigo.matches("[0-9]+"))throw new ExcepcionesEmpleados(1); 

		this.setCodigo(Integer.parseInt(Scodigo));


		return this.getCodigo(); 
	}


	public String requisitosDniEmpleados(String dni) throws ExcepcionesEmpleados {

		if(!dni.matches("^[0-9]{8}[A-Z]$"))throw new ExcepcionesEmpleados(); //aqu usamos el parametro de personalizados....


		return dni; 
	}


	public String requisitosNombreEmpleado(String nombre) throws ExcepcionesEmpleados {


		if(nombre.length()< 3)throw new ExcepcionesEmpleados(1);
		if(nombre.length()> 10)throw new ExcepcionesEmpleados(2); //esta vez el codigo lo pasamos por parametro del metodo, no del constructor...
		if(!nombre.matches("[A-Za-z]+"))throw new ExcepcionesEmpleados(3);

		return nombre; 
	}


	public int requisitosEdadEmpleado (String Sedad) throws ExcepcionesEmpleados {

		//si edad no es numerico ya me lanzas la excepcion.
		//(equivale a edad = Integer.parseInt(terminal.nextInt) que lazan numberFormatException pero personalizada
		if(!Sedad.matches("[0-9]+"))throw new ExcepcionesEmpleados(1); 



		//si edad era numero vamos a comprobar los rangos, para ello primero debemos convertir en integer
		int edad = Integer.parseInt(Sedad);
		if(edad < 18)throw new ExcepcionesEmpleados(2);
		if(edad > 65)throw new ExcepcionesEmpleados(3);




		return edad;


	}


	public void registarEmpleado(Scanner terminal) {

	

		String Scodigo;

		String dni;
		String nombre;

		String Sedad; 

		boolean valido = false; 

		while(!valido) {

			try {

				System.out.println("Ingresa el codigo del empleado: ");
				Scodigo = terminal.nextLine(); 
				requisitosCodigoEmpleado(Scodigo); // el propio metodo asigna con setter el codigo...

				valido = true;

			} catch (ExcepcionesEmpleados e) {
				e.metodoPersonalizadoEmpleadosNumericos(); //el mensaje impreso sera el pasado por el constructor...donde se lanza la excepcion.
			}

		}

		valido = false; 


		while(!valido) {

			try {
				System.out.println("Introduce un dni: ");
				dni = terminal.nextLine();
				this.setDni(requisitosDniEmpleados(dni));
				valido = true; 

			} catch (ExcepcionesEmpleados e) {
				e.metodoPersonalizadoEmpleadosString(3);
			} 
		}

		valido = false; 


		while(!valido) {



			try {
				System.out.println("Introduce un nombre del empleado: ");
				nombre = terminal.nextLine(); 
				this.setNombreCompleto(nombre= requisitosNombreEmpleado(nombre));

				valido = true; 

			} catch (ExcepcionesEmpleados e) {
				e.metodoPersonalizadoEmpleadosString();


			}


		}

		valido = false; 


		while(!valido) {





			try {
				System.out.println("Introduce una edad entre 18 y 65 años: ");
				Sedad = terminal.nextLine(); 

				this.setEdad(requisitosEdadEmpleado(Sedad));
				valido = true; 

			} catch (ExcepcionesEmpleados e) {
				e.metodoPersonalizadoEmpleadosNumericos();
			}



		}

		valido = false; 

		System.out.println("Empleado registrado correctamente...");



	}


}
