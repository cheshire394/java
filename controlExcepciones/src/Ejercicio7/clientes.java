package Ejercicio7;

import java.util.Scanner;
import java.util.TreeMap;

public  final class clientes extends Personas {


	private TreeMap<Integer, Integer> map = new TreeMap<>(); 
	private int codigoCoche; 







	public clientes() {
		super();
	}



	public clientes(int codigo, String dni, String nombreCompleto, int edad, int codigoCoche) {
		super(codigo, dni, nombreCompleto, edad);
		this.codigoCoche = codigoCoche;
		this.map = new TreeMap<Integer, Integer>(); 
		map.put(codigo, codigoCoche);
	}





	//getter y setter
	public TreeMap<Integer, Integer> getMap() {
		return map;
	}









	public void setMap(TreeMap<Integer, Integer> map) {
		this.map = map;
	}









	public Integer getCodigoCoche() {
		return codigoCoche;
	}









	public void setCodigoCoche(Integer codigoCoche) {
		this.codigoCoche = codigoCoche;
	}









	public  String requisitosDni(String dni) throws ExcepcionString {

		if(!dni.matches("^(0?[0-9]{8})[A-Z]$"))throw new ExcepcionString(2); //cod 2 de metodo perosnalizado String


		return dni;



	}


	//Estra vez vamos a lazar la escepcion desde el propio metodo (por variar...)
	public String requisitosNombre(String nombre) throws ExcepcionString {

		if(!nombre.matches("[A-Za-z]+"))throw new ExcepcionString(3);


		return nombre; 
	}




	public int requisitosEdad(int edad) throws ExcepcionNumericos {



		if(edad < 18 )throw new ExcepcionNumericos(edad);



		return edad; 
	}







	@Override
	public String toString() {
		return "clientes [map=" + map + ", codigoCoche=" + codigoCoche + ", toString()=" + super.toString() + "]";
	}



	//int codigo, String dni, StringBuilder nombreCompleto, int edad, int codigoCoche)
	public void registrarCliente(Scanner terminal) {

	

		int codigo = 0; 
		String dni = null; 
		String nombre = null; 
		int edad = 0; 
		int  codigoCoche = 0; 
		boolean valido = false; 

		while(!valido) {

			try {
				System.out.println("Introduce codigo cliente: ");
				codigo = Integer.parseInt(terminal.nextLine());
				this.setCodigo(codigo);
				valido = true; 
				
				

			}catch(NumberFormatException e) {

				System.out.println("Se ha introducido una letra, vuelve a intentarlo...");
			}


		}

		valido = false; 

		while(!valido) {

			try {
				System.out.println("Introduce una edad (mayor de edad) : ");
				edad = Integer.parseInt(terminal.nextLine());
				this.setEdad(edad);
				edad= requisitosEdad(edad);
				valido = true;
				
				
			} catch (ExcepcionNumericos e) {
				e.personalizdoNumeros();
			}catch(NumberFormatException e) {
			System.out.println("Se ha introducido una letra, vuelve a intentarlo...");}

		}

		valido = false; 

		while(!valido) {
			
		try {
			System.out.println("Introduce codigo coche: ");
			codigoCoche = Integer.parseInt(terminal.nextLine());
			this.setCodigo(codigoCoche);
		
			valido = true; 
			
		}catch(NumberFormatException e) {
			System.out.println("Se ha introducido una letra, vuelve a intentarlo...");
		}
		}


		valido = false; 

		while(!valido) {
			try {
				//dni = terminal.nextLine(); 
				System.out.println("Introduce dni: ");
				dni= requisitosDni(terminal.nextLine());
				this.setDni(dni);
				valido = true;

			} catch (ExcepcionString e) {
				e.personalizadoString();
			} 
		}


		valido = false; 

		while(!valido)	{
			try {

				System.out.println("Inroduce nombre cliente: ");
				//nombre = terminal.nextLine();
				nombre = requisitosNombre(terminal.nextLine());
				this.setNombreCompleto(nombre);
				valido = true; 

			} catch (ExcepcionString e) {
				e.personalizadoString();
			} 


		}		



		//Creamos cliente..recuerda que tine dos constructores..aunque no añadimos MAP como lo haciamos en coches
		// el constructor lo hemos preparado para crear un Map con los datos del parametro

		System.out.println("cliente creado correctamente....");





	}











}
