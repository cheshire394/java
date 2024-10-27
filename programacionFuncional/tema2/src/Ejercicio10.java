import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) { 
		//Invocamos a la biblioteca java:
		Scanner terminal = new Scanner(System.in);
		
		//pedimos al usuario que ingrese dos números y definimos la variable como integer:
		System.out.println("Intruduce un primer número :");
		int num1 = terminal.nextInt();
		System.out.println("Intruduce un segundo número :");
		int num2 = terminal.nextInt();
		//Cerramos terminal:
		terminal.close();
		
		//Programa que lee dos números (no necesariamente distintos) y los
		//escribe ordenados
		
		// zona de operaciones: vamos a generar una lista, y después la vamos ordenar. 
		// En primer lugar las variables de las listas tienen que estar defirnidas. Ordenar es el nombre de la lista,
		// aquello que aparece entre paréntesis son los elementos que conforman la lista.
		
		int [] ordenar = {num1, num2};
		//vamos a pedirle a java, que los elementos de la lista ordenar, sean ordenados de menor a mayor:
		// para ello utilizaremos el método short.
		Arrays.sort(ordenar);
		//ahora vamos a imprimir los resultados:
		 System.out.println(Arrays.toString(ordenar));

	}

}
