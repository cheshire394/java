import java.util.*;
public class Ejercicio15 { 

	public static void main(String[] args) {
		//invocamos a la libreria java
		Scanner terminal = new Scanner (System.in);

		//pedimos al usuario que inserte su categoría y sección y definimos las variables como char.
		System.out.println("Introduce la categoría a la que perteneces: a, b, c : ");

		//Aquí aparece la primera complicación del ejercicio: java No Admite nextChar(), tenemos que alargar el código
		// utilizamos para ello next().charAt("aqui va el número de la cadena que ocupa en este caso es 0").
		char categoria = terminal.next().charAt(0);
		int sueldo = 1100;


		// como categoria A Y B cobran los mismo, se va a ejercutar la misma parte de código independientemente de que sea A o B:
		if (categoria == 'a'|| categoria == 'A' || categoria == 'b'|| categoria == 'B') {
			//definimos la variale trimestre para contabilizarlo dependiendo del mes que sea con Switch:
			int trimestre = 240;
			System.out.println("Introduce el número de mes en el que  estamos del 1, 2, 3, 4 al 12 : ");
			// asociamos la variable mes a terminal como integer para que el usuario introduzca el mes correspondiente asociado a su número:
			int mes = terminal.nextInt();

			int total = trimestre + sueldo;
			switch (mes) {
			case 1:
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 2: 
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 3:
				System.out.println("tu salario es de "+sueldo + " la paga trimestral de Marzo "+ trimestre + " el total es: "+total);
				break;
			case 4: 
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 5:
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 6:
				System.out.println("tu salario es de "+sueldo + " la paga trimestral de Junio es de "+ trimestre + " el total es: "+total);
				break;
			case 7: 
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 8: 
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 9 :
				System.out.println("tu salario es de "+sueldo + " la paga trimestral de Septiembre es de "+ trimestre + " el total es :"+total);
				break;
			case 10:
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 11:
				System.out.println("tu salario es de "+sueldo + " este mes no corresponde paga trimestral");
				break;
			case 12:
				System.out.println("tu salario es de "+sueldo + " la paga trimestral de Diciembre es de "+ trimestre + " el total es de: "+total);
				break;
			default: 
				System.out.println("número introducido no es válido, recuerda que debe de se del 1 al 12");
			}



		}

		/*Como los trabajadosres de la categoría C se dividen en dos secciones, en el caso de que el trabajador sea de la
		 categoría C, se va a ejecutar está parte de código, sino, está parte será omitida.*/
		else if (categoria == 'c'|| categoria == 'C') {
			


			//introduce los dias trabajados:
			System.out.println("Introduce los días a trabajados: ");
			int dias = terminal.nextInt();

			//introcuce las faltas:
			System.out.println("Introduce los días faltados injustificadamente: ");
			
			int faltas = terminal.nextInt();
			//definimos la variable seccion y la iniciamos con terminal:
			System.out.println("Introduce la seccion C a la que perteneces: 1 o 2  ");
			int seccion = terminal.nextInt();

			if (seccion == 1) {
				double salario = 1100  + (dias * 0.50) - (faltas * 30);
				System.out.println("El sueldo total para la categoria C, sección 1 es de : "+salario);
			}
			else if  (seccion == 2) {
				double salario = 1100  + (dias * 1.20) - (faltas * 10);
				System.out.println("El sueldo total para la categoria C, sección 2 es de : "+salario);
			}

		}
		else {
			System.out.println("Categoria introducida No válida, por favor ingrese: a, b, o c");
	}

	/*15. Una empresa tiene trabajadores de categorías A, B y C. El sueldo por
mes trabajado es de 1100€. Además, cobran todos por trimestre un
suplemento de 240€, excepto los de categoría C. De éstos, en la sección1ª están los contratados por días, que cobran un suplemento de 0.5 €
por día trabajado y se les descuenta 30 € por baja injustificada. El resto
de las secciones de esta categoría cobra 1.20€ de suplemento por día
trabajado y se les descuenta 10€ por baja injustificada. Programa que
lee los datos de un trabajador (tendrás que leer los datos que necesites
en función de la categoría y la sección) y nos calcula su sueldo final. */
	//ESQUEMA
	// a = 1100 + 240(trimestrales)
	// b = 1100 + 240(trimestrales)
	// c1 = 1100 + 0.50 * dia trabajado - 30 euros por falta injustificada.
	// c2 = 1100 + 1.20 * dia trabajado - 10 euros por falta injustificada.
	// sueldo final según cateforia y sección.

}

}
