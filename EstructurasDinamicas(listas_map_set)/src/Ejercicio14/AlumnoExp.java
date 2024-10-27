package Ejercicio14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeSet;

public class AlumnoExp implements Comparable<AlumnoExp> {
	
	
	/*Disponemos de la clase AlumnoExp que extiende la clase Alumno (dni,
	nombre, notaMedia) y añade un atributo Map<String, Float> para
	almacenar el expediente académico. La clave del mapa será el código de
	cada asignatura, y el elemento Float será la nota.
	
	Programar dentro de AlumnoExp un método calificar(String, Float) que
	incluya en el expediente del alumno esa nota para ese código de
	asignatura. Si la asignatura ya tiene nota, debe sustituirla por el nuevo
	valor.
	
	Escribir un método media para que el atributo notaMedia se actualice y
	refleje la nota media del expediente. Hacer que la media se actualice cada
	vez que se califique cualquier asignatura.
	Hacer un programa que instancie un AlumnoExp. Además:
	● Ponerle un 7.6 en Lengua
	● Ponerle un 3.4 en Mates
	● Cambiarle la nota de Mates1 a 5.0
	
	● Mostrar el expediente del alumno
	● Mostrar la nota media del expediente del alumno.*/
	
	
	
	
	
	private String dni;
	private String nombre;
	private double notaMedia;
	private Map<String, Float> asignaturas;
	
	
	
	
	
	
	
	
	public AlumnoExp(String dni, String nombre,Map<String, Float> asignaturas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.notaMedia = 0.0;
		this.asignaturas = asignaturas;
	}





	//getter y setter
	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getNotaMedia() {
		return notaMedia;
	}




	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}




	public Map<String, Float> getAsignaturas() {
		return asignaturas;
	}




	public void setAsignaturas(Map<String, Float> asignaturas) {
		this.asignaturas = asignaturas;
	}



	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, dni, nombre, notaMedia);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlumnoExp other = (AlumnoExp) obj;
		return Objects.equals(asignaturas, other.asignaturas) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}


	public int compareTo (AlumnoExp alum) {
		
		if(this.getNotaMedia()< alum.getNotaMedia())return -1;
		else if (this.getNotaMedia()> alum.getNotaMedia())return 1;
		else return 0;
		
	}


	@Override
	public String toString() {
		return "AlumnoExp [dni=" + dni + ", nombre=" + nombre + ", notaMedia=" + notaMedia + ", asignaturas="
				+ asignaturas + "]";
	}


	/*	
	Programar dentro de AlumnoExp un método calificar(String, Float) que
	incluya en el expediente del alumno esa nota para ese código de
	asignatura. 
	Si la asignatura ya tiene nota, debe sustituirla por el nuevo
	valor.*/
	
	public void calificar (String cod, float nota) {
	
		//da igual que la asignatura contenga un valor o no lo contenga, si el ejecicio dice que 
		//en ese caso hay que actualizarlo, ya que si lo añadimos sobre esa clave. si no existe se 
		//va a añidir , y si existe se va actualizar. (si hubiera pedido que no se sustituya, en ese caso
		//si que habria que controlar si contiene o no contiene un valor.
		
		this.getAsignaturas().put(cod, nota);
		
		this.setNotaMedia(notaMedia());
		
		
	}
	
	public float  notaMedia () {
		
		Float notaMedia = 0.0f; 
		
		for(Entry<String, Float> cp : this.getAsignaturas().entrySet()) {
			
			String cod = cp.getKey();
			Float nota = cp.getValue(); 
			
			notaMedia+= nota;
			
			
			
		}
		
		notaMedia = notaMedia / this.getAsignaturas().size();
		
		return notaMedia; 
	}
	

	

	public static void main(String[] args) {
		
		TreeSet<AlumnoExp> clase = new TreeSet<>(); 
		HashMap<String, Float> asignaturas = new HashMap<>();
	
		
		
		AlumnoExp alumno1 = new AlumnoExp("50489319H", "Alicia", asignaturas);
		AlumnoExp alumno2 = new AlumnoExp("50469369S", "Marta", asignaturas);
		AlumnoExp alumno3 = new AlumnoExp("50489459L", "Humberta", asignaturas);
		
		//Añadimos alumnos a la clase
		clase.add(alumno1);
		clase.add(alumno2);
		clase.add(alumno3); 
		
		
		//damos notas a los alumnos
		alumno1.calificar("Mates", 7.7f);
		alumno1.calificar("Ingles", 5.5f);
		alumno1.calificar("Historia", 5.5f);
	
		System.out.println(	alumno1.toString());
		
		System.out.println();
		System.out.println("Modificamos la nota de Mates para ver como se actualiza: ");
		alumno1.calificar("Mates", 10f);
		System.out.println(	alumno1.toString());
		
	}

}
