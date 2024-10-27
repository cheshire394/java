package Ejercicio10;

import Ejercicio10.Empleado.Tipo_empleado;

public class EmpleadoPropio extends Empleado{
	
	private int cod_emple; 
	
	
	
	//creamos constructo con atributos propios y heredados
	public EmpleadoPropio(String nombre, String dni, String direccion, String telefono, double beneficio,
			double horas,int cod_emple,Tipo_empleado clase_empleado) {
		super(nombre, dni, direccion, telefono, beneficio, horas, clase_empleado);
		this.cod_emple= cod_emple;
	}

	//generamos getter y setter propio de la clase

	public int getCod_emple() {
		return cod_emple;
	}


	public void setCod_emple(int cod_emple) {
		this.cod_emple = cod_emple;
	}


}
