import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		//creamos los objetos emleados
		/*Empleado empleado1 = new Empleado("paco gómez", 1500, 1994, 7, 27);
		Empleado empleado2 = new Empleado("Jessi", 2500, 1986, 11, 27);
		Empleado empleado3 = new Empleado("Maria martn", 900, 1995, 12, 27); 


		//ahora vamos a subirle el sueldo a jessi con el setter que hemos programado abajo:
		empleado2.setSubirSueldo(10);
		empleado3.setSubirSueldo(5);

		//imprimimos el sueldo:
		System.out.println("el sueldo de "+ empleado2.getNombre()+ " es de "+ empleado2.getSueldo()+ "La fecha de alta: "+empleado2.getAlta_contrato());
		System.out.println("El sueldo de "+ empleado1.getNombre()+ " es de " + empleado1.getSueldo());*/


		//ASI ES OTRA FORMA DE IMPRIMIR LO QUE HEMOS COMENTADO ARRIBA:

		//creamos el array como un objeto iterable
		//nombre clase donde estan los métodos
		Empleado [] misEmpleados = new Empleado [3];

		misEmpleados [0] = new Empleado("paco gómez", 1500, 1994, 7, 27);
		misEmpleados [1] = new Empleado("Jessi", 2500, 1986, 11, 27);
		misEmpleados [2] = new Empleado("Maria martn", 900, 1995, 12, 27);

		//Aqui les estamos subiendo el sueldo:
		for (int i = 0; i<3; i++) {
			misEmpleados[i].setSubirSueldo(5);
		} // aque estamos imprimiendo los resultados:
		for (int i = 0; i<3; i++) {
			System.out.println("el empleado "+ misEmpleados[i].getNombre()+ "tiene un sueldo de " + misEmpleados[i].getSueldo()) ;
		}

	}//cierre main

	//solamente una clase tendra el metodo main y tendrá el método public
	class Empleado{ 

		//creamos las variables con private:
		private String nombre; 
		private double sueldo;
		private Date alta_contrato;

		// creamos el método contructor con el nombre de la clase, y le pasamos los paramentros
		public Empleado (String nom, double p_sueldo, int anyo, int mes, int dia) {

			//atributos + parametros:
			nombre = nom;
			sueldo = p_sueldo;
			//el calendario es creado e importado de utildirectamente de la libreria java
			GregorianCalendar calendario = new GregorianCalendar (anyo, mes-1, dia);
			alta_contrato = calendario.getTime();
		}

		//CREAMOS LOS GETTER Y LOS SETTER:
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getSueldo() {
			return sueldo;
		}

		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}

		public Date getAlta_contrato() {
			return alta_contrato;
		}

		public void setAlta_contrato(Date alta_contrato) {
			this.alta_contrato = alta_contrato;
		}
		//CREAMOS SETTER PARA SUBIR EL SUELDO (NO SALE DE LOS ATRIBUTOS)
		// con este setter estamos modificando el setter de sueldo.
		public void setSubirSueldo (double p_porcentaje) {

			// creamos una nueva variable que multipleca el sueldo x el porcentaje y lo divide entre 100
			double aumento = sueldo * p_porcentaje/100;
			//después al sueldo inicial le suma el aumento.
			sueldo += aumento;
		}

	}}






