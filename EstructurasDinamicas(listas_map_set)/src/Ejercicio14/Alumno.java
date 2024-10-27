package Ejercicio14;

import java.util.Objects;

// Clase Alumno
	public class Alumno {
	    private String dni;
	    private String nombre;
	    private double notaMedia;

	    public Alumno(String dni, String nombre) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.notaMedia = 0.0;
	    }

	    public Alumno() {}
	    // Getters y setters
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

		@Override
		public int hashCode() {
			return Objects.hash(dni, nombre, notaMedia);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Alumno other = (Alumno) obj;
			return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre)
					&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
		}

		@Override
		public String toString() {
			return "Alumno [dni=" + dni + ", nombre=" + nombre + ", notaMedia=" + notaMedia + "]";
		}
	}

