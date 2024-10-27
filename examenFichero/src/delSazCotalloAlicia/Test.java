package delSazCotalloAlicia;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {

		Empleado emp1 = new Empleado(1, "FERNANDEZ", 10, 1000.45);
		Empleado emp2 = new Empleado(2, "GIL", 20, 2400.60);
		Empleado emp3 = new Empleado(3, "LOPEZ", 10, 3000.0);
		Empleado emp4 = new Empleado(4, "RAMOS", 10, 1500.56);
		Empleado emp5 = new Empleado(5, "SEVILLA", 30, 2200.0);
		Empleado emp6 = new Empleado(6, "CASILLAS", 30, 1435.87);
		Empleado emp7 = new Empleado(7, "REY", 20, 2000.0);
		
		try {
			Fichero.cargarFicheroAleatorio(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
			Imprimir.imprimirFichero();
			Imprimir.imprimirEmpleado(5);
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido crear el fichero o no existe, revisa la ruta");
		} catch (IOException e) {
			System.out.println("Error al leer/escribir en el fichero");
		} finally {
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	
}
