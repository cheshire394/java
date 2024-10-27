package Ejercicio14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class EmpleadosGpt {

	/*Supongamos que tenemos la clase EmpleadoExp que extiende la clase Empleado y 
	 * añade un atributo Map<String, Integer> para almacenar la cantidad de horas 
	 * trabajadas por cada proyecto. El objetivo es implementar un método registrarHoras(String proyecto, int horas)
	 *  que permita registrar las horas trabajadas en un proyecto específico para un empleado
	 * y calcular automáticamente el total de horas trabajadas por el empleado.*/



	private String id;
	private String nombre;

	public EmpleadosGpt(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}





	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	





	
	public String toString() {
		return "\nid=" + this.getId() + ", nombre=" + this.getNombre();
	}


	



}
