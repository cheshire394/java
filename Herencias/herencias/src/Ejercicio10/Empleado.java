package Ejercicio10;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Ejercicio10.Empleado.Tipo_empleado;

public abstract class Empleado {

	

	//atriburos comunes en la clase principal
	private String nombre, dni, direccion, telefono;
	private double beneficio, horas; 
	private static Tipo_empleado clase_empleado;

	private Object EmpleadoPropio;

	private Ejercicio10.EmpleadoPropio[] Empleado;

	private int getCod_emple; 
	
	
	//CREAMOS ENUM PARA DEFINIR EL TIPO DE EMPLEADO
	
	protected enum Tipo_empleado {EmpleadoPropio, EmpleadoExterno};


	//constructor parametrizado
	
	

	public Empleado(String nombre, String dni, String direccion, String telefono, double beneficio, double horas, Tipo_empleado clase_empleado) {

		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.beneficio = beneficio;
		this.horas = horas;

	}



	public Empleado() {
		super();
	}



	public Tipo_empleado getClase_empleado() {
		return clase_empleado;
	}



	public void setClase_empleado(Tipo_empleado clase_empleado) {
		this.clase_empleado = clase_empleado;
	}



	//getter y setter
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getDni() {
		return dni;
	}





	public void setDni(String dni) {
		this.dni = dni;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	public String getTelefono() {
		return telefono;
	}





	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}





	public double getBeneficio() {
		return beneficio;
	}





	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}





	public double getHoras() {
		return horas;
	}





	public void setHoras(double horas) {
		this.horas = horas;
	}


	//metodos que operan 



	/*Ejercicio 10
En una empresa informática se guarda por cada empleado: nombre, dni,
dirección, teléfono, horas, beneficio. 





Hay dos tipos de empleados: propios
y externos. De cada empleado externo se guarda la empresa de la cual
procede. A cada empleado el programa le asigna un número para
identificarlo.
Realizar un programa en JAVA que me permita realizar las siguientes
operaciones:

a) Dar de alta un empleado. Se pide por teclado el tipo de empleado a
dar de alta y se anotan sus datos.


b) Fichar un empleado. Se anota el número del empleado y se pide el
número de horas realizadas, que se acumulan al empleado
correspondiente.
c) Reparto de beneficios. Se pide una cantidad por teclado y se
reparte a partes iguales entre todos los empleados propios.
d) Pagar a todos los empleados de la empresa, mostrando por
pantalla lo que se le paga a cada uno. A los empleados externos se
les paga a 22 euros la hora realizada, y a los propios se les paga una
cantidad introducida por teclado al dar de alta al empleado más 15
euros la hora realizada. Una vez pagado un empleado se ponen a
cero las horas realizadas y los beneficios.
e) Sortear un viaje entre todos los empleados.
f) Mostrar por pantalla la información que se mantiene en la empresa
de todos los empleados.
Los empleados se almacenan en un vector.*/


	//a) Dar de alta un empleado. Se pide por teclado el tipo de empleado a dar de alta y se anotan sus datos.
	



	public static void main(String[] args) {

		Scanner terminal = new Scanner (System.in); 
		
		// creamos constantes
		 final int NUM_EMPLEADOS = 4; 
			String clase_empleado; //hay que declararla fuera del do-while sino da problemas
			
		 
		 do { //HACER MIENTRAS NO SEA UNO DE LOS DOS TIPOS DE EMPLEADO
		 
		//creamos variables 
		 System.out.println("Escribe la clase de empleado que quieres dar de alta: EmpleadoExterno o EmpleadoPropio");
		 clase_empleado= terminal.nextLine(); 
		 
		 }while(!clase_empleado.equals("EmpleadoPropio") && !clase_empleado.equals("EmpleadoExterno"));
		 
		 
		 if(clase_empleado != null) {
			 
			 
		 }

		//creamos objeto empleados
		 //String nombre, String dni, String direccion, String telefono, double beneficio, double horas,int cod_emple, String empresa,Tipo_empleado clase_empleado
		 EmpleadoExterno emple1 = new EmpleadoExterno("Juan Pérez","12345678A","Calle Principal 123", "987654321",10,7,100,"ACME Inc.", Tipo_empleado.EmpleadoExterno);
		 EmpleadoPropio emple2 = new EmpleadoPropio("MANUEL Pérez","12345678A","C/cismeto 123", "987654321",10,7,100, Tipo_empleado.EmpleadoPropio); 
	
		
		
	
	
		
		
		terminal.close();

	}
	
}
