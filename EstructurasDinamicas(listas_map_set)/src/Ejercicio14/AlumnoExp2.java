package Ejercicio14;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;



/*/*Disponemos de la clase AlumnoExp que extiende la clase Alumno (dni,
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
	

public class AlumnoExp2 extends Alumno implements Comparable<AlumnoExp2> {


	    private Map<String, Float> asignaturas;
	    private Alumno alumno; 
	    
	    
	   
		public AlumnoExp2(String dni, String nombre, Map<String, Float> asignaturas) {
			super(dni, nombre);
			this.asignaturas = asignaturas;
		}
		
		public AlumnoExp2(Alumno alumno, Map<String, Float> asignaturas) {
			this.alumno = alumno;
			this.asignaturas = asignaturas;
		}

		// Getters y setters

	    public Map<String, Float> getAsignaturas() {
	        return asignaturas;
	    }

	    public void setAsignaturas(Map<String, Float> asignaturas) {
	        this.asignaturas = asignaturas;
	    }
	    
	    
	    public Alumno getAlumno() {
			return alumno;
		}

		public void setAlumno(Alumno alumno) {
			this.alumno = alumno;
		}

	
		@Override
		public int compareTo(AlumnoExp2 o) {
			// TODO Auto-generated method stub
			return 0;
		}
	    
	



	@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(asignaturas);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			AlumnoExp2 other = (AlumnoExp2) obj;
			return Objects.equals(asignaturas, other.asignaturas);
		}

	@Override
		public String toString() {
			return "AlumnoExp2 [asignaturas=" + asignaturas + ", toString()=" + super.toString() + "]";
		}
	
	
	/*	Programar dentro de AlumnoExp un método calificar(String, Float) que
	incluya en el expediente del alumno esa nota para ese código de
	asignatura. Si la asignatura ya tiene nota, debe sustituirla por el nuevo
	valor.
	*/
	
	public void calificar(String asignatura, float nota) {
		
	this.getAsignaturas().put(asignatura, nota);
		
		
	}
	
	
	/*Escribir un método media para que el atributo notaMedia se actualice y
	refleje la nota media del expediente. Hacer que la media se actualice cada*/
	
	public double  notaMedia(Map<String, Float> map) {
		double media = 0.0; 
		float suma = 0; 
		for(Entry<String, Float> cp : map.entrySet()) {
			
			String clave = cp.getKey();
			Float  valor = cp.getValue();
			suma += valor; 
		}
		media = suma / map.size();
		System.out.println("Nota media: ");
		return media; 
	}

	
	
	
	public static void main(String[] args) {
		
		TreeMap<String, Float> asignaturas= new TreeMap <>(); 
		Alumno alumno1 = new Alumno("504893","Manuel");
		AlumnoExp2 exp1 = new AlumnoExp2(alumno1, asignaturas);
		exp1.calificar("Mates", 5.5f);
		exp1.calificar("ingles", 3.5f);
		System.out.println(exp1.notaMedia(exp1.getAsignaturas()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
