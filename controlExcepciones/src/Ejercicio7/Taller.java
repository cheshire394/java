package Ejercicio7;

import java.util.ArrayList;
import java.util.TreeSet;

public  class Taller { 

	private ArrayList<coches> coches = new ArrayList<>();  
	private TreeSet<clientes> clientes = new TreeSet<clientes>(); 
	private TreeSet<empleados> empleados = new TreeSet<empleados>();
	
	
	public Taller(ArrayList<coches> coches, TreeSet<clientes> clientes,
			TreeSet<empleados> empleados) {
		super();
		this.coches = coches;
		this.clientes = clientes;
		this.empleados = empleados;
	}
	
	
	public ArrayList<coches> getCoches() {
		return coches;
	}
	public void setCoches(ArrayList<coches> coches) {
		this.coches = coches;
	}
	public TreeSet<clientes> getClientes() {
		return clientes;
	}
	public void setClientes(TreeSet<clientes> clientes) {
		this.clientes = clientes;
	}
	public TreeSet<empleados> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(TreeSet<empleados> empleados) {
		this.empleados = empleados;
	} 
	
	
	
	
	
}
