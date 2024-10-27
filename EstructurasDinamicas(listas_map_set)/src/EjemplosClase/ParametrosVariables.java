package EjemplosClase;

import java.util.ArrayList;

public class ParametrosVariables {
	
	
	String nombre; 
	int edad; 
	
	
	
	
	
	public ParametrosVariables(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public static void pv(ParametrosVariables...obj) {
		
		ArrayList<ParametrosVariables> lista = new ArrayList<>(); 
		for(ParametrosVariables cp : obj) {
			lista.add(cp); }
		System.out.println(lista.toString());
	}

	
	public static void main(String[] args) {
	
		
		ParametrosVariables persona1 = new ParametrosVariables ("marcos", 21); 
		ParametrosVariables persona2 = new ParametrosVariables ("marcos", 21); 
		

	}

}
