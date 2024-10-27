package Ejercicio6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Diseña un programa que almacene en una lista (elige la más conveniente)
de objetos de la clase Temperatura las temperaturas medias del mes de
Enero (31 días) que introduzca un usuario. Cada objeto tendrá los
siguientes atributos:

1. Número correspondiente al día del mes
2. Día de la semana
3. Temperatura media


Mostrar un menú que nos permita:
1. Rellenar las temperaturas.
2. Mostrar las temperaturas.
3. Visualizar la temperatura media del mes.
4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos
fueron:
El Jueves 3 con 40 grados.
El Sábado 5 con 40 grados.*/
public class Temperatura implements Comparable<Temperatura> {


	//atributos
	private int dia;
	private double temperatura; 
	private  DayOfWeek semana; 


	//constructor
	public Temperatura(int dia, double temperatura, DayOfWeek semana) {
		this.dia = dia;
		this.temperatura = temperatura;
		this.semana = semana;
	}



	public Temperatura() {
		super();
	}



	//getter y setter
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public  DayOfWeek getSemana() {
		return semana;
	}

	public void setSemana(DayOfWeek semana) {
		this.semana = semana;
	}


	//compareTO
	@Override
	public int compareTo(Temperatura o) {

		//importantisimo --> D con mayuscyla, convertir al tipo de variable
		return Double.compare(this.getTemperatura(),o.getTemperatura());
	}

	//METODOS QUE OPERAN

	//1.rellenar temperaturas

	public static void rellenar (List<Temperatura> lista) {

		Scanner terminal = new Scanner(System.in); 
		System.out.println("Escribe el mes que es (1 al 12) por ejemplo enero seria=  1 ");
		int mes = terminal.nextInt();

		for(int i = 1; i <= 3; i++) {

			//obtenemos automaticamente el día de la semana, e i representa el dia del mes.
			LocalDate fecha = LocalDate.of(2024, mes, i); 
			DayOfWeek semana = fecha.getDayOfWeek(); // Obtenemos el día de la semana

			System.out.println("Añade la temperatura del dia "+i+": ");
			double temperatura=terminal.nextDouble();

			//creamos un objeto que recoja la información
			Temperatura dia = new Temperatura(i,temperatura,semana);
			//añadimos el objeto a la lista
			lista.add(dia);
		}


	}





	//2.mostrar las temperaturas

	public  void mostrarTemperaturas(List<Temperatura>lista) {

		System.out.println("*********** MOSTRAT CON ITERATOR************");

		Iterator<Temperatura> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("*************ITERATOR REVERSE**************");
		//RECUERDA QUE descendingIterator() y descendingSet() NO ESTAN disponible para ArrayList o HashSet()
		//si esta disponible para LikenList y para TreeSet()

	//	lista.sort(Collections.reverseOrder()); //ORDENA SEGUN TEMPERATURA POR compareTo

		//iteramos la lista con orden invertido
		Iterator<Temperatura> iteratorReverse = lista.iterator();
		while(iteratorReverse.hasNext()) {
			System.out.println(iteratorReverse.next());

		}


		System.out.println("************MOSTRAR CON FOR-EACH**************");

		for(Temperatura cp : lista) {
			System.out.println(cp);
		}

		System.out.println("************MOSTRAR CON FOR**********************");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));

		}

		System.out.println("***************FOR REVERSE************************");

		//importante -1 y añadi >= a 0 para que imprima correctamente
		for(int i = lista.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));

		}
	}




	//3. Visualizar la temperatura media del mes.

	public static  double  promedio (List<Temperatura>lista) {
		double suma = 0;
		double promedio = 0; 


		// Sumar todas las temperaturas
		for (Temperatura cp : lista) {
			suma += cp.getTemperatura();
		}

		// Calcular el promedio
		if (!lista.isEmpty()) { // Asegurarse de que la lista no esté vacía para evitar división por cero
			promedio = suma / lista.size();
		}
		System.out.println("La temperatura promedio es: ");
		return promedio; 
	}


	//4.Día o días más calurosos del mes. Ejemplo: El día o días más calurosos

	public static double masCalor (List<Temperatura>lista) {
		//recoge la termperatura maxima de lista.
		double diaMasCaluroso = Collections.max(lista).getTemperatura();

		return diaMasCaluroso;
	}


	public static double menosCalor (List<Temperatura> lista) {

		double menosCalor = Collections.min(lista).getTemperatura();

		return menosCalor;



	}

	//METODOS ADICIONALES
	//revisar metodo, dependiendo del dia que le pases funciona correctamente o no
	public static double conocerTemperatura (List<Temperatura> lista, int dia) {
		double obtenerTemperatura = 0;

		if(dia > 31 || dia < 1 || lista.isEmpty()) {
			System.out.println("Dia introducido no válido o no registrado");
		}
		else {
			System.out.println("La temperatura del dia "+ dia+" es: ");



			obtenerTemperatura = lista.get(dia).getTemperatura();


		}
		return obtenerTemperatura;
	}







	@Override
	public String toString() {
		return "Temperatura [dia=" + dia + ", temperatura=" + temperatura + ", semana=" + semana + "]";
	}



	public static void main(String[] args) {


		//creamos la lista, para pasarla por parametro
		ArrayList<Temperatura> lista = new ArrayList<Temperatura>();

		Temperatura llamaMetodos = new Temperatura();



		Scanner terminal = new Scanner(System.in);
		
		//creamos variables 
		int menu;
		String salir;
		
		//primero nos aseguramos que rellena las temperaturas
		Temperatura.rellenar(lista);
		System.out.println(lista);



		System.out.println("Bienvenido al menú, introduce el número de la acción que deseas ejecutar: ");

		System.out.println("1. Mostrar las temperaturas.");
		System.out.println("2. Visualizar la temperatura media del mes.");
		System.out.println("3. Día o días más calurosos del mes.");
		
		
	
	
	do {
		
		System.out.println("Introduce un numero: ");
		 menu= terminal.nextInt();
		 terminal.nextLine(); // Consumir el carácter

		switch(menu) {
		case 1: llamaMetodos.mostrarTemperaturas(lista);
		break;
		case 2: System.out.println(Temperatura.promedio(lista));
		break;

		case 3: System.out.println("El dia más caluroso es");
		System.out.println(Temperatura.masCalor(lista));

		System.out.println("El dia menos caluroso es");
		System.out.println(Temperatura.menosCalor(lista));
		break; 
		}
		
		System.out.println("¿Desea ejecurar otra opción del menú? (si/no)");
		salir = terminal.nextLine();
		
	}while(salir.equalsIgnoreCase("si"));
	
	System.out.println("FIN");
	

		//metodo que no termina de funcionar correctamente.
		System.out.println(conocerTemperatura(lista,1));



	}





}
