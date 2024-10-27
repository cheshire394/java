package ejercicio9;

import ejercicio6.Persona;

public class Empresa {
	private Empleado empleados[];
	private int tama�o;
	private int contador;
	private int contadorPropios;
	
	public Empresa(int tama�o) {
		this.empleados = new Empleado[tama�o];
		this.tama�o = tama�o;
		this.contador = 0;
		this.contadorPropios = 0;
	}
	
	public void altaEmpleado(Empleado empleado) {
		if(contador<tama�o) {
			empleados[contador] = empleado;
			contador++;
			if(empleado instanceof EmpleadoPropio) {
				contadorPropios++;
			}
		}
	}
	
	public void ficharEmpleado(int numEmpleado, int horas) {
		for (int i = 0; i < this.contador; i++) {
			if(empleados[i].getNumEmpleado() == numEmpleado) {
				int horasPrevias = empleados[i].getHoras();
				empleados[i].setHoras(horasPrevias+horas);
			}
		}
	}
	
	public void repartoBeneficios(double cantidad) {
		double reparto = cantidad/contadorPropios; 
		for (int i = 0; i < this.contador; i++) {
			if(empleados[i] instanceof EmpleadoPropio) {
				double beneficioPrevio = empleados[i].getBeneficio();
				empleados[i].setBeneficio(beneficioPrevio+reparto);
			}
		}
	}
}
