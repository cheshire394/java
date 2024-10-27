package Ejercicio7;

import java.util.Objects;

public  abstract class Personas  implements Comparable<Personas> {  //no crea objetos (los crean sus hijos)

	private String dni; 
	private int codigo; 
	private int edad;
	private String telefono; 
	String nombreCompleto; 

	
	
	
	public Personas() {
		super();
	}



	public Personas(int codigo, String dni, String nombreCompleto, int edad) {
	
		this.codigo = codigo;
		this.edad = edad;
		this.nombreCompleto = nombreCompleto;
	}
	
	
	
	//compare too porque  tanto clientes como empleados seran almacenados en TreeSet.
	public int compareTo(Personas otraPersona) {
		
		if(this.getCodigo() > otraPersona.getCodigo()) return 1;
		
		else if(this.getCodigo() > otraPersona.getCodigo()) return -1;
		
		else  return 0;
		
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(codigo, dni, edad, nombreCompleto, telefono);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		return codigo == other.codigo && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(nombreCompleto, other.nombreCompleto) && Objects.equals(telefono, other.telefono);
	}





	//getter y setter
	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Personas [codigo=" + codigo + ", edad=" + edad + ", nombreCompleto=" + nombreCompleto + "]";
	}
	
	
	
	
	
}
