package Ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio7 {
	
	/*Crea tu propia clase de excepción utilizando la palabra clave extends.
	Dicha clase tendrá como atributo un String. Escribe un constructor para
	dicha clase que tome un argumento String. Escribe un método que
	muestre la cadena de caracteres almacenada. Crea una
	cláusula try-catch para probar la nueva excepción.*/

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
	try {	
		
		
		//creamos listas de los tres objetos
		
		ArrayList<coches> coches = new ArrayList();
		TreeSet<clientes> clientes = new TreeSet(); 
		TreeSet<empleados> empleados = new TreeSet(); 
		
		Taller miTaller = new Taller(coches, clientes, empleados); 
		
		
		
		
		
		//empleados........................................		
		
		
		empleados empleado1 = new empleados(); 
		
		empleado1.registarEmpleado(terminal);
		
		empleados.add(empleado1); 
		
		System.out.println(empleados);
		
		
		
		//clientes ..............................
		
		clientes cliente1 = new clientes();
		clientes cliente2 = new clientes();
		
		System.out.println("Registramos cliente 1: ");
		cliente1.registrarCliente(terminal);
		
		System.out.println("Registramos cliente 2: ");
		cliente2.registrarCliente(terminal);
		
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		System.out.println(clientes);
		
		
		
		//coches----------------------------------------------
				coches coche1 = new coches();
				coches coche2 = new coches();
				
				System.out.println("Registramos vehiculo 1: ");
				coche1.registrarCoche(terminal);
				
				System.out.println("Registramos veiculo 2: ");
				coche2.registrarCoche(terminal);
				
			
				//añadimos y mostramos el registro de los coches
				coches.add(coche1); 
				coches.add(coche2); 
				
				for(coches cp : coches) {
					System.out.println(cp);
				}
				
	}catch(Exception e) {
		System.out.println("Error general:  no contemplado en la excepciones...");
		e.printStackTrace();
	}finally {
		
		terminal.close(); 
	}

		
	
		
		

	}

}
