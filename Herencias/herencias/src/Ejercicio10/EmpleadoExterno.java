package Ejercicio10;

import Ejercicio10.Empleado.Tipo_empleado;

public class EmpleadoExterno extends Empleado{
	
private int cod_emple; 
private String empresa; 	
	
	
	//creamos constructo con atributos propios y heredados
	public EmpleadoExterno(String nombre, String dni, String direccion, String telefono, double beneficio,
			double horas,int cod_emple, String empresa,Tipo_empleado clase_empleado) {
		super(nombre, dni, direccion, telefono, beneficio, horas,clase_empleado);
		this.cod_emple= cod_emple;
		this.empresa=empresa; 
	}



//generamos gtter y setter propios de la clase

	public int getCod_emple() {
		return cod_emple;
	}


	public void setCod_emple(int cod_emple) {
		this.cod_emple = cod_emple;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


}
