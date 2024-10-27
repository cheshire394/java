
public class arraysObj1Alumnos {
	/*Ejercicio 1
	Se quiere almacenar información acerca de los alumnos de una clase.
	Para cada Alumno se desea almacenar la siguiente información: 
	dni, nombre, el año de nacimiento, la nota del alumno, el tipo de estudios,
	pudiendo introducir 1 si el alumno estudia FPB, 2 si estudia CFGM ó 3 
	si estudia un CFGS (investigar sobre el tipo de dato enum).*/

	private String dni; 
	private String nombre; 
	private int nacimiento; 
	private double nota; 
	private static int contadorAlumnos=0;


	//enum actua como una clase dentro de una clase, y sus valores son CONSTANTES siempre 
	//como clase que es, debe aparecer con mayusculas.

	




	//enum se utiliza cuando tenemos un objeto con atributos FIJOS/CONSTANTES EN COMUN
	//por eso, codigo tiene que tenerlo todos los objetos, porque todos sus atributos
	//son compartidos con todos los objetos.
	enum Nivel_formativo {

		//tiene sus propios atributos, separados por paramentros
		//digamos que en este ejemplo FPB sería los objetos y 1,2 3 sus atributos
		FPB(1), FPGM(2), FPGS(3);

		//creamos sus propios atributos, que pertenecen a sus objetos
		private int codigo;
		
		
		//Tiene su propios "constructor"
		Nivel_formativo(int codigo){
			this.codigo = codigo;	
			
		}
		
	
		
		

		

		//tiene sus propios getter, PERO SETTER NO! porque son CONSTANTES.
		public int getCodigo() {
			return codigo;
		}
		
	
		
		

	    //• Un método que muestre los alumnos que pertenecen a un nivel 
	   // 	que será pasado como parámetro.

		public void mostrarNivel (int codigo) {
		
			
		}



	}

	//DE CLASE
	
	//CONSTRUCTOR POR DEFECTO, al cuál asignamos 5 alumnos como minimo
	//que solo se utilizaran si la clase tiene menos de 5 alumnos, creara
	//tantos alumnos como sean necesario para llegar al min de 5 alumnos
	public arraysObj1() {

		if (arraysObj1Clase.getContadorAlumnos() < 5) {
			this.dni = "000000-A";
			this.nombre = "Anonimo";
			this.nacimiento = 000;
			this.nota = 0; 
			contadorAlumnos ++;
		}
	}
	
	//constructor con parametros 
	public arraysObj1(String dni, String nombre, int nacimiento, double nota) {

		this.dni = dni;
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.nota = nota;
		contadorAlumnos++;
	}


	//getter y setter
	
	public static int getContadorAlumnos() {
		return contadorAlumnos;
	}

	public static void setContadorAlumnos(int contadorAlumnos) {
		arraysObj1.contadorAlumnos = contadorAlumnos;
	}

	public String getDni() {
		return dni;
	}

	

	public String getNombre() {
		return nombre;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public double getNota() {
		return nota;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
	
	//DE CLASE
	 //• Un método que devuelva el número máximo de alumnos 
	   // que pueden pertenecer a dicha clase.

		

	//DE CLASE
	   // • Un método que indique cuántos alumnos
	   //  hay actualmente asignados a dicha clase.

	public static void numAlumnos () {
		System.out.println(arraysObj1.getContadorAlumnos());
	}

	
	
	// DE ALUMNO
	  // • Un método que permita dar de alta un alumno en la clase.
	
	public void agregarAlumno (String dni, String nombre, int nacimiento) {
		this.setDni(dni);
		this.setNacimiento(nacimiento);
		this.setNombre(nombre);
		
	}

	//DE ALUMNO
	   // • Un método que permita calificar a un alumno (ponerle una nota).

	public void agregarNota (double nota) {
		
		this.setNota(nota);
	}



	 


	//DE ALUMNO
	  //  • Un método que permita borrar a un alumno.

		public void eliminarAlumno (String dni) {
			if(dni.equals(dni)) {
				this.setDni(null);
				this.setNacimiento(-1);// este dato es de tipo int
				this.setNombre(null);
				arraysObj1.setContadorAlumnos(contadorAlumnos - 1);
				System.out.println("Alumno "+dni+" eliminado con exito");
			}
			else System.out.println("El dni "+dni+" NO existe en nuestra BBDD");
		}



		//DE ALUMNO
	   /* • Un método que permita cambiar el nivel a un alumno.
	     Se le pasará como parámetro el dni del alumno a modificar
	     y el nuevo nivel a asignar.*/

		public void cambiarNivel (String dni, String nivel) {
			if (dni.equals(this.getDni())) {
				
				
			}
			
		}


		//DE ALUMNO
	    //• Un método que muestre los alumnos que han nacido
	    // después de un determinado año pasado como parámetro.

		public void mostrarNacimiento(int nacimiento) {
			if(this.getNacimiento() > nacimiento) {
				System.out.println("Los alumnos nacidos después de "+nacimiento+ " son:");
				System.out.println(this.getNombre() +" nacido en: "+this.getNacimiento());
			}
			
		}


		//de clase
	   // • Un método que calcule la nota media de la clase.

		public double notaPromedio () {
		
		}


	    //• Un método que muestre los alumnos ordenados de menor a mayor
	     //por año de nacimiento.

		public void ordenarAlumnos() {
			
		}


		

	public static void main(String[] args) {




	/*Se creará un método para pedir los datos de cada alumno al usuario, 
	de tal manera que haremos uso del modelo Vista-Controlador.
	La Vista nos servirá para pedir los datos al usuario,
	por lo que tendremos un paquete llamado vista con un método pedirDatos() 
	
	que devolverá un objeto de tipo Alumno con los valores de los atributos rellenos.
	Otro paquete llamado modelo donde estarán las clases Alumno y Clase.
	Y otro paquete llamado control donde estará 
	la clase testClase donde probaremos nuestras clases.
		 */

	}

}
