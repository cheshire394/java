package Ejercicio8;

import java.util.*;

public class AlumnoExcepciones {

	/*
	 * Crea una clase Alumno con los atributos: nombre, edad y nota. Y el siguiente
	 * constructor, que deberá lanzar una excepción propia cuando la edad sea
	 * inferior a 0 (EdadNoValidaException con su propio mensaje de error). public
	 * Alumno(String nombre, int edad) … La clase tendrá los siguientes métodos: ●
	 * public float getNota() ● public void setNota(float nota) ● public String
	 * getNombre() ● public int getEdad()
	 * 
	 * El método setNota, no deberá asignar notas inferiores a 0 o superiores a 10,
	 * y se protegerá lanzando una excepción cuando la nota sea errónea
	 * (NotaNoValidaException, con su propio mensaje de error).
	 * 
	 * Crea una clase con un método main que lea desde teclado un array de 5 alumnos
	 * con sus notas y posteriormente muestre la información de cada uno de ellos.
	 * Se deberán capturar todas las excepciones que se pudieran generar y mostrar
	 * los mensajes correspondientes a cada tipo de excepción.
	 */

	// Atributos privados de la clase
	private String nombre;
	private int edad;
	private double nota;

	// Constructor para inicializar los atributos
	public AlumnoExcepciones(String nombre, int edad, double nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}

	// Getter y Setter para el atributo nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	// Getter y Setter para el atributo edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Getter y Setter para el atributo nota
	public double getNota() {
		return nota;

	}

	public void setNota(double nota) {
		this.nota = nota;

	}



	//REQUSITOS.................

	public static String requisitosNombre(String nombre) throws Letras {



		if(!nombre.matches("[A-Za-z]+"))throw new Letras("CONTRUCTOR");
		if(nombre.length()< 3)throw new Letras("CONSTRUCTOR"); 


		return nombre;
	}





	public static int requisitosEdad(int edad) throws ExcepcionEdad {


		if(edad < 0)throw new ExcepcionEdad( "EDAD NO VALIDA");


		return edad;
	}




	public static double requisitosNota(double nota)throws ExcepcionNota{

		if(nota < 0 || nota > 10)throw new ExcepcionNota(-5, "NOTA NO VALIDA");

		return nota;
	}






	public static AlumnoExcepciones[] pedirDatos(AlumnoExcepciones[] clase) {
		Scanner terminal = new Scanner(System.in);
		
		
			
		for (int i = 0; i < clase.length; i++) {
			
			String nombre = null;
			int edad = -1;
			double nota = -1;
	
			
			
			
			while (true) { // Bucle hasta que los datos sean correctos
			
		
				try {
					// Intento de obtener y validar el nombre
					System.out.println((i + 1) + " Introduce un nombre: ");
					nombre = terminal.nextLine();
					nombre = requisitosNombre(nombre); // Esto puede lanzar una excepción si el nombre no es válido
				 

					
						// Intento de obtener y validar la edad
						System.out.println((i + 1) + " Introduce una edad: ");
						edad = Integer.parseInt(terminal.nextLine());
						edad = requisitosEdad(edad); // Esto puede lanzar una excepción si la edad no es válida
						

				
						
						// Intento de obtener y validar la nota
						System.out.println((i + 1) + " Introduce una nota: ");
						nota = Double.parseDouble(terminal.nextLine());
						nota = requisitosNota(nota); // Esto puede lanzar una excepción si la nota no es válida
						
				
						
						
						
						break; //salimos del bucle while solo cuando ningun catch salto
					


				}catch(ExcepcionNota notaNovalida) {
						notaNovalida.mostrarExcepcionNota(nota);
					
				}catch(ExcepcionEdad edadNoValida)	{
						edadNoValida.miExcepcionPersonalizada();
					

				}catch(Letras nombreNovalido) {
					nombreNovalido.metodoPersonalizadoVoid();
					System.err.println(nombreNovalido.metodoPersonalizadoReturn());

				}catch (NumberFormatException nfe) {
					System.out.println("Error de formato: La edad o la nota deben ser numéricos. Inténtalo de nuevo.");
				} catch (Exception e) {
					System.out.println("Error al validar los datos: " + e.getMessage() + " Inténtalo de nuevo.");
					// Se mantiene dentro del bucle, pidiendo que se corrijan los datos
				}
			}
			
			//Si ninguna excepcion fue capturada entonces se crea el objeto
			//IMPORTANTISMO PARA NO ENTRAR EN BUCLE CREARLO FUERA DEL WHILE..SINO FOR TE ENTRA EN BUCLE
			
			clase[i] = new AlumnoExcepciones(nombre, edad, nota);
			System.out.println("alumno creado.................");
		}

	
		return clase;
	}




	//mostra datos

	@Override
	public String toString() {
		return "AlumnoExcepciones [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}

	public static  void mostrarArray(AlumnoExcepciones [] clase) {


		AlumnoExcepciones [] Mostrarclase = pedirDatos(clase); 

		

			System.out.println(Arrays.toString(clase));
		


	}

}
