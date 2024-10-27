import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// invocamos a la bibllioteca 
		Scanner terminal = new Scanner (System.in);
		
		//Ahora vamos a definir la variable como int y a pedir al usuario que ingrese el número:
		System.out.println("Ingrese el número de horas trabajadas: ");
		int horas = terminal.nextInt();
		
		terminal.close();
		
/* Programa que calcula el salario semanal de un empleado al que se le
paga 15 euros por hora si éstas no superan las 35 horas. Cada hora por
encima de 35 se considerará extra y se paga a 22 €. El programa pide las
horas del trabajador y devuelve el salario que se le debe pagar .*/
		//ZONA DE DECLARACIÓN DE VARIABLES:
		int horasextra, salario;
		
		//AHORA VAMOS A REALIZAR EL EJERCICIO:
		if (horas <= 35) {
			//multiplicamos las horas por 15 euros la hora:
			horas = horas * 15;
			System.out.println("El sueldo sin horas extra es de "+horas + "Euros");
		}
			else { //Es importante restar la jornada ordinaria, para que solo cálcule las horas extra:
				 horasextra = (horas - 35) * 22; 
				//ahora creamos una nueva variable para que nos calcule el total del salario:
				salario = horasextra + horas;
				System.out.println("el total de salaria a cobrar es " +salario + " euros. " + " Extra son "+horasextra + " y ordinarias "+horas+" Euros");
			}
		}
		
		
		
	}


