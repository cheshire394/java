package Ejercicio7;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*Leer desde consola datos de alumnos separados por comas. El formato de
	cada línea es el siguiente: dni,nombre,nota.
	Insertar los alumnos en una lista List<Alumno> (implementad la clase
	Alumno).
	El programa debe permitir la posibilidad de leer más alumnos con igual
	formato e incorporar estos nuevos datos. Si un alumno ya está en la lista
	no debe aparecer dos veces, solo debe cambiar su nota.*/


public class Estudiante implements Comparable<Estudiante> {
	private String dni;
	private String nombre;
	private double nota;

	// Constructor
	public Estudiante(String dni, String nombre, double nota) {
		this.dni = dni;
		this.nombre = nombre;
		this.nota = nota;
	}



	// Getter y Setter para DNI
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// Getter y Setter para Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Getter y Setter para Nota
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}


	//implementamos el metodo compareTo para comparar los dnis de la lista


	@Override
	public int compareTo(Estudiante o) {

		return Double.compare(this.getNota(), o.getNota());
	}


	public int compareTo(String anotherString) {

		return dni.compareTo(anotherString);
	}




	public static boolean addAlumno(List<Estudiante> lista) {
		Scanner terminal = new Scanner(System.in);

		boolean add = false; // Indica si el alumno se ha añadido correctamente
		double nota = 0;

		// Primero vamos a comparar si el dni está en la lista, y si está, actualizamos su nota.
		System.out.println("Introduce un dni: ");
		String dni = terminal.nextLine();

		// Buscar el estudiante en la lista
		Estudiante encontrado = null;
		for (Estudiante cp : lista) {
			if (dni.equals(cp.getDni())) {
				encontrado = cp;
				break;
			}
		}

		if (encontrado != null) {
			// El alumno ya está registrado, actualizar su nota
			System.out.println("El alumno ya está registrado.");
			add = true; //por lo tanto cambiamos el valor de la variable
			System.out.println("Escribe la nota para actualizarla: ");
			nota = terminal.nextDouble();
			encontrado.setNota(nota);
		} else {
			// El alumno no está registrado, agregar un nuevo alumno a la lista
			System.out.println("Introduce el nombre completo del alumno: ");
			String nombre = terminal.nextLine();
			System.out.println("Introduce la nota del alumno: ");
			nota = terminal.nextDouble();

			Estudiante nuevoAlumno = new Estudiante(dni, nombre, nota);
			lista.add(nuevoAlumno);
			add = true;

		}
		System.out.println("¿El alumno se ha añadido o se encuentra en la lista?");
		return add;
	}


	public static void mostrarPorOrden(LinkedList<Estudiante>lista) {

		// Ordenar la lista de estudiantes por nota donde la muestras
		Collections.sort(lista, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante estudiante1, Estudiante estudiante2) {
				// Ordenar de forma descendente (de mayor a menor nota)
				return Double.compare(estudiante2.getNota(), estudiante1.getNota());}});

		System.out.println("*********** FOR EACH ASCENDETE*************");

		for(Estudiante cp:lista) {
			System.out.println(cp);
		}

		System.out.println("*************ITERATOR CON DESCENDING *********");
		//Como en este caso es LinkedList podemos usar descending, SINO no.

		Iterator<Estudiante> iteratorDesc = lista.descendingIterator();

		while(iteratorDesc.hasNext()) {
			System.out.println(iteratorDesc.next());
		}

		System.out.println("**************ITERATOR CON PREVIOUS***********");
		//importante, previos pertenece a ListIterator (NO A ITERATOR)
		ListIterator<Estudiante> iteratorPre = lista.listIterator(lista.size());

		while(iteratorPre.hasPrevious()) {
			System.out.println(iteratorPre.previous());
		}


		System.out.println("************* FOR DESCENDENTE **************");
		for (int i= lista.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

	}


	public static void mejorYpeor (List<Estudiante>lista) {
		double mejorNota = Collections.max(lista).getNota(); 
		double peorNota= Collections.min(lista).getNota();
		Estudiante mejorEstudiante = null, peorEstudiante = null; 

		//Si solo quisieramos sacar, la mejor o peor nota esto no seria necesario
		//pero queremos sacar quien es el mejor estudiante según su nota, y para 
		//ello tenemos que buscar que estudiante tiene esa nota.
		for(Estudiante cp :lista) {
			if(cp.getNota() == mejorNota) {
				mejorEstudiante = cp;

			}
			if(cp.getNota() == peorNota) {
				peorEstudiante = cp;
			}
		}  

		System.out.println("El/los  mejor estudiantes es:"+mejorEstudiante);
		System.out.println("El/los mejor estudiantes es:"+peorEstudiante);

	}



	//METODO LIGERAMENTE MEJORADO POR GPT, ahorramos dos variables y no dependemos de Collections

	public static void mejorYpeorGpt (List<Estudiante>lista) {

		Estudiante mejorEstudiante = lista.get(0);
		Estudiante peorEstudiante = lista.get(0);

		for(Estudiante cp : lista) {

			if(cp.getNota() > mejorEstudiante.getNota()) mejorEstudiante = cp;
			if(cp.getNota() < peorEstudiante.getNota()) peorEstudiante = cp;

		}
		System.out.println("El/los  mejor estudiantes es:"+mejorEstudiante);
		System.out.println("El/los mejor estudiantes es:"+peorEstudiante);


	}


	public static void modificarEstudiante (List<Estudiante>lista, String buscarDni) {

		Scanner terminal = new Scanner(System.in);



		Estudiante alumnoModificar = null; 
		boolean encontrado = false; 

		//vamos a buscarlo con iterator
		Iterator<Estudiante> it = lista.iterator();
		
		while(it.hasNext()) {
			alumnoModificar= it.next();

			if(alumnoModificar.getDni().equalsIgnoreCase(buscarDni)) {
				encontrado = true; 
				break;  //salimos del bucle pra que alumnoModificar se guarde como el alumno
				//que buscamos
			}

		}

		if(encontrado) {
			System.out.println("¿Escribe que atributo desdeas modificar: dni/nombre/nota: ");
			String atributo = terminal.nextLine();



			switch (atributo){

			
			case "dni": 
				System.out.println("Escribe  dni: ");
				atributo = terminal.nextLine();
				System.out.print("El dni "+ alumnoModificar.getDni());
				alumnoModificar.setDni(atributo);
				System.out.println(" se ha modificado a:  "+ alumnoModificar.getDni());
				break; 

			case "nombre":
				System.out.println("Escibre el nombre correcto:  ");
				atributo = terminal.nextLine();
				System.out.print("El nombre "+ alumnoModificar.getNombre());
				alumnoModificar.setNombre(atributo);
				System.out.println(" se ha modificado a:  "+ alumnoModificar.getNombre());
				break; 
			case "nota": 
				System.out.println("Escribe la nueva nota: ");
				double newNota = terminal.nextDouble();
				alumnoModificar.setNota(newNota); 
				System.out.println(alumnoModificar.getNombre()+" ahora tiene un "+ alumnoModificar.getNota());
				break;
			default :
				System.out.println("atributo introducido incorrectamente");}

		}//fin encontrado
		
		else System.out.println("El dni introducido no pertenece a ningún alumno listado");


	}




	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombre=" + nombre + ", nota=" + nota + "]";
	}



	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
		
		LinkedList<Estudiante> lista = new LinkedList<Estudiante>();

		//alumnos que ya estan en la lista antes de ejecutar los metodos
		Estudiante alumno3 = new Estudiante("11111111A", "Pedro", 7.0);
		Estudiante alumno4 = new Estudiante("22222222B", "María", 6.5);
		Estudiante alumno5 = new Estudiante("33333333C", "Juan", 9.0);
		Estudiante alumno6 = new Estudiante("44444444D", "Laura", 8.7);
		Estudiante alumno7 = new Estudiante("55555555E", "Ana", 7.8);

		lista.add(alumno3);
		lista.add(alumno4);
		lista.add(alumno5);
		lista.add(alumno6);
		lista.add(alumno7);

		//creamos un menu de opciones: 

		System.out.println("Bienvenido al menú introduce el número de la "
				+ "accion que desdea ejecutar");

		System.out.println("1. ver los estudiantes ordenados por notas");
		System.out.println("2. añadir un nuevo estudiante a la lista");
		System.out.println("3.conocer al estudiante con mejor y peor nota");
		System.out.println("4. modificar el atributo de un estudiante.");

	
		
		int aux;
	while(true) {
			
			System.out.println("Introduce 1/2/3 o 4, para salir cualquier letra");
			 aux = terminal.nextInt();
			 terminal.nextLine(); // Consumir el carácter de nueva línea
			
			switch(aux){
				
				case 1: mostrarPorOrden(lista);
				case 2: System.out.println(Estudiante.addAlumno(lista));
						break; 
						
				case 3: Estudiante.mejorYpeorGpt(lista);
						break;
				case 4: 
					System.out.println("Introduce el dni del estudiante: ");
					String buscarDni = terminal.nextLine();
					Estudiante.modificarEstudiante(lista, buscarDni);
					break; 
				default:
					System.out.println("Caracter de salida introducido");
					break; 
				
			}//fin switch
			
		
			if(aux == 0)break; //solo salimos del while si el usario introduce 0
			
		}
					
	System.out.println("FIN DEL PROGRAMA");

	

		

		//Estudiante.mejorYpeor(lista);
		
		
		//Estudiante.modificarEstudiante(lista, "11119911A");//modificar estudiante que NO EXISTE
		
		
		terminal.close();
		
	}

}


